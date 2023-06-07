public class QuantityObserver implements OrderObserver
{

	@Override
	public void update( Order order )
	{
		if(order.getCount() == 5)
			order.setTotalPrice( order.getTotalPrice() - 10 );
	}
}
