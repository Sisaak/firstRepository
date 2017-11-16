package palindromeChecker;

import java.util.Scanner;

public class PalindromeChecker 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a palindrome:");
		String nextString = in.next();
		//if the string is a palindrome, this will display "It is a palindrome"
		if(checkNext(nextString))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}		
	}
	//this method checks to see if the first and the last character of the string are the same
	//if they are, this method calls itself again and keeps checking first and last characters until true or false is returned
	public static Boolean checkNext(String str)
	{

		if(str.charAt(0) == str.charAt(str.length() - 1))
		{
			if(str.length() == 3 || str.length() == 2)
			{
				return true;
			}
			else
			{
				//this recursive move calls this method with the same string without the first and last letters on it
				return checkNext(str.substring(1, str.length() - 1));
			}
		}
		else
		{
			return false;
		}
		
	}
	
}
