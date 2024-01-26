package differenceArraysArrayLists;

import java.util.ArrayList;

public class DifferenceArraysArrayLists {

	public static void main(String[] args) {
		
		// lengthening the array is required before adding an additional item to the array
		int[] testIntegerArray = { 0, 1, 2, 3 };
		testIntegerArray = CopyArray(testIntegerArray, 5);
		testIntegerArray[4] = 4;
		
		// add to ArrayList by calling add
		ArrayList<Integer> testIntegerArrayList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			testIntegerArrayList.add(i);
		}
	}
	
	public static int[] CopyArray(int[] array, int arrayLength)
	{
		int[] result = new int[arrayLength];
		for (int i = 0; i < array.length; i++)
		{
			result[i] = array[i];
		}
		
		return result;
	}
}
