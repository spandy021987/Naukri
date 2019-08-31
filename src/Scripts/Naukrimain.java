package Scripts;

import org.testng.annotations.Test;

import POM.Naukripom;
import generics.Excel1;
import generics.Generic_Class;

public class Naukrimain {
public class testNaukrimain extends Generic_Class
{
	@Test
	public void testNaukrimain()
	{
		Naukripom n= new Naukripom(driver);
		n.click();
		String ea = Excel1.getcellvalue("Naukrilogin",1,0);
		String pwd= Excel1.getcellvalue("Naukrilogin",1,1);
		n.click1();
		n.mouseoveraction();
		
		
		
	}
	System.out.println("Hello World");
	Reporter.log(1,"true");
	
}
}
