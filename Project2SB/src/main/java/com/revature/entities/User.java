package com.revature.entities;

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
@Table(name = "users")
public class User {

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", role=" + role + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", username=" + username + ", user_password=" + user_password + ", bio=" + bio + ", email=" + email
				+ ", phone_number=" + phone_number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bio == null) ? 0 : bio.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (bio == null) {
			if (other.bio != null)
				return false;
		} else if (!bio.equals(other.bio))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public User(int user_id, Role role, String first_name, String last_name, String username, String user_password,
			String bio, String email, String phone_number) {
		super();
		this.user_id = user_id;
		this.role = role;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.user_password = user_password;
		this.bio = bio;
		this.email = email;
		this.phone_number = phone_number;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name = "user_id")
	@SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq")
	@GeneratedValue(generator = "user_id_seq", strategy = GenerationType.AUTO)
	private int user_id;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private Role role;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	private String first_name;
	private String last_name;
	private String username;
	private String user_password;
	private String bio;
	private String email;
	private String phone_number;


}