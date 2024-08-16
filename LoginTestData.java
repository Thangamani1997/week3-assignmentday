package week3Assignment;

public class LoginTestData extends TestData
{
	public void enterUsername() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter User Name - Thangamani");

	}
	
	private void enterPassword() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Password - Abcdef@0123");

	}
	
	//overriding
	public void enterCredential() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Valid Credentials");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LoginTestData details = new LoginTestData();
		details.enterCredential();
		details.enterUsername();
		details.enterPassword();
		details.navigateToHomePage();
	}
}
