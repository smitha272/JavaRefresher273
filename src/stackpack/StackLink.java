package stackpack;

public class StackLink<T> implements stack<T>{
	private Node first;
	private class Node{
		public T ele;
		public Node next;
	}
	public stack<T> push(T ele)
	{
		Node curr = first;
		first = new Node();
		first.next = curr;
		first.ele = ele;	
		return this;
	}
	public T pop()
	{
		if(first==null)new java.util.NoSuchElementException("Error!");
		T ele = first.ele;
		first = first.next;
		return ele;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		int n = s.length();
		stack<String> greeting = new StackLink<>();
		String str[] = new String[n];
		for(int i=0;i<n;i++)
		{
			str[i] = s.charAt(i)+"";
			greeting.push(str[i]);
		}
		for(int i=0;i<n;i++)
		System.out.print(greeting.pop());
	}

}

