package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_type")
public class Type {

	@Id
	@Column(name = "event_type_id")
	private int event_type_id;

	private String event_type;

	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(int event_type_id, String event_type) {
		super();
		this.event_type_id = event_type_id;
		this.event_type = event_type;
	}

	@Override
	public String toString() {
		return "Type [event_type_id=" + event_type_id + ", event_type=" + event_type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((event_type == null) ? 0 : event_type.hashCode());
		result = prime * result + event_type_id;
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
		Type other = (Type) obj;
		if (event_type == null) {
			if (other.event_type != null)
				return false;
		} else if (!event_type.equals(other.event_type))
			return false;
		if (event_type_id != other.event_type_id)
			return false;
		return true;
	}

	public int getEvent_type_id() {
		return event_type_id;
	}

	public void setEvent_type_id(int event_type_id) {
		this.event_type_id = event_type_id;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

}
