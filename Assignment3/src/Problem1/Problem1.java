package Problem1;

import java.util.Scanner;

public class Problem1 {
	
	/**
	 Finds the position of the next blank character in a String
	 If none exists, the length of the string is returned.
	 @param str string containing characters to search
	 @param from character position where the search starts
	 @return character position of the next blank character
	 */
	public static int nextSpacePosition(String str, int from)
	{
		int index;
		char c;
		
		index = str.length();
		for (int i = from; i < str.length(); i++)
		{
			c = str.charAt(i);
			if (c == ' ' || c == '\r' || c == '\n' || c == '\t')
			{
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 Finds the position of the next non-blank character in a String
	 If none exists, the length of the string is returned.
	 @param str string containing characters to search
	 @param from character position where the search starts
	 @return character position of the next non-blank character
	 */
	public static int nextNonSpacePosition(String str, int from)
	{
		int index;
		char c;
		
		index = str.length();
		for (int i = from; i < str.length(); i++)
		{
			c = str.charAt(i);
			if (c != ' ' && c != '\r' && c != '\n' && c != '\t')
			{
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 Count the number of words in a given string
	 A word is a sequence of characters separated by any # of spaces
	 @param str string to count words in
	 @return number of words in str
	 */
	public static int countWords(String str)
	{
		int wordCount;
		int i;
		
		wordCount = 0;
		i = 0;
		while (i < str.length())
		{
			i = nextSpacePosition(str, nextNonSpacePosition(str, i));
			wordCount++;
		}
		
		return wordCount;
	}
	
	public static void main(String[] args) {
		
		String input;
		int wordCount;
		Scanner in;
		
		in = new Scanner(System.in);
		if (in.hasNextLine())
		{
			input = in.nextLine();
			wordCount = countWords(input);
		}
		
		else
		{
			wordCount = 0;
		}
		
		System.out.print(wordCount);
		in.close();
	}
}
