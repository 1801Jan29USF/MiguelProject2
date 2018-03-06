package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {

	@Id
	@Column(name = "genre_id")
	private int genre_id;

	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getGenre_type() {
		return genre_type;
	}

	public void setGenre_type(String genre_type) {
		this.genre_type = genre_type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + genre_id;
		result = prime * result + ((genre_type == null) ? 0 : genre_type.hashCode());
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
		Genre other = (Genre) obj;
		if (genre_id != other.genre_id)
			return false;
		if (genre_type == null) {
			if (other.genre_type != null)
				return false;
		} else if (!genre_type.equals(other.genre_type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Genre [genre_id=" + genre_id + ", genre_type=" + genre_type + "]";
	}

	public Genre(int genre_id, String genre_type) {
		super();
		this.genre_id = genre_id;
		this.genre_type = genre_type;
	}

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String genre_type;

}
