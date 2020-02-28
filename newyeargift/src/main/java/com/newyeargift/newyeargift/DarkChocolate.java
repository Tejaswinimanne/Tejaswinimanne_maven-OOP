package com.newyeargift.newyeargift;

public class DarkChocolate extends Chocolates implements Gift{
	DarkChocolate(String name,int cost,int quantity){
		super(name,cost,quantity);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}
