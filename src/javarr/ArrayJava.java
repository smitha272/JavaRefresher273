package javarr;

public class ArrayJava {

	public int maxOfArray(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,-2,3,-4,5};
		int maximum;
		ArrayJava aj = new ArrayJava();
		maximum = aj.maxOfArray(a);
		System.out.println(maximum);
	}
}
