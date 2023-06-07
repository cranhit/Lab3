public class PriceObserver implements OrderObserver
{
	@Override
	public void update( Order order )
	{
		if(order.getTotalPrice() > 200 && !order.isDiscountApplied())
			order.setDiscount( 20 );
	}
}
