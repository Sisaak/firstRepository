package weekTen;

import java.util.ArrayList;

public class FibonacciSum {

	ArrayList<Integer> fibonacciSequence= new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
		FibonacciSum fs = new FibonacciSum();
		fs.getSequence(2000000000);
		System.out.println(fs.sumOfOdds());
	}
	//this method inserts the fibonacci sequence into an array list with the max number being inserted by the user
	public void getSequence(int max)
	{
		int lastLast = 0;
		int last = 1;
		fibonacciSequence.add(last);
		while(lastLast + last <= max)
		{
			int curr = last + lastLast;
			fibonacciSequence.add(curr);
			lastLast = last;
			last = curr;
		}
	}
	//this method add all of the odd numbers in the array list and returns the sum
	public int sumOfOdds()
	{
		int total = 0;
		for(int i = 0; i < fibonacciSequence.size(); i++)
		{
			if(fibonacciSequence.get(i) % 2 == 1)
			{
				total = total + fibonacciSequence.get(i);
			}
		}
		return total;
	}
	

}
