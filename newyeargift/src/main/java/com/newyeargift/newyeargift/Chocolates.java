package com.newyeargift.newyeargift;


abstract class Chocolates{// implements Gift{
    String name;
    int cost;
    int quantity;
    Chocolates(String name, int cost, int quantity){
        this.name=name;
        this.cost=cost;
        this.quantity=quantity;
    }
    abstract String getName();
    abstract int getCost();
}

