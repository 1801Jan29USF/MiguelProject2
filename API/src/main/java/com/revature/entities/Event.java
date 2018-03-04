package com.revature.entities;

import java.io.File;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class Event {

	@Id
	@Column(name = "event_id")
	@SequenceGenerator(name = "event_id_seq", sequenceName = "event_id_seq")
	@GeneratedValue(generator = "event_id_seq", strategy = GenerationType.AUTO)
	private int event_id;

	@Column(name = "event_name")
	private String event_name;
	private String description;
	private String event_location;
	private String date_and_time;
	private int capacity;
	private int phone_number;
	private File attachment;
	private int phonenumber;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "type_id")
	private int type;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id")
	private int status;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "genre_id")
	private int genre;

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_name=" + event_name + ", description=" + description
				+ ", event_location=" + event_location + ", date_and_time=" + date_and_time + ", capacity=" + capacity
				+ ", phone_number=" + phone_number + ", attachment=" + attachment + ", phonenumber=" + phonenumber
				+ ", type=" + type + ", status=" + status + ", genre=" + genre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((date_and_time == null) ? 0 : date_and_time.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + event_id;
		result = prime * result + ((event_location == null) ? 0 : event_location.hashCode());
		result = prime * result + ((event_name == null) ? 0 : event_name.hashCode());
		result = prime * result + genre;
		result = prime * result + phone_number;
		result = prime * result + phonenumber;
		result = prime * result + status;
		result = prime * result + type;
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
		Event other = (Event) obj;
		if (attachment == null) {
			if (other.attachment != null)
				return false;
		} else if (!attachment.equals(other.attachment))
			return false;
		if (capacity != other.capacity)
			return false;
		if (date_and_time == null) {
			if (other.date_and_time != null)
				return false;
		} else if (!date_and_time.equals(other.date_and_time))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (event_id != other.event_id)
			return false;
		if (event_location == null) {
			if (other.event_location != null)
				return false;
		} else if (!event_location.equals(other.event_location))
			return false;
		if (event_name == null) {
			if (other.event_name != null)
				return false;
		} else if (!event_name.equals(other.event_name))
			return false;
		if (genre != other.genre)
			return false;
		if (phone_number != other.phone_number)
			return false;
		if (phonenumber != other.phonenumber)
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEvent_location() {
		return event_location;
	}

	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}

	public String getDate_and_time() {
		return date_and_time;
	}

	public void setDate_and_time(String date_and_time) {
		this.date_and_time = date_and_time;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public Event(int event_id, String event_name, String description, String event_location, String date_and_time,
			int capacity, int phone_number, File attachment, int phonenumber, int type, int status, int genre) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.description = description;
		this.event_location = event_location;
		this.date_and_time = date_and_time;
		this.capacity = capacity;
		this.phone_number = phone_number;
		this.attachment = attachment;
		this.phonenumber = phonenumber;
		this.type = type;
		this.status = status;
		this.genre = genre;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

}
