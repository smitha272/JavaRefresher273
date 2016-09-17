package pkg;

public class GenericMethod {
	   //Write your code here
	   public static <T extends Comparable<T>> T maxOf(T x, T y, T z)
	   {                      
	      T max = x;        
	      if ( y.compareTo( max ) > 0 ){
	         max = y; 
	      }
	      if ( z.compareTo( max ) > 0 ){
	         max = z;                  
	      }
	      return max;    
	   }

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        maxOf(10,20,30);
        maxOf("George","Yohan","Youzhny");
       
	}

}
