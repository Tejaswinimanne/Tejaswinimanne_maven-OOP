package com.newyeargift.newyeargift;

public class Pudding extends Sweets implements Gift{
	Pudding(String name,int cost,double weight){
		super(name,cost,weight);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}

