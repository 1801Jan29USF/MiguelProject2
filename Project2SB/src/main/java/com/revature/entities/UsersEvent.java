package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users_event")
public class UsersEvent {

	@ManyToMany(fetch = FetchType.EAGER)
	@Column(name = "user_id")
	private int userid;

	@ManyToMany(fetch = FetchType.EAGER)
	@Column(name = "event_id")
	private int eventid;

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
		UsersEvent other = (UsersEvent) obj;
		if (eventid != other.eventid)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsersEvent [userid=" + userid + ", eventid=" + eventid + "]";
	}

	public UsersEvent(int userid, int eventid) {
		super();
		this.userid = userid;
		this.eventid = eventid;
	}

	public UsersEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
}
