package stackpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackLinkTest {
	
	@Test
	public void test() {
		stack<String> greeting = new StackLink<>();
		String output="";
		greeting.push("m").push("a").push("d").push("a").push("m");
		output += greeting.pop()+greeting.pop()+greeting.pop()+greeting.pop()+greeting.pop();
		assertEquals(true,"madam".compareTo(output)==0);
	}

}
