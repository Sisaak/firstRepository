package weekTen;

import java.util.ArrayList;

public class FibonacciSum {

	ArrayList<Long> fibonacciSequence= new ArrayList<Long>();
	
	public static void main(String[] args) 
	{
		FibonacciSum fs = new FibonacciSum();
		System.out.println(fs.getSequence(2000000000));
	}
	//this method inserts the fibonacci sequence into an array list with the max number being inserted by the user
	public long getSequence(int max)
	{
		long lastLast = 0;
		long last = 1;
		long total = 1;
		while((lastLast + last) < max)
		{
			long curr = last + lastLast;
			if(curr % 2 == 1)
			{
				total = total + curr;
			}
			lastLast = last;
			last = curr;
		}
		return total;
	}
	

}
