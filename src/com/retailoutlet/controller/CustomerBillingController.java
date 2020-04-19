package com.retailoutlet.controller;

import com.retailoutlet.domain.CustomerType;

public class CustomerBillingController {

	
	public double getBillingAmount(CustomerType customerType,float purchaseAmount){
		
		DiscountCalculator discountCalculator = DiscountCalculatorFactory.getDiscountCalculator(customerType);
		double billingAmount = discountCalculator.applyDiscount(purchaseAmount);		
		return billingAmount;
		
		
	}
	
	
	
}
