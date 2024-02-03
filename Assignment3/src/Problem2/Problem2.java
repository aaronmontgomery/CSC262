package Problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
	
	public static int sumWithoutLargest(int[] array)
	{
		int sum;
		int largest;
		
		sum = 0;
		largest = array[0];
		for (int element : array)
		{
			sum += element;
			largest = largest > element ? largest : element;
		}
		
		return sum - largest;
	}
	
	public static int swapLargestSmallest(int[] array)
	{
		int sum;
		int smallestIndex;
		int largestIndex;
		int smallestValue;
		int largestValue;
		
		sum = 0;
		smallestIndex = 0;
		largestIndex = 0;
		smallestValue = array[0];
		largestValue = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (smallestValue > array[i])
			{
				smallestIndex = i;
				smallestValue = array[i];
			}
			
			if (largestValue < array[i])
			{
				largestIndex = i;
				largestValue = array[i];
			}
			
			sum += array[i];
		}
		
		array[smallestIndex] = largestValue;
		array[largestIndex] = smallestValue;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner in;
		int[] inputs;
		int sumWithoutLargest;
		int swapLargestSmallest;
		
		in = new Scanner(System.in);
		inputs = new int[0];
		while (in.hasNextInt())
		{
			inputs = Arrays.copyOf(inputs, inputs.length + 1);
			inputs[inputs.length - 1] = in.nextInt();
		}
		
		in.close();
		
		sumWithoutLargest = sumWithoutLargest(inputs);
		System.out.println(sumWithoutLargest + " " + Arrays.toString(inputs));
		
		swapLargestSmallest = swapLargestSmallest(inputs);
		System.out.println(swapLargestSmallest + " " + Arrays.toString(inputs));
	}
}
