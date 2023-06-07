public class Order
{
	private static int nbOrder = 0;
	private int orderId;

	private double totalPrice;
	private int count;

	private OrderObserver priceObserver;
	private OrderObserver quantityObserver;

	public Order()
	{

	}

	public void attach(OrderObserver o)
	{

	}

	public void detach(OrderObserver o)
	{

	}

	public double getTotalPrice()
	{
		return this.totalPrice;
	}

	public int getCount()
	{
		return this.count;
	}
}
