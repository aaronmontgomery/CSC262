package Problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner in;
		String input;
		char[] chars;
		int[] counts;
		char c;
		boolean isInArray;
		int jIndex;
		int largestNumberInArray;
		int[] indices;
		
		in = new Scanner(System.in);
		chars = new char[1];
		counts = new int[1];
		isInArray = false;
		jIndex = 0;
		
		if (in.hasNext())
		{
			input = in.next();
			in.close();
			for (int i = 0; i < input.length(); i++)
			{
				isInArray = false;
				c = input.charAt(i);
				for (int j = 0; j < chars.length; j++)
				{
					jIndex = j;
					if (chars[j] == c)
					{
						// already in array
						isInArray = true;
						break;
					}
				}
				
				if (!isInArray)
				{
					chars = CopyArray(chars, i == 0 ? chars.length : chars.length + 1);
					counts = CopyArray(counts, i == 0 ? counts.length : counts.length + 1);
					jIndex = chars.length - 1;
					chars[jIndex] = c;
					counts[jIndex] = counts[jIndex] + 1;
				}
				
				else
				{
					counts[jIndex] = counts[jIndex] + 1;
				}
			}
		}
		
		largestNumberInArray = GetLargestNumberInArray(counts);
		indices = IndexOf(counts, largestNumberInArray);
		for (int i = 0; i < indices.length; i++)
		{
			System.out.println(chars[indices[i]] + " (" + largestNumberInArray + ")");
		}
	}
	
	public static char[] CopyArray(char[] inputArray, int newLength)
	{
		char[] temp;
		
		temp = new char[newLength];
		for (int i = 0; i < inputArray.length; i++)
		{
			temp[i] = inputArray[i];
		}
		
		return temp;
	}
	
	public static int[] CopyArray(int[] inputArray, int newLength)
	{
		int[] temp;
		
		temp = new int[newLength];
		for (int i = 0; i < inputArray.length; i++)
		{
			temp[i] = inputArray[i];
		}
		
		return temp;
	}
	
	public static int GetLargestNumberInArray(int[] inputArray)
	{
		int largestNumber;
		
		if (inputArray.length >= 0)
		{
			largestNumber = inputArray[0];
			for (int i = 0; i < inputArray.length; i++)
			{
				largestNumber = inputArray[i] > largestNumber ? inputArray[i] : largestNumber;
			}
		}
		
		else
		{
			// error throw exception
			largestNumber = inputArray[-1]; 
		}
		
		return largestNumber;
	}
	
	public static int[] IndexOf(int[] inputArray, int value/*, delegate CopyArray*/)
	{
		int[] indices;
		
		indices = new int[0];
		for (int i = 0; i < inputArray.length; i++)
		{
			if(inputArray[i] == value)
			{
				indices = CopyArray(indices, indices.length + 1);
				indices[indices.length - 1] = i;
			}
		}
		
		return indices;
	}
}
