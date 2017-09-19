package com.epam.spring.core.movietheater.service.impl;

import java.util.List;

import com.epam.spring.core.movietheater.model.Auditorium;
import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.EventRating;
import com.epam.spring.core.movietheater.model.Ticket;
import com.epam.spring.core.movietheater.model.User;
import com.epam.spring.core.movietheater.service.AuditoriumService;
import com.epam.spring.core.movietheater.service.BookingService;
import com.epam.spring.core.movietheater.service.DiscountService;
import com.epam.spring.core.movietheater.service.TicketService;

public class BookingServiceImpl implements BookingService {
	private double VIP_SEAT_SURGE = 1.2;
	private double HIGH_RATING_SURGE = 2.0;

	private AuditoriumService auditoriumService;
	private DiscountService discountService;
	private TicketService ticketService;

	public BookingServiceImpl(AuditoriumService auditoriumService, DiscountService discountService,
			TicketService ticketService) {
		super();
		this.auditoriumService = auditoriumService;
		this.discountService = discountService;
		this.ticketService = ticketService;
	}


	@Override
	public double getTicketsPrice(Event event, User user, List<Integer> seats) {
		double basePrice = event.getBasePrice();
		EventRating eventRating = event.getEventRating();
		String auditName = event.getAuditName();
		Auditorium where = auditoriumService.getByName(auditName);

		double totalCost = 0.0;
		for (int seat : seats)
			totalCost += adjustTicketPrice(basePrice, where, eventRating, seat);

		int numberOfTickets = seats.size();
		totalCost -= discountService.getDiscount(user, event, numberOfTickets);

		return totalCost;
	}
	
	@Override
	public void bookTickets(List<Ticket> tickets, User user) {
		for (Ticket ticket : tickets) {
			int ticketId = ticketService.save(ticket);
			user.bookTicket(ticketId);
		}
	}

	private double adjustTicketPrice(double basePrice, Auditorium auditorium, EventRating rating, int seat) {
		List<Integer> vipSeats = auditorium.getVipSeatNumbers();

		double adjustedPrice = basePrice;
		if (vipSeats.contains(seat))
			adjustedPrice *= VIP_SEAT_SURGE;
		if (EventRating.HIGH.equals(rating))
			adjustedPrice *= HIGH_RATING_SURGE;

		return adjustedPrice;
	}


}
