package com.epam.spring.core.movietheater.service;

import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.User;

public interface DiscountService {

	double getDiscount(User user, Event event, int numberOfTickets);

}