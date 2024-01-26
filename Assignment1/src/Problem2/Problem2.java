package Problem2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Problem2 {

	public static void main(String[] args) {
		
		boolean isInput;
		String input;
		double numberGrade;
		boolean isPrintNumberGrade;
		Scanner in;
		
		in = new Scanner(System.in);
		
		Logger.getGlobal().setLevel(Level.SEVERE);
		
		System.out.print("Enter letter grade: ");
		
		isInput = in.hasNext();
		
		if (isInput)
		{
			numberGrade = -1; // 
			isPrintNumberGrade = false;
			input = in.next();
			
			if (input.length() == 1)
			{
				input = input.substring(0, 1);
			}
			
			else
			{
				if (input.length() == 2)
				{
					input = input.substring(0, 2);
				}
				
				else
				{
					// input too long
					// input must be 1 or 2 characters
				}
			}
			
			switch (input)
			{
				case "A":
					numberGrade = 4.0;
					isPrintNumberGrade = true;
					break;
					
				case "A-":
					numberGrade = 3.7;
					isPrintNumberGrade = true;
					break;
					
				case "B+":
					numberGrade = 3.3;
					isPrintNumberGrade = true;
					break;
					
				case "B":
					numberGrade = 3.0;
					isPrintNumberGrade = true;
					break;

				case "B-":
					numberGrade = 2.7;
					isPrintNumberGrade = true;
					break;
					
				case "C+":
					numberGrade = 2.3;
					isPrintNumberGrade = true;
					break;
					
				case "C":
					numberGrade = 2;
					isPrintNumberGrade = true;
					
				case "C-":
					numberGrade = 1.7;
					isPrintNumberGrade = true;
					break;
					
				case "D+":
					numberGrade = 1.3;
					isPrintNumberGrade = true;
					break;
					
				case "D":
					numberGrade = 1.0;
					isPrintNumberGrade = true;
					break;
					
				case "D-":
					numberGrade = 0.7;
					isPrintNumberGrade = true;
					break;
					
				case "F":
					numberGrade = 0.0;
					isPrintNumberGrade = true;
					break;
				
				default:
					Logger.getGlobal().severe("The input is not a valid letter grade.");
					break;
			}
			
			if (isPrintNumberGrade)
			{
				System.out.println(numberGrade);
			}
		}
		
		else
		{
			Logger.getGlobal().severe("The input is not a valid letter grade.");
		}
		
		in.close();
	}
}
