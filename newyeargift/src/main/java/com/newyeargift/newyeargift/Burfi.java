package com.newyeargift.newyeargift;

public class Burfi extends Sweets implements Gift{
	Burfi(String name,int cost,double weight){
		super(name,cost,weight);
	}
	public int getCost() {
		return this.cost;
	}
	public String getName() {
		return this.name;
	}
}
