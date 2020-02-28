package com.epamWeek4.epamWeek4;

public class SimpleInterest {
	double principal;
	float rateOfInterest, timeInYears;
	SimpleInterest(double principal, float rateOfInterest, float timeInYears){
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.timeInYears=timeInYears;
	}
	public double getInterest() {
		return((principal*rateOfInterest*timeInYears)/100);
	}
}
