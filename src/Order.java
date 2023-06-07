public class Order
{
	private static int nbOrder = 0;
	private int orderId;

	private double totalPrice;
	private int count;



	private boolean discountApplied;

	private OrderObserver priceObserver;
	private OrderObserver quantityObserver;

	public Order()
	{
		this.orderId = Order.nbOrder++;
		this.totalPrice = 10;
		this.count = 0;

		this.discountApplied = false;
	}

	public void attach(OrderObserver o)
	{
		if (o instanceof PriceObserver )
			this.priceObserver = o;
		else
			this.quantityObserver = o;
	}

	public void detach(OrderObserver o)
	{
		if (o instanceof PriceObserver )
			this.priceObserver = null;
		else
			this.quantityObserver = null;
	}

	public double getTotalPrice()
	{
		return this.totalPrice;
	}

	public void setTotalPrice(double price)
	{
		this.totalPrice = price;
	}

	public boolean isDiscountApplied()
	{
		return this.discountApplied;
	}

	public void setDiscount( int discount )
	{
		this.totalPrice -= discount;
		this.discountApplied = true;
	}

	public int getCount()
	{
		return this.count;
	}

	public void addItem(double price)
	{
		this.totalPrice += price;
		this.count++;

		if(this.priceObserver != null)
			this.priceObserver.update( this );

		if(this.quantityObserver != null)
			this.quantityObserver.update( this );
	}

	public String toString()
	{
		return "ID["+this.orderId + "] " + this.totalPrice + " (" + this.count + " item(s))";
	}
}
