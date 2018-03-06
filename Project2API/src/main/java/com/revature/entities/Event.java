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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
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
	private Status status;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "genre_id")
	private Genre genre;

}
