package lab9;

import java.util.Stack;

public class DelimiterChecker {

	//this method takes in a string and figures out if has correct delimiters.
	public static Boolean check(String str)
	{
		Stack s = new Stack();
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c == '[')
			{
				s.push(c);
			}
			else if(c == ')')
			{
				Boolean found = false;
				while(!(s.isEmpty()))
				{
					if((char)s.peek() != '(')
					{
						s.pop();
					}
					else
					{
						found = true;
						s.pop();
						break;
					}
				}
				if(!found)
				{
					return false;
				}
				
			}
			else if(c == '}')
			{
				Boolean found = false;
				while(!(s.isEmpty()))
				{
					if((char)s.peek() != '{')
					{
						s.pop();
					}
					else
					{
						found = true;
						s.pop();
						break;
					}
				}
				if(!found)
				{
					return false;
				}
			}
			else if(c == ']')
			{
				Boolean found = false;
				while(!(s.isEmpty()))
				{
					if((char)s.peek() != '[')
					{
						s.pop();
					}
					else
					{
						found = true;
						s.pop();
						break;
					}
				}
				if(!found)
				{
					return false;
				}
			}
		}
		if(s.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
