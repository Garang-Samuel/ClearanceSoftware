package johnson;

//Use Scanner class to access packages within class java........1//

import java.util.Scanner;

//This is class Name............11//

public class Emmanuel

{
	 
	//Access Scanner members or class privately........4//
	
	private static Scanner james;
	private static Scanner samuel;

	public static void main(String[]args)
	
	{
		
		//create scanner members for Non-primitive data type.....2//
		
		
		james = new Scanner(System.in);
		
		
		System.out.println("LINAH AUTO LOGISTIC CLEARANCE SOFTWARE-UG");
		
		  
		//capture strings from the keyboard..........3//
		
		
		System.out.println("Enter Make Of The Vehicle:");
		String make = james.next();
		
		
		System.out.println("Model Of The Vechicle:");
		String model = james.next();
		
		
		System.out.println("Enter Registration Year Of The Vechicle:");
		String year = james.next();
		
		
		//create scanner members for primitive data type.........5//
		
		
		samuel = new Scanner(System.in);
		
		
		//capture doubles from the keyboard...................6//
		
		
		System.out.println("Enter the Cost Insurance Freight(CIF) Value:");
		int cost = samuel.nextInt();
		
		
		System.out.println("Enter Capacity Of The Vehicle Engine:");
		int capacity = samuel.nextInt();
		
		
		//Display the Results capture from the keyboard.........7//
		
		
		System.out.println("Make Of The Vechilce: " + make);
		
		
		System.out.println("Model Of The Vechilce: " + model);
		
		
		System.out.println("Registration Year Of The Vechilce: " + year);
		
		
		System.out.println("Cost Insurance Freight(CIF): " + cost);
		
		
		System.out.println("Capacity Of The Vehicle Engine: " + capacity);
		
		
		//Calculation of all taxes levied on Vehicle...........8//
		
		
		double duty =  (25  * cost / 100);
		
		
		System.out.println("The Import Duty Value Of The Vehicle: " + duty);
		
		
		double VAT_value = (18 * cost / 100);
		
	    
	    System.out.println("The VAT Value Of The Vechicle: " +  VAT_value);
	    
	 
		double WHT_value = (6 * cost / 100);
		
		
		System.out.println("The WHT Value Of The Vechicle: " +  WHT_value);
		
		
		double environmental_value = (50 * cost / 100);
		
		
		System.out.println("The Environmental Value Of The Vechicle: " + environmental_value);
		
		
		double infrastructure_value = (1.5 * cost / 100);
		
		
		System.out.println("The Infrastructure Value Of The Vechicle: " + infrastructure_value);
		
		
		//Capped values on Vehicle or restricted number or amount of..........9//
		
		
		String registration_value = ("400 USD"); 
		
		
		System.out.println("The Registration Value Of The Vechicle: " + registration_value);
		
		
		String stamp_value = ("20 USD");
		
		
		System.out.println("The Stamp & Vechicle Registration Value Of The Vehicle: " + stamp_value);
		
		
		String transport_value = ("150 USD");
		
		
		System.out.println("The Transport Fee Value Of The Vehicle: " + transport_value);
		
		
		//Display the summation of all taxes and CIF in USD..........10//
		 
		
		double total_cost = (duty + VAT_value + WHT_value + environmental_value + infrastructure_value + cost);
		
		
	    double dollar = (total_cost / 3800);
	    
		
		System.out.println("Total Cost Of The Vehicle In USD : " + dollar);
		
		
		//Display the summation of all taxes and CIF in UGX..........12//
		
		
		double ugx = (duty + VAT_value + WHT_value + environmental_value + infrastructure_value + cost);
		
		
		System.out.println("Total Cost Of The Vehicle In UGX : " + ugx);
		 
		
	}
	

}
