package com.retailoutlet.controller;

import java.util.List;

import com.retailoutlet.domain.DiscountRule;
import com.retailoutlet.generator.DiscountRuleGenerator;

public class SlabBasedDiscountCalculator implements DiscountCalculator{
	
	private DiscountRuleGenerator discountRuleGenerator;
	

	public SlabBasedDiscountCalculator(DiscountRuleGenerator discountRuleGenerator) {
		super();
		this.discountRuleGenerator = discountRuleGenerator;
	}


	@Override
	public double applyDiscount(double purchaseAmount) {
		// TODO Auto-generated method stub
		double total_discount = 0 ; 
		
		List<DiscountRule> discountRules  = this.discountRuleGenerator.getDiscountRule();
		if(discountRules != null && !discountRules.isEmpty()){
			
			DiscountRule baseDiscountRule = discountRules.get(0);
			if(purchaseAmount <= baseDiscountRule.getLowerBound()){
				return purchaseAmount;
			}
			
			for(DiscountRule discountRule : discountRules){
						
				
				if(!Double.isNaN(discountRule.getUpperBound()) && purchaseAmount <= discountRule.getUpperBound()){	
					
					if(!Double.isNaN(discountRule.getPercentageDiscount())){												
						total_discount = total_discount + ((purchaseAmount - discountRule.getLowerBound()) * discountRule.getPercentageDiscount());			
					}
								
					break;
					
				}else{
					
					if(Double.isNaN(discountRule.getUpperBound())){
						
						if(!Double.isNaN(discountRule.getPercentageDiscount())){												
							total_discount = total_discount + ((purchaseAmount - discountRule.getLowerBound()) * discountRule.getPercentageDiscount());		
						}						

					}else{
						
						if(!Double.isNaN(discountRule.getPercentageDiscount())){												
							total_discount = total_discount + ((discountRule.getUpperBound() - discountRule.getLowerBound()) * discountRule.getPercentageDiscount());
						}						
						
					}					
					
				}
				
			}
			
			return purchaseAmount - total_discount;
						
		}else{
			return purchaseAmount;
		}
						
		
	}

}
