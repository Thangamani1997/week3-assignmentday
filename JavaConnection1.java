package week3Assignment;

public class JavaConnection1 extends MySqlConnection
{

	@Override
	public void connect() 
	{
		// TODO Auto-generated method stub
		System.out.println("Network Connection is good");
		
	}

	@Override
	public void disconnect() 
	{
		// TODO Auto-generated method stub
		System.out.println("Network Connection is Disconnected");
	}

	@Override
	public void executeUpdated() 
	{
		// TODO Auto-generated method stub
		System.out.println("Need to execute update in your connection");
	}

	
	public static void main(String[] args) 
	{
		JavaConnection1 java1 = new JavaConnection1();
		java1.connect();
		java1.disconnect();
		java1.executeUpdated();
		java1.executeQuery();
	}
}
