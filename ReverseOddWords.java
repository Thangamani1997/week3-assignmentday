package week3Assignment;

import java.util.ArrayList;
import java.util.List;


public class ReverseOddWords {

	public static void main(String[] args) 
	{
		String text = "I am a software tester";
		
		System.out.println("The string is: " + text);
		System.out.println("Reverses the words in the string that have odd lengths: " + test(text));
	} 

	    public static String test(String text)
	    {
	    	String[] carray = text.split(" ");
	    	 List<String> resultWords = new ArrayList<>();

	         for (int i = 0; i < carray.length; i++) 
	         {
	             if (i % 2 == 1) 
	             { 
	                 resultWords.add(new StringBuilder(carray[i]).reverse().toString());
	             } 
	             else 
	             {
	                 resultWords.add(carray[i]);
	             }
	         }

	         return String.join(" ", resultWords);

	}
	     
	      
	 }
	         



