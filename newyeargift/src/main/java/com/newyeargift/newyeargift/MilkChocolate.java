package com.newyeargift.newyeargift;

public class MilkChocolate extends Chocolates implements Gift{
	MilkChocolate(String name,int cost,int quantity){
		super(name,cost,quantity);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}
