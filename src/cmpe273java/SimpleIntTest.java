package cmpe273java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleIntTest {

	@Test
	public void test() {
		double value=0;
		SimpleInt s = new SimpleInt();
		value = s.SimpleInterest(847.23, 5, 4.34);
		assertEquals(true,value==183.84891);
	}

}
