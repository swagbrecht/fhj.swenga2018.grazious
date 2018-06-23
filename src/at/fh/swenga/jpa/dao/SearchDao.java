package at.fh.swenga.jpa.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.GenderModel;
import at.fh.swenga.jpa.model.RegionModel;
import at.fh.swenga.jpa.model.UserModel;

@Repository
public class SearchDao {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public List<UserModel> getUsers(GenderModel[] genders, RegionModel[] regions, Integer ageFrom, Integer ageTo) {
		String sql = "";
		
		if (genders == null || regions == null)
			return (new ArrayList<UserModel>());
		
		if (ageFrom != null)
			sql += " AND (DATEDIFF(NOW(), u.birthday) / 365) >= " + ageFrom;
		if (ageTo != null)
			sql += " AND (DATEDIFF(NOW(), u.birthday) / 365) <= " + ageTo;
		
		TypedQuery<UserModel> query = entityManager.createQuery("SELECT u FROM UserModel u WHERE u.gender IN (:genders) AND u.region IN (:regions)" + sql, UserModel.class);
		query.setParameter("genders", Arrays.asList(genders));
		query.setParameter("regions", Arrays.asList(regions));
		
		return query.getResultList();
	}

}
