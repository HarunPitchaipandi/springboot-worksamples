package com.example.demo.user;
import com.example.demo.location.Location;

public class User {
	
	public User(String id, String firstname, String lastname, Location location, String email) {
		
		super();
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.setLocation(location.getId());
		this.setLocation(location.getName());
		this.email=email;		
	}
	
	private String id;
	private String firstname;
	private String lastname;
	private String location;
	private String email;	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
