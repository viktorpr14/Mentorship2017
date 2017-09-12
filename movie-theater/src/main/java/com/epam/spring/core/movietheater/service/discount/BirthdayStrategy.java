package com.epam.spring.core.movietheater.service.discount;

import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.User;

public class BirthdayStrategy implements DiscountStrategy {
	private int withinDays;
	private int discount;
	
	public BirthdayStrategy(int withinDays, int discount) {
		super();
		this.withinDays = withinDays;
		this.discount = discount;
	}
	@Override
	public int evaluateDiscount(User user, Event event, int numberOfSeats) {
		int durationDays = event.getAirDateTime().getDayOfYear() -
				user.getBirthday().getDayOfYear();
		if(durationDays <= withinDays)
			return discount;
		else
			return 0;
	}
}
