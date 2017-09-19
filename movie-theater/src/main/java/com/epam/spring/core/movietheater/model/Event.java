package com.epam.spring.core.movietheater.model;

import java.time.LocalDateTime;

public class Event {
	private int id;
	private String name;
	private double basePrice;
	private EventRating eventRating;
	private LocalDateTime airDateTime;

	private String auditName;

	public Event(String name, double basePrice, EventRating eventRating) {
		super();
		this.name = name;
		this.basePrice = basePrice;
		this.eventRating = eventRating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public EventRating getEventRating() {
		return eventRating;
	}

	public void setEventRating(EventRating eventRating) {
		this.eventRating = eventRating;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public LocalDateTime getAirDateTime() {
		return airDateTime;
	}

	public void setAirDateTime(LocalDateTime airDateTime) {
		this.airDateTime = airDateTime;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ", eventRating=" + eventRating
				+ ", airDateTime=" + airDateTime + ", auditName=" + auditName + "]";
	}
}
