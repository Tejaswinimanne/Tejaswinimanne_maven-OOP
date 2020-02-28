package com.epamWeek4.epamWeek4;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("choose 1 for calculating interest.");
    	System.out.println("choose 2 for house construction.");
    	int option = sc.nextInt();
    	if(option == 1) {
    		System.out.println("Enter principal");
    		double principal = sc.nextDouble();
    		System.out.println("Enter rate of interset");
        	float rateOfInterest = sc.nextFloat();
        	System.out.println("Enter time in years");
        	float timeInYears = sc.nextFloat();
            System.out.println("Choose 1 to calculate Simple Interest.");
            System.out.println("Choose 2 to calculate Compound Interest.");
            int interestOption = sc.nextInt();
            if(interestOption == 1) {        	
            	SimpleInterest simpleInterest = new SimpleInterest(principal,timeInYears,rateOfInterest);
            	System.out.println(simpleInterest.getInterest());
            }
           else if(interestOption == 2) {
            	CompoundInterest compoundInterest = new CompoundInterest(principal,timeInYears,rateOfInterest);
            	System.out.println(compoundInterest.getInterest());
            }
            else {
            	System.out.println("Enter a valid option...!");
            }
    	} 
    	else if(option == 2) {
        	System.out.println("1:"+" Standard Material");
        	System.out.println("2:"+" Above Standard Material");
        	System.out.println("3:"+" High Standard Material");
        	System.out.println("4:"+" High Standard Material and fully automated home");
        	System.out.println("Enter the type of standard from the above.");
        	int standard = sc.nextInt();
        	System.out.println("Enter the area of your home in square feet");
        	float area = sc.nextFloat();
        	double cost=0;
        	switch(standard) {
        		case 1:cost=area*1200;break;
        		case 2:cost=area*1500;break;
        		case 3:cost=area*1800;break;
        		case 4:cost=area*2500;break;
        		default:System.out.println("Enter a valid standard");
        	}
        	System.out.println(cost);
    	}
    		
    	
    }
}
