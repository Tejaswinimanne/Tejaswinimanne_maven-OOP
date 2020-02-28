package com.newyeargift.newyeargift;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args ){
    	ArrayList<Gift> allGifts = new ArrayList<>();
    	allGifts.add(new Burfi("Sohan papdi",200,1.5));
    	allGifts.add(new Pudding("Kheer",150,1.0));
    	allGifts.add(new Halwa("Sohan Halwa",180,0.5));
    	allGifts.add(new WhiteChocolate("Milkybar",30,5));
    	allGifts.add(new DarkChocolate("Bournville",200,3));
    	allGifts.add(new MilkChocolate("Dairy Milk",180,2));
    	allGifts.add(new Burfi("kaju katli",250,1.0));
    	allGifts.add(new Pudding("Sheera",140,0.5));
    	allGifts.add(new Burfi("kalakand",170,1.5));
    	
    	ArrayList<Sweets> sweets = new ArrayList<>();
        for(int i = 0; i < allGifts.size(); i++){
            if(allGifts.get(i) instanceof Sweets){
                sweets.add((Sweets)allGifts.get(i));
            }
        }
        Collections.sort(sweets,new Comparator<Sweets>(){ 
            public int compare(Sweets item1,Sweets item2) 
            { 
                return item1.getCost()-item2.getCost(); 
            } 
        });
        ArrayList<Chocolates> chocolates = new ArrayList<>();
        for(int i = 0; i < allGifts.size(); i++){
            if(allGifts.get(i) instanceof Chocolates){
                chocolates.add((Chocolates)allGifts.get(i));
            }
        }
        Collections.sort(chocolates,new Comparator<Chocolates>(){ 
            public int compare(Chocolates item1,Chocolates item2) 
            { 
                return item1.getCost()-item2.getCost(); 
            } 
        });
        int total=0;
        int sweets_less150=0,sweets_more150=0;
        int chocolates_less150=0,chocolates_more150=0;
        System.out.println("List of all the sweets.....");
        for(int i=0;i<sweets.size();i++) {
        	System.out.println("Type : "+sweets.get(i).getName()+" , "+"Cost : "+sweets.get(i).getCost());
        	total++;
        	if(sweets.get(i).getCost()<=150) sweets_less150++;
        	else sweets_more150++;
        }
        System.out.println("List of all the chocolates.....");        
        for(int i=0;i<chocolates.size();i++){
            System.out.println("Type : "+chocolates.get(i).getName()+" , "+"Cost : "+chocolates.get(i).getCost());
            total++;
            if(chocolates.get(i).getCost()<=150) chocolates_less150++;
        	else chocolates_more150++;
        }
        System.out.println("Total cost of gifts: "+total);
        System.out.println("Number of sweets with cost in the range 0-150 : "+sweets_less150);
        System.out.println("Number of sweets with cost greater than 150 : "+sweets_more150);
        System.out.println("Number of chocolates with cost in the range 0-150 : "+chocolates_less150);
        System.out.println("Number of chocolates with cost greater than 150 : "+chocolates_more150);
        
    }
}
