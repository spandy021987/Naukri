package Reports;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Report1 {
	@Test
	public void  console()
	{
		BasicConfigurator.configure();
		Logger log=  Logger.getLogger(this.getClass().getName());
		log.info("Hi");
		log.warn("Hye");
		log.error("Bye");
	}

}
