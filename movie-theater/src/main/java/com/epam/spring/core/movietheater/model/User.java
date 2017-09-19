package com.epam.spring.core.movietheater.model;

import java.time.LocalDate;
import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthday;
	
	private List<Integer> bookedTicketIds;
	
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void bookTicket(int ticketId) {
		bookedTicketIds.add(ticketId);
	}
	
	public int cntOfBookedTickets() {
		return bookedTicketIds.size();
	}
}
