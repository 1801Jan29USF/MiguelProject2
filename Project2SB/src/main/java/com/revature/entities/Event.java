package com.revature.entities;

import java.io.File;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "event")
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
	private String phone_number;

	private File attachment;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "type_id")
	private Type type;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id")
	private Status status;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "genre_id")
	private Genre genre;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "host_id")
	private User host_id;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public User getHost_id() {
		return host_id;
	}

	public void setHost_id(User host_id) {
		this.host_id = host_id;
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
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((host_id == null) ? 0 : host_id.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (host_id == null) {
			if (other.host_id != null)
				return false;
		} else if (!host_id.equals(other.host_id))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_name=" + event_name + ", description=" + description
				+ ", event_location=" + event_location + ", date_and_time=" + date_and_time + ", capacity=" + capacity
				+ ", phone_number=" + phone_number + ", attachment=" + attachment + ", type=" + type + ", status="
				+ status + ", genre=" + genre + ", host_id=" + host_id + "]";
	}

	public Event(int event_id, String event_name, String description, String event_location, String date_and_time,
			int capacity, String phone_number, File attachment, Type type, Status status, Genre genre, User host_id) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.description = description;
		this.event_location = event_location;
		this.date_and_time = date_and_time;
		this.capacity = capacity;
		this.phone_number = phone_number;
		this.attachment = attachment;
		this.type = type;
		this.status = status;
		this.genre = genre;
		this.host_id = host_id;
	}

}