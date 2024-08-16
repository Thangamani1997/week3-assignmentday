package week3Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Secondlargestno 
{

	public static int getSecondLargest(Integer[] a, int total)
	{  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(total-2);  
		return element;  
	}  
	
	public static void main(String args[])
	{  
		Integer a[]={3,2,11,4,6,7};  
		System.out.println("Second Largest Number: "+getSecondLargest(a,6));  
	}  
		
}
