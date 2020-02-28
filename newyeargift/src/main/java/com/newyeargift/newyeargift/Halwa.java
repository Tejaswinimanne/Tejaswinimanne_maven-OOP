package com.newyeargift.newyeargift;

public class Halwa extends Sweets implements Gift{
	Halwa(String name,int cost,double weight){
		super(name,cost,weight);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}
