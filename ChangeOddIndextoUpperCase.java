package week3Assignment;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args)
	{
		String test = "changeme";
		System.out.println("String to change odd index into upper case - "+test);
		
		char[] char1 = test.toCharArray();
			
		for(int i=1; i<char1.length; i=i+2)
		{
			char1[i]=Character.toUpperCase(char1[i]);
		}
		
		 System.out.println(new String(char1));

	}

}
