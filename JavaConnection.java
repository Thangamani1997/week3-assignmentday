package week3Assignment;

public class JavaConnection implements DatabaseConnection
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
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdated();
	}
}
