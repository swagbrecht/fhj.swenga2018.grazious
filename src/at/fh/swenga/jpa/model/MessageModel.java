package at.fh.swenga.jpa.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "message")
public class MessageModel implements java.io.Serializable {
	
	private static final long serialVersionUID = 8098173157518993615L;
	
	@ManyToOne
	private UserModel sender;

	@ManyToOne
	private UserModel recipient;
	
	@Id
	@Column(name = "messageId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer messageId;
	
	@Lob
	@Size(min = 1)
	@Column(name = "text", nullable = false)
	private String text;

	@Temporal(TemporalType.DATE)
	@Column(name = "timestamp", nullable = false)
	private Calendar timestamp;
	
	public MessageModel() {
		super();
	}

	public MessageModel(UserModel sender, UserModel recipient, String text) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
		this.timestamp = Calendar.getInstance();
	}

	public MessageModel(UserModel sender, UserModel recipient, String text, Calendar timestamp) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
		this.timestamp = timestamp;
	}

	public UserModel getSender() {
		return sender;
	}

	public void setSender(UserModel sender) {
		this.sender = sender;
	}

	public UserModel getRecipient() {
		return recipient;
	}

	public void setRecipient(UserModel recipient) {
		this.recipient = recipient;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "MessageModel [sender=" + sender + ", recipient=" + recipient + ", text=" + text + "]";
	}
	
}