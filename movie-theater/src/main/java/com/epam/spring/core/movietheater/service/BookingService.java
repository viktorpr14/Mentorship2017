package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.Ticket;
import com.epam.spring.core.movietheater.model.User;

public interface BookingService {

	double getTicketsPrice(Event event, User user, List<Integer> seats);

	void bookTickets(List<Ticket> tickets, User user);

}