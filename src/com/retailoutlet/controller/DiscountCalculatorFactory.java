package com.retailoutlet.controller;

import com.retailoutlet.domain.CustomerType;
import com.retailoutlet.generator.DiscountRuleGenerator;
import com.retailoutlet.generator.GeneralDiscountRuleGenerator;
import com.retailoutlet.generator.PremiumDiscountRuleGenerator;

public class DiscountCalculatorFactory {

	public static DiscountCalculator getDiscountCalculator(CustomerType customerType){
	
		DiscountCalculator discountCalculator = null; 
		DiscountRuleGenerator discountRuleGenerator = null;
		
		if(customerType == CustomerType.PREMIUM){
			
			discountRuleGenerator = new PremiumDiscountRuleGenerator();
			discountCalculator = new SlabBasedDiscountCalculator(discountRuleGenerator);
			
		}else if(customerType == CustomerType.REGULAR){
			
			discountRuleGenerator = new GeneralDiscountRuleGenerator();
			discountCalculator = new SlabBasedDiscountCalculator(discountRuleGenerator);
			
		}
		
		return discountCalculator;
		
	}

}
