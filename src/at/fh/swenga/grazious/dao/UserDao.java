

package at.fh.swenga.grazious.dao;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import at.fh.swenga.grazious.model.UserModel;
 
@Repository
@Transactional
public class UserDao {
 
	@PersistenceContext
	protected EntityManager entityManager;
 
	public List<UserModel> getUsers() {
		TypedQuery<UserModel> typedQuery = entityManager.createQuery("select u from UserModel u",
				UserModel.class);
		List<UserModel> typedResultList = typedQuery.getResultList();
		return typedResultList;
	}
 
	public List<UserModel> searchUserAllgemein(String searchString) {
		TypedQuery<UserModel> typedQuery = entityManager.createQuery(
				"select u from UserModel u where u.vn like :search or u.nn like :search",
				UserModel.class);
		typedQuery.setParameter("search", "%" + searchString + "%");
		List<UserModel> typedResultList = typedQuery.getResultList();
		return typedResultList;
	}
 
	public UserModel getUser(int i) throws DataAccessException {
		return entityManager.find(UserModel.class, i);
	}
 
	public void persist(UserModel userModel) {
		entityManager.persist(userModel);
	}
 
	public UserModel merge(UserModel user) {
		return entityManager.merge(user);
	}
 
	public void delete(UserModel user) {
		entityManager.remove(user);
	}
 
	public int deleteAllEmployees() {
		int count = entityManager.createQuery("DELETE FROM EmployeeModel").executeUpdate();
		return count;
	}
 
	public void delete(int id) {
		UserModel userAllgemein = getUser(id);
		if (userAllgemein != null)
			delete(userAllgemein);
	}
}