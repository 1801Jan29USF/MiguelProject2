package com.revature.entities;

import java.io.File;

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
	@SequenceGenerator(name = "event_id_seq", sequenceName = "event_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "event_id_seq", strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "event_name")
	private String eventname;

	private String description;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "location_id")
	private Address location;

	@Column(name = "date_and_time")
	private String dateandtime;

	private int capacity;

	@Column(name = "phone_number")
	private String phonenumber;

	private File attachment;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_id")
	private Type type;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id")
	private Status status;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "genre_id")
	private Genre genre;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "host_id")
	private User host;

	@Column(name = "attending")
	private int attending;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int id, String eventname, String description, Address location, String dateandtime, int capacity,
			String phonenumber, File attachment, Type type, Status status, Genre genre, User host, int attending) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.description = description;
		this.location = location;
		this.dateandtime = dateandtime;
		this.capacity = capacity;
		this.phonenumber = phonenumber;
		this.attachment = attachment;
		this.type = type;
		this.status = status;
		this.genre = genre;
		this.host = host;
		this.attending = attending;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventname=" + eventname + ", description=" + description + ", location="
				+ location + ", dateandtime=" + dateandtime + ", capacity=" + capacity + ", phonenumber=" + phonenumber
				+ ", attachment=" + attachment + ", type=" + type + ", status=" + status + ", genre=" + genre
				+ ", host=" + host + ", attending=" + attending + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + attending;
		result = prime * result + capacity;
		result = prime * result + ((dateandtime == null) ? 0 : dateandtime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((eventname == null) ? 0 : eventname.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
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
		if (attending != other.attending)
			return false;
		if (capacity != other.capacity)
			return false;
		if (dateandtime == null) {
			if (other.dateandtime != null)
				return false;
		} else if (!dateandtime.equals(other.dateandtime))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventname == null) {
			if (other.eventname != null)
				return false;
		} else if (!eventname.equals(other.eventname))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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

	public User getHost() {
		return host;
	}

	public void setHost(User host) {
		this.host = host;
	}

	public int getAttending() {
		return attending;
	}

	public void setAttending(int attending) {
		this.attending = attending;
	}

}