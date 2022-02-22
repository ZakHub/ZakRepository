import static org.junit.Assert.*;
import java.lang.reflect.Field;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	
	private Customer Ctest;

	@Before
	public void setup() {
			Ctest = new Customer("zak",453043040);	
	}

	@Test
	public void testSetName() throws NoSuchFieldException, IllegalAccessException {
		Ctest= new Customer("zak",435345345);
		Ctest.setName("zak");
		Field field = Ctest.getClass().getDeclaredField("Name");
		field.setAccessible(true);
		assertEquals("Fields do not match", field.get(Ctest),"zak");
	}

	@Test
	public void testGetName() throws NoSuchFieldException, IllegalAccessException {
		Ctest= new Customer("zak",435345345);
		Field field = Ctest.getClass().getDeclaredField("Name");
		field.setAccessible(true);
		field.set(Ctest, "Name");
		
		String res = Ctest.getName();
		assertEquals("Field was not retreived", res,"Name");
	}

	@Test
	public void testGetEmail() throws NoSuchFieldException, IllegalAccessException {
		Ctest= new Customer("zak",435345345);
		Field field = Ctest.getClass().getDeclaredField("Email");
		field.setAccessible(true);
		field.set(Ctest, "Email");
		
		String res = Ctest.getEmail();
		assertEquals("Field was not retreived", res,"Email");
	}

	@Test
	public void testSetEmail() throws NoSuchFieldException, IllegalAccessException {
		Ctest= new Customer("zak",435345345);
		Ctest.setEmail("cps@hotmail.com");
		Field field = Ctest.getClass().getDeclaredField("Email");
		field.setAccessible(true);
		assertEquals("Fields do not match", field.get(Ctest),"cps@hotmail.com");
	}


}
