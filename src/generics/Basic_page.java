package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Basic_page {
	
	public WebDriver driver;
	
	public Basic_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyTitle(String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		try{
			
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is Matching",true);
			
		}
		
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
		
		}
	}
	public void verifyElement(WebElement element)
	{
	
		WebDriverWait wait= new WebDriverWait(driver,10);
		try{
		
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Matching",true);
		
		}
	
		catch(Exception e)
		{
			Reporter.log("Element is not matching",true);
			Assert.fail();
	
		}
		
	}

}

