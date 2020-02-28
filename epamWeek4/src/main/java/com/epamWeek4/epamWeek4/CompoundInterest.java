package com.epamWeek4.epamWeek4;

public class CompoundInterest {
	double principal;
	float rateOfInterest, timeInYears;
	CompoundInterest(double principal, float rateOfInterest, float timeInYears){
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.timeInYears=timeInYears;
	}
	public double getInterest() {
		return(principal * Math.pow((1 + rateOfInterest/100), timeInYears));
	}
}
