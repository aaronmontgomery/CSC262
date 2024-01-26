package Problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner in;
		int count;
		float total;
		float smallestValue;
		float largestValue;
		float averageValue;
		float rangeValue;
		float tempValue;
		boolean isNotDone;
		
		count = 0;
		total = 0;
		smallestValue = 0;
		largestValue = 0;
		averageValue = 0;
		rangeValue = 0;
		isNotDone = false;
		in = new Scanner(System.in);
		
		isNotDone = in.hasNextFloat();
		while (isNotDone)
		{
			tempValue = in.nextFloat();
			smallestValue = count == 0 ? tempValue : smallestValue >= tempValue ? tempValue : smallestValue;
			largestValue = largestValue <= tempValue ? tempValue : largestValue;
			total += tempValue;
			count++;
			isNotDone = in.hasNextFloat();
		}
		
		in.close();
		averageValue = total / count;
		rangeValue = largestValue - smallestValue;
		System.out.printf("The average value is %f%n", averageValue);
		System.out.printf("The smallest of the values %f%n", smallestValue);
		System.out.printf("The largest of the values %f%n", largestValue);
		System.out.printf("The range is %f%n", rangeValue);
	}
}
