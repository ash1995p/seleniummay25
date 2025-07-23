package parametertesng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test11 {
	
	@Parameters({"username","password"})
	@Test
	public void loginTest(String uname,String pass)
	{
		System.out.println(uname+pass);
	}

}
