package week3Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String text1=text.toLowerCase();
		String[] carray = text1.split(" ");
		System.out.println("The string is: " + text);
		System.out.println("The Lower Case of the string is: " + text1);
	    System.out.print("Duplicate Characters in above string are: ");
	    
	 // nested for loop to print duplicate characters
	    Set<String> s = new LinkedHashSet<String>();
	    
	      for (int i = 0; i < carray.length; i++) 
	      {
	    	  s.add(carray[i]);
	    	  
	      }
	      for (String ss:s) 
	      {
	          System.out.print(ss+ " ");
	              
	      }
	      
	 }
	         

}
