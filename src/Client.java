import java.util.ArrayList;
import java.util.List;

public class Client
{
	public static void main( String[] args )
	{
		Order order = new Order();

		OrderObserver qo = new QuantityObserver();
		OrderObserver po = new PriceObserver();

		order.attach( qo );
		order.attach( po );

		order.addItem( 50 );
		System.out.println(order);

		order.addItem( 50 );
		order.addItem( 50 );
		order.addItem( 50 );

		System.out.println("Price observer check : ");
		System.out.println(order);

		order.addItem( 50 );

		System.out.println("Quantity observer check : ");
		System.out.println(order);
	}
}
