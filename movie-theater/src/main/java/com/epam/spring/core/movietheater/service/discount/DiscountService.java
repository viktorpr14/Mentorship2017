package com.epam.spring.core.movietheater.service.discount;

import java.util.List;

import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.model.User;

public class DiscountService {
	private List<DiscountStrategy> discountStrategies;
	
	public DiscountService(List<DiscountStrategy> discountStrategies) {
		super();
		this.discountStrategies = discountStrategies;
	}

	public double getDiscount(User user, Event event, int numberOfTickets) {	
		double maxDiscount = 0.0;
		for(DiscountStrategy discountStrategy : discountStrategies) {
			double currentDiscount = discountStrategy.evaluateDiscount(user, event, numberOfTickets);
			if(currentDiscount > maxDiscount)
				maxDiscount = currentDiscount;
		}
		return maxDiscount;
	}

}
