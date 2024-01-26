package Problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner in;
		double gallons; // input: gas in tank
		double fuelEfficiency; // input: fuel efficiency in miles per gallon
		double price; // input: gas price per gallon
		double costPerHundredMiles; // output
		int fullTankDistance; // output
		final int MILE_FACTOR = 100; // assign in constructor
		
		in = new Scanner(System.in);
		
		System.out.print("Enter the number of gallons of gas in the tank (floating point number): ");
		
		gallons = in.nextDouble();
		
		System.out.print("Enter the fuel efficiency in miles per gallon (floating point number): ");
		
		fuelEfficiency = in.nextDouble();
		
		System.out.print("Enter the price of gas per gallon (floating point number): ");
		
		price = in.nextDouble();
		
		costPerHundredMiles = (price / fuelEfficiency) * MILE_FACTOR;  
		
		System.out.printf("Cost per 100 miles: $%.2f%n", costPerHundredMiles);
		
		fullTankDistance = (int)(gallons * fuelEfficiency);
		
		System.out.printf("Distance car travels on a full tank of gas: %d miles%n", fullTankDistance);
		
		in.close();
	}

}
