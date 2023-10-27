package frescoPlay.SpringSecurity.Handson.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Hospital {

	@Id

	public int getId() {

		return id;

	}

	public Hospital() {

		super();

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public Hospital(int id, String name, String city, double rating) {

		super();

		this.id = id;

		this.name = name;

		this.city = city;

		this.rating = rating;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	public double getRating() {

		return rating;

	}

	public void setRating(double rating) {

		this.rating = rating;

	}

	private int id;

	private String name;

	private String city;

	private double rating;

}