import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingCartTest {

	private ShoppingCart TCart;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Test
	public void testGetItems()throws NoSuchFieldException, IllegalAccessException {
		TCart= new ShoppingCart();
		Field field = TCart.getClass().getDeclaredField("Items");
		field.setAccessible(true);
		
		
		String[] res = TCart.getItems();
		assertEquals("Field was not retreived", res,null);
	}


	@Test
	public void testGetNumberOFitems()throws NoSuchFieldException, IllegalAccessException {
		TCart= new ShoppingCart();
		Field field = TCart.getClass().getDeclaredField("NumberOfitems");
		field.setAccessible(true);
		field.setInt(TCart, 23);;
		
		String[] res = TCart.getItems();
		assertEquals("Field was not retreived", res,23);
		
	}

	@Test
	public void testSetNumberOfitems()throws NoSuchFieldException, IllegalAccessException {
		TCart= new ShoppingCart();
		TCart.setNumberOfitems(3);
		Field field = TCart.getClass().getDeclaredField("NumberOfitems");
		field.setAccessible(true);
		assertEquals("Fields do not match", field.get(TCart), 3);
	}

	@Test
	public void testGetTotalCost()throws NoSuchFieldException, IllegalAccessException {
		TCart= new ShoppingCart();
		Field field = TCart.getClass().getDeclaredField("TotalCost");
		field.setAccessible(true);
		field.set(TCart, "Total");
		
		int res = TCart.getTotalCost();
		assertEquals("Field was not retreived", res,"item");
	}

	@Test
	public void testSetTotalCost()throws NoSuchFieldException, IllegalAccessException {
		TCart= new ShoppingCart();
		TCart.setTotalCost(0);
		Field field = TCart.getClass().getDeclaredField("TotalCost");
		field.setAccessible(true);
		assertEquals("Fields do not match", field.get(TCart),0);	}

}
