package at.fh.swenga.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.UserRoleModel;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleModel, Integer> {}
