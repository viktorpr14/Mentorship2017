package com.epam.spring.core.movietheater.model;

public class Ticket {
	private int id;
	private int eventId;
	private int seat;
	private int userId;

	public Ticket(int eventId, int seat, int userId) {
		super();
		this.eventId = eventId;
		this.seat = seat;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Ticket [eventId=" + eventId + ", seat=" + seat + ", userId=" + userId + "]";
	}

}
