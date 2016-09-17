package javarr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayJavaTest {

	@Test
	public void test() {
		ArrayJava a = new ArrayJava();
		assertEquals(true,a.maxOfArray(new int[]{-1,-3,-2,-4,-7}) == -1);
		assertEquals(true,a.maxOfArray(new int[]{1,2,8,3,7}) == 8);
		
	}

}
