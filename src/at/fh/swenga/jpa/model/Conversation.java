package at.fh.swenga.jpa.model;

import java.util.Calendar;

public class Conversation {
	
	private UserModel partner;
	private Calendar timestamp;
	private String lastMessage;
	
	public Conversation(UserModel partner, Calendar timestamp, String lastMessage) {
		super();
		this.partner = partner;
		this.timestamp = timestamp;
		this.lastMessage = lastMessage;
	}
	
	public Conversation(MessageModel message, UserModel user) {
		super();
		this.partner = message.getSender().equals(user) ? message.getRecipient() : message.getSender();
		this.timestamp = message.getTimestamp();
		this.lastMessage = message.getText();
	}

	public UserModel getPartner() {
		return partner;
	}

	public void setPartner(UserModel partner) {
		this.partner = partner;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public String getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partner == null) ? 0 : partner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conversation other = (Conversation) obj;
		if (partner == null) {
			if (other.partner != null)
				return false;
		} else if (!partner.equals(other.partner))
			return false;
		return true;
	}
	
	
	
}
