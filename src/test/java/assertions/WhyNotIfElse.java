package assertions;

import org.testng.annotations.Test;

public class WhyNotIfElse {
	@Test
	public void demo()
	{
		String s1="hi";
		String s2="Hi";
		if(s1.equals(s2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
