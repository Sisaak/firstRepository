package weekTen;


public class LargestPalindrome {

	public static void main(String[] args) 
	{
		LargestPalindrome l = new LargestPalindrome();
		System.out.println(l.testAll());

	}
	//this method tests all products for numbers from 1000 to 9999, the largest and smallest 4-digit number
	public int testAll()
	{
		int maxPalindrome = 0;
		for(int i = 1000; i <= 9999; i++)
		{
			for(int j = 9999; j >= i; j--)
			{
				int num = i*j;
				Integer k = new Integer(num);
				if(testPalindrome(k.toString()))
				{
					if(num > maxPalindrome)
					{
						maxPalindrome = num;
					}
				}
			}
		}
		return maxPalindrome;
	}
	//this method takes in a string and checks to see if the first and last characters are equal and then recurses
	public boolean testPalindrome(String str)
	{
		if(str.charAt(0) == str.charAt(str.length() - 1))
		{
			if(str.length() == 3 || str.length() == 2)
			{
				return true;
			}
			else
			{
				//this recursive method tests the inside of the string to see if it is a palindrome
				return testPalindrome(str.substring(1, str.length() - 1));
			}
		}
		else
		{
			return false;
		}
	}

}
