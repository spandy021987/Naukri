package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions1{
	
	
	Actions act;
	
	public Actions1(WebDriver driver)
	{
		
		act=new Actions(driver);
	}
	

	public void mouseoveraction(WebElement target)
	{
	act.moveToElement(target).perform();	
	}
	
	public void draganddrop(WebElement target,WebElement Source)
	{
		
		
		act.dragAndDrop(Source, target).perform();
	}
	
	public void doubleclick(WebElement target)
	{
		
		
		act.doubleClick(target).perform();
				
	}
			
	public void rightclick(WebElement target)
	{
		
		act.contextClick(target).perform();
		
	}


	
	


}
