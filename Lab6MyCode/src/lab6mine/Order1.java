package lab6mine;

public class Order1 
{
	private String item;
	private int quantity;
	final double tax = .1;
	
	public Order1(String item, int quantity)
	{
		this.item = item;
		this.quantity = quantity;
	}
	
	public String getItem()
	{
		return item;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getOrderPrice()
	{
		double d = this.getQuantity() * tax;
		return d;
	}
	
	
}
