package Basics;

import java.net.HttpURLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.URL;

public class Amazon {
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		List<WebElement >links=driver.findElements(By.xpath("//a"));
		int count= links.size();
		System.out.println(count);
		
		for(WebElement ele2:links)
		{   Thread.sleep(3000);
			String url= ele2.getAttribute("href");
			
			VerifyLink(url);
		}
		
		
	}
	

	public static void VerifyLink(String urlLink) {
		// TODO Auto-generated method stub
		try
		{
			URL link=new URL(urlLink);
			HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
			httpConn.connect();
			if(httpConn.getResponseCode() == 200)
			{
				System.out.println(urlLink+ "-" +httpConn.getResponseMessage());
				
				count++;
				System.out.println(count);
			}
			
			else if(httpConn.getResponseCode()==404)
			{
				System.out.println(urlLink+ "-" + httpConn.getResponseMessage());
			}
			else if(httpConn.getResponseCode() == 400)
			{
				System.out.println(urlLink+ "-" + httpConn.getResponseMessage());
			}
			else 
			{
				System.out.println(urlLink+ "broken link");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("caught");
		}
		
		
	}

}
