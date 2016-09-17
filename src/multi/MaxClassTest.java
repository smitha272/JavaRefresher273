package multi;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxClassTest {

	@Test
	public void test() {
		MaxClass mc = new MaxClass();
		assertEquals(true, mc.diffMaxMin(new int[]{1,2,3,4,5}) == 4);
	}

}