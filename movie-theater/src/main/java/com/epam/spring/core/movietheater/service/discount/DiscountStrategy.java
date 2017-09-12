package com.epam.spring.core.movietheater.service.discount;

import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.User;

public interface DiscountStrategy {
	int evaluateDiscount(User user, Event event, int numberOfSeats);
}
