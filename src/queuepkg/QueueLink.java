package queuepkg;

public class QueueLink<T> implements Queue<T>{
	private Node first,last;
	private int total;
	private class Node{
		private T ele;
		private Node next;
	}
	public Queue<T> enqueue(T ele)
	{
		Node current = last;
		last = new Node();
		last.ele = ele;
		
		if(total++==0)first=last;
		else current.next = last;
		
		return this;
	}
	public T dequeue()
	{
		if(total==0)new java.util.NoSuchElementException();
		T ele = first.ele;
		first = first.next;
		if(--total==0)last=null;
		return ele;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> greeting  = new QueueLink<>();

		greeting.enqueue("Hello").enqueue(", ").enqueue("World!");

		System.out.println(greeting.dequeue() + greeting.dequeue() + greeting.dequeue());
	}

}
