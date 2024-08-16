package week3Assignment;

public class MethodOverriding extends MethodOverloading
{
	public void values() 
	{
		// TODO Auto-generated method stub
		System.out.println("The Values contains Alpha Numeric Values & also a Special Characters");
	}
	
	public static void main(String[] args)
	{
		MethodOverriding mo1 = new MethodOverriding();
		mo1.values();
		mo1.values("Saru");
		mo1.values(2, "Good Evening");
	}
}
