package com.retailoutlet.domain;

public class DiscountRule {

	private double lowerBound;
	private double upperBound;
	private double percentageDiscount;
	public DiscountRule(double lowerBound, double upperBound, double percentageDiscount) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.percentageDiscount = percentageDiscount;
	}

	public double getLowerBound() {
		return lowerBound;
	}
	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}
	public double getUpperBound() {
		return upperBound;
	}
	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

}
