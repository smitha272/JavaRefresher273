package collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class collectionClassTest {

	@Test
	public void test() {
		collectionClass c = new collectionClass();
		c.addMember("John", "Engineering 101", true);
		c.addMember("Jane", "Computer Science 101", true);
		c.addMember("Jack", "Engineering 101", false);
		c.addMember("Jake", "Computer Science 101", true);
		
		assertEquals(3,c.enrollment());
		
	}
}
