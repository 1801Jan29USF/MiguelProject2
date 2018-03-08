package com.revature.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private User address_id;

	public User getAddress_id() {
		return address_id;
	}

	public void setAddress_id(User address_id) {
		this.address_id = address_id;
	}

	public String getAddress_street() {
		return address_street;
	}

	public void setAddress_street(String address_street) {
		this.address_street = address_street;
	}

	public String getAddress_city() {
		return address_city;
	}

	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}

	public String getAddress_state() {
		return address_state;
	}

	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}

	public String getAddress_zipcode() {
		return address_zipcode;
	}

	public void setAddress_zipcode(String address_zipcode) {
		this.address_zipcode = address_zipcode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_city == null) ? 0 : address_city.hashCode());
		result = prime * result + ((address_id == null) ? 0 : address_id.hashCode());
		result = prime * result + ((address_state == null) ? 0 : address_state.hashCode());
		result = prime * result + ((address_street == null) ? 0 : address_street.hashCode());
		result = prime * result + ((address_zipcode == null) ? 0 : address_zipcode.hashCode());
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
		Address other = (Address) obj;
		if (address_city == null) {
			if (other.address_city != null)
				return false;
		} else if (!address_city.equals(other.address_city))
			return false;
		if (address_id == null) {
			if (other.address_id != null)
				return false;
		} else if (!address_id.equals(other.address_id))
			return false;
		if (address_state == null) {
			if (other.address_state != null)
				return false;
		} else if (!address_state.equals(other.address_state))
			return false;
		if (address_street == null) {
			if (other.address_street != null)
				return false;
		} else if (!address_street.equals(other.address_street))
			return false;
		if (address_zipcode == null) {
			if (other.address_zipcode != null)
				return false;
		} else if (!address_zipcode.equals(other.address_zipcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address_street=" + address_street + ", address_city="
				+ address_city + ", address_state=" + address_state + ", address_zipcode=" + address_zipcode + "]";
	}

	public Address(User address_id, String address_street, String address_city, String address_state,
			String address_zipcode) {
		super();
		this.address_id = address_id;
		this.address_street = address_street;
		this.address_city = address_city;
		this.address_state = address_state;
		this.address_zipcode = address_zipcode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String address_street;
	private String address_city;
	private String address_state;
	private String address_zipcode;
}
