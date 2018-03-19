package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_event")
public class UsersEvents {

	@Id
	@Column(name = "user_id")
	private int userid;

	@Column(name = "event_id")
	private int eventid;

	public UsersEvents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersEvents(int userid, int eventid) {
		super();
		this.userid = userid;
		this.eventid = eventid;
	}

	@Override
	public String toString() {
		return "UsersEvents [userid=" + userid + ", eventid=" + eventid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eventid;
		result = prime * result + userid;
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
		UsersEvents other = (UsersEvents) obj;
		if (eventid != other.eventid)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

}
