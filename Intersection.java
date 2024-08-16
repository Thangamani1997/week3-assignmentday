package week3Assignment;

import java.util.ArrayList;
import java.util.List;

public class Intersection 
{
	 public static void main(String[] args) 
	 {
		 int[] arr1 = {3,2,11,4,6,7};
		 int[] arr2 = {1,2,8,4,9,7};	
		 
	        List<Integer> list1 = new ArrayList<>();
	        for(int i:arr1)
	        {
	        	list1.add(i);
	        }
	        System.out.println("List 1 = " +list1);
	        
	        
	        List<Integer> list2 = new ArrayList<>();
	        for(int j:arr2)
	        {
	        	list2.add(j);
	        }
	        System.out.println("List 2 = " +list2);
	        
	        
	        List<Integer> intersection = findIntersection(list1, list2);

	        System.out.println("Intersection: " + intersection);
	    }

	    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) 
	    {
	        List<Integer> intersection = new ArrayList<>();
	        for (Integer element : list1)
	        {
	            if (list2.contains(element)) 
	            {
	                intersection.add(element);
	            }
	        }
	        return intersection;
	    }
}
