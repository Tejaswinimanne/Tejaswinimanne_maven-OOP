package com.newyeargift.newyeargift;
abstract class Sweets{
    String name;
    double weight;
    int cost;
    Sweets(String name, int cost, double weight){
        this.name = name ;
        this.cost = cost;
        this.weight = weight;
    }
    abstract String getName();
    abstract int getCost();

}
