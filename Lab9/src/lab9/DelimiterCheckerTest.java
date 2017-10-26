package lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class DelimiterCheckerTest {

	@Test
	public void test() 
	{
		Boolean t1 = DelimiterChecker.check("(asdf{asf[asd]fas}ssdsdfsdfsfd)");//should be true
		assertTrue(t1);
		Boolean t3 = DelimiterChecker.check("");//should be true
		assertTrue(t3);
		Boolean t2 = DelimiterChecker.check("[(asdf{asf[asd]fas}ssdsdfsdfsfd)");//should be false
		assertFalse(t2);
		
	}

}
