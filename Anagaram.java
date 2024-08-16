package week3Assignment;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args)
	{
	
		String text1 = "stops";
		String text2 = "potss";
		
		//To find length of text1
		int lengthtext1 = text1.length();
		System.out.println("The length of text 1 "+ text1 +" is "+ lengthtext1);
	
		//To find length of text1
		int lengthtext2 = text2.length();
		System.out.println("The length of text 2 "+ text2 +" is "+ lengthtext2);
		
		if(lengthtext1==lengthtext2)
		{
			System.out.println("Length of text 1 & text 2 are Equal");
			
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result==true)
			{
				System.out.println("The given strings are Anagram");
			}
			else
				System.out.println("The given strings are not an Anagram");
		}
		
		
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
				
	}

}
