package at.fh.swenga.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.PhotoModel;
import at.fh.swenga.jpa.model.UserModel;

@Repository
public interface PhotoRepository extends JpaRepository<PhotoModel, Integer> {
	
	public List<PhotoModel> findAllByUser(UserModel user);
	
}
