package com.newyeargift.newyeargift;

public class WhiteChocolate extends Chocolates implements Gift{
	WhiteChocolate(String name,int cost,int quantity){
		super(name,cost,quantity);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}

