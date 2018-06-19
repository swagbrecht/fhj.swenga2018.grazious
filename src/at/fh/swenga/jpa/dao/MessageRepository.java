package at.fh.swenga.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.fh.swenga.jpa.model.MessageModel;
import at.fh.swenga.jpa.model.UserModel;

@Repository
public interface MessageRepository extends JpaRepository<MessageModel, Integer> {
	
	List<MessageModel> findAllBySender(UserModel sender);
	List<MessageModel> findAllByRecipient(UserModel recipient);
	List<MessageModel> findAllBySenderAndRecipient(UserModel sender, UserModel recipient);
	
}
