

package at.fh.swenga.grazious.dao;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import at.fh.swenga.grazious.model.UserAllgemeinModel;
 
@Repository
@Transactional
public class UserDao {
 
	@PersistenceContext
	protected EntityManager entityManager;
 
	public List<UserAllgemeinModel> getUserAllgemeins() {
		TypedQuery<UserAllgemeinModel> typedQuery = entityManager.createQuery("select u from UserAllgemeinModel u",
				UserAllgemeinModel.class);
		List<UserAllgemeinModel> typedResultList = typedQuery.getResultList();
		return typedResultList;
	}
 
	public List<UserAllgemeinModel> searchUserAllgemein(String searchString) {
		TypedQuery<UserAllgemeinModel> typedQuery = entityManager.createQuery(
				"select u from EmployeeModel u where u.vn like :search or u.nn like :search",
				UserAllgemeinModel.class);
		typedQuery.setParameter("search", "%" + searchString + "%");
		List<UserAllgemeinModel> typedResultList = typedQuery.getResultList();
		return typedResultList;
	}
 
	public UserAllgemeinModel getUserAllgemeins(int i) throws DataAccessException {
		return entityManager.find(UserAllgemeinModel.class, i);
	}
 
	public void persist(UserAllgemeinModel userAllgemein) {
		entityManager.persist(userAllgemein);
	}
 
	public UserAllgemeinModel merge(UserAllgemeinModel userAllgemein) {
		return entityManager.merge(userAllgemein);
	}
 
	public void delete(UserAllgemeinModel userAllgemein) {
		entityManager.remove(userAllgemein);
	}
 
	public int deleteAllEmployees() {
		int count = entityManager.createQuery("DELETE FROM EmployeeModel").executeUpdate();
		return count;
	}
 
	public void delete(int id) {
		UserAllgemeinModel userAllgemein = getUserAllgemeins(id);
		if (userAllgemein != null)
			delete(userAllgemein);
	}
}