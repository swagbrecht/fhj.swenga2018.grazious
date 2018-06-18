package at.fh.swenga.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.GenderModel;

@Repository
public interface GenderRepository extends JpaRepository<GenderModel, Integer> {}
