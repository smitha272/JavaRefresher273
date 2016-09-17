package multi;

import java.util.Arrays;

public class MaxClass  {
	public int diff = 0;
	int ma;
	int mi;
	
	public synchronized int maxArray(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	public synchronized int minArray(int[] arr){
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}	
	
	public int diffMaxMin(int[] arr){
		int [] a;
		a = Arrays.copyOf(arr, arr.length);
		
		
		
		Thread thread1 = new Thread(new Runnable() {
				
				public void run() {
					ma = maxArray(a);
				}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				mi = minArray(a);
			}
			});
		
		thread1.start();
		thread2.start();
				
		try {
			
			thread1.join();
			thread2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		diff = ma -mi;
	return diff;
	}
}

