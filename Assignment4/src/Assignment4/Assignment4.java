package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Assignment4 {

	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<String> values;
		File file;
		String filepath;
		String value;
		
		filepath = "C:\\Users\\aaron.montgomery\\source\\repos\\CSC262\\Assignment4\\src\\Assignment4\\data.txt";
		file = new File(filepath);
		values = new ArrayList<String>();
		
		if (file.exists())
		{
			try (Scanner in = new Scanner(file))
			{
				while (in.hasNext())
				{
					value = in.next();
					if (!value.isEmpty())
					{
						values.add(value);
					}
				}
			}
		}
		
		for (String element: values)
		{
			System.out.println(element);		
		}
	}
}
