package pkg;

import static org.junit.Assert.*;
import org.junit.Test;

public class GenericMethodTest {

	@Test
	public void testPrintArray() {
		assertEquals(true,GenericMethod.maxOf(2, 100, 197)==197);
		assertEquals(true,"Akshaya".equals(GenericMethod.maxOf("Abhinav","Aditya","Akshaya")));
		assertEquals(true,(GenericMethod.maxOf(1.12,3.231,1.21112)==3.231));	
	}

}
