package at.fh.swenga.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.PhotoModel;

@Repository
public interface PhotoRepository extends JpaRepository<PhotoModel, Integer> {}
