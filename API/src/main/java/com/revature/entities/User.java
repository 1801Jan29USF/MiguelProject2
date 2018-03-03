package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//@NamedQueries({
//		@NamedQuery(name = "findByHoneyAmountGreaterThan", query = "FROM user WHERE honeyPot.honeyAmount > :amount") })

@Entity
public class User {

	@Id
	@Column(name = "user_ID")
	@SequenceGenerator(name = "userID_SEQ", sequenceName = "userID_SEQ")
	@GeneratedValue(generator = "userID_SEQ", strategy = GenerationType.AUTO)
	private int userId;

//	@Column(name = "user_COLOR")
//	private String userColor;
//	private String breed;
//	private double weight;
//	private double height;
//
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "cave_id")
//	private Cave dwelling;
//
//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "HONEYPOT_ID")
//	private HoneyPot honeyPot;
//
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "PARENT_CUB", joinColumns = @JoinColumn(name = "PARENT_ID"), inverseJoinColumns = @JoinColumn(name = "CUB_ID"))
//	private Set<user> cubs;

}
