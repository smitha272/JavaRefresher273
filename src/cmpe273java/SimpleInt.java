package cmpe273java;

public class SimpleInt implements InterestCalc {
	public double SimpleInterest(double principal,int noOfYears, double rate)
	{
		double Si;
		Si = (principal*noOfYears*rate)/100;
		return Si;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value;
		SimpleInt s = new SimpleInt();
		value = s.SimpleInterest(847.23, 5, 4.34);
		System.out.println(value);
	}

}
