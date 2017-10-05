package lab6mine;

public class Account1 
{
	private int accountNumber;
	final int maxItemsPerAccount = 10;
	private Order1[] orderList = new Order1[maxItemsPerAccount];
	private double totalPrice = 0;
	
	public Account1(int number)
	{
		accountNumber = number;
	}
	
	public void addOrder(String item, int quantity)
	{
		
	}
	
	public void removeOrder(String item)
	{
		
	}
	
	public double getTotalPrice()
	{
		double total = 0;
		for(int i = 0; i < maxItemsPerAccount; i++)
		{
			if(orderList[i] != null)
			{
				total = total + (orderList[i].getOrderPrice());
			}
			else
			{
				break;
			}
		}
		return total;
	}

}
