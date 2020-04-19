package com.retailoutlet.generator;

import java.util.ArrayList;
import java.util.List;

import com.retailoutlet.domain.DiscountRule;

public class GeneralDiscountRuleGenerator implements DiscountRuleGenerator{

	@Override
	public List<DiscountRule> getDiscountRule() {
		// TODO Auto-generated method stub
		List<DiscountRule> discountRules = new ArrayList<>();
		
		DiscountRule discountRule = new DiscountRule(0,5000,Double.NaN);
		discountRules.add(discountRule);
		
		discountRule = new DiscountRule(5000,10000,0.10);
		discountRules.add(discountRule);

		discountRule = new DiscountRule(10000,Double.NaN,0.20);
		discountRules.add(discountRule);
		
		
		return discountRules;
	}

}
