package week3Assignment;

public class MethodOverloading 
{
	public void values() 
	{
		// TODO Auto-generated method stub
		System.out.println("The Values contains Alpha Numeric Values");
	}
	
	public void values(int a, String txt) 
	{
		// TODO Auto-generated method stub
		System.out.println("Integer = "+a +"     String = " +txt);
	}
	
	public void values(String txt) 
	{
		// TODO Auto-generated method stub
		System.out.println("String = " +txt);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading mo = new MethodOverloading();
		mo.values();
		mo.values(1, "Ammu");
		mo.values("Prithivi");
	}
	
}
