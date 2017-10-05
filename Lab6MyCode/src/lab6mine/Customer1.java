package lab6mine;

public class Customer1 
{

	private String name;
	
	public Customer1(String name)
	{
		this.name = name;
	}
	
	public void placeOrder(String item, int quantity)
	{
		
	}
	
	public double getReciept(Account1 a)
	{
		return a.getTotalPrice();
	}
	
	public void removeOrder(String item)
	{
		
	}
	
	
}
