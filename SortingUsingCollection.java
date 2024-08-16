package week3Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) 
	{
	
		List<String> values = new ArrayList<String>();
		
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire System");
		values.add("TCS");
		System.out.println("Collections in the List");
		System.out.println(values);
		Collections.sort(values);
		System.out.println("Ascending Order of tht list is "+values);
		Collections.reverse(values);
		System.out.println("After Reversing "+values);

	}
}
