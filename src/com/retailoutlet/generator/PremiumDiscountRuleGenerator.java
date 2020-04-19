package com.retailoutlet.generator;

import java.util.ArrayList;
import java.util.List;

import com.retailoutlet.domain.DiscountRule;

public class PremiumDiscountRuleGenerator implements DiscountRuleGenerator {

	@Override
	public List<DiscountRule> getDiscountRule() {
		// TODO Auto-generated method stub
		//return null;
		
		List<DiscountRule> discountRules = new ArrayList<>();
		
		DiscountRule discountRule = new DiscountRule(0,4000,0.10);
		discountRules.add(discountRule);
		
		discountRule = new DiscountRule(4000,8000,0.15);
		discountRules.add(discountRule);

		discountRule = new DiscountRule(8000F,12000F,0.20);
		discountRules.add(discountRule);
		
		discountRule = new DiscountRule(12000F,Double.NaN,0.30);
		discountRules.add(discountRule);
		
		return discountRules;
	}

}
