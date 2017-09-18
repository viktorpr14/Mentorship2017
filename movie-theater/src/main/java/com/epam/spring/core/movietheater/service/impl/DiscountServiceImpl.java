package com.epam.spring.core.movietheater.service.impl;

import java.util.List;

import com.epam.spring.core.movietheater.discount.DiscountStrategy;
import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.User;
import com.epam.spring.core.movietheater.service.DiscountService;

public class DiscountServiceImpl implements DiscountService {
	private List<DiscountStrategy> discountStrategies;
	
	
	
	public DiscountServiceImpl() {
	}

	public DiscountServiceImpl(List<DiscountStrategy> discountStrategies) {
		super();
		this.discountStrategies = discountStrategies;
	}

	@Override
	public double getDiscount(User user, Event event, int numberOfTickets) {	
		return 0.0;
	}

}
