package Test;

import java.util.ArrayList;

public class test {
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		x.add(0);
		Test1(x);
		x.add(2);
		
		int[] y = new int[3];
		y[0] = 0;
		Test2(y);
		y[2] = 2;
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(1);
		a.add(0, 2);
		a.set(2, 3);
		
		boolean z = true;
	}
	
	public static void Test1(ArrayList<Integer> arrayList)
	{
		arrayList.add(1);
	}
	
	public static void Test2(int[] array)
	{
		array[1] = 1;
	}
}
