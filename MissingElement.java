package week3Assignment;

import java.util.Arrays;
import java.util.HashSet;

public class MissingElement
{
	 public static void main( String args[] )
	    {
		 int[] arr={1,2,3,4,10,6,8};
	        
	        System.out.println("Missing Numbers Are");
	        HashSet<Integer> hs = new HashSet<>();
			for(int i : arr)
			{
				hs.add(i);
			}
			Arrays.sort(arr);
	        for(int i=0;i<arr[arr.length-1];i++)
	        {
	            if(!hs.contains(i))
	            {
	                System.out.println(i);
	                
	            }
	        }
	    }
}
