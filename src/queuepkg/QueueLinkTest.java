package queuepkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkTest {

	@Test
	public void test() {
		String output="";
		Queue<String> greeting= new QueueLink<>();
		greeting.enqueue("world ").enqueue("hello");
		output +=greeting.dequeue()+greeting.dequeue();
		assertEquals(true,"world hello".compareTo(output)==0);		
		
	}

}
