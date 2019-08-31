package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Actions1;
import generics.Basic_page;

public class Naukripom  extends Basic_page{

	public Naukripom(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@title='Jobseeker Login']")
private WebElement button1;
@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
private WebElement tbox1;
@FindBy(name="PASSWORD")
private WebElement tbox2;
@FindBy(xpath="//button[.='Login']")
private WebElement button2;
@FindBy(xpath="//a[@title='Search Jobs']")
private WebElement tab1;
public void click()
{
	button1.click();
}
public void  setemail(String ename) {
	tbox1.sendKeys(ename);
}
public void  setpass(String password) {
	tbox2.sendKeys(password);
}
public void click1()
{
	button2.click();
}
public void mouseoveraction()
{
	Actions1 act=new Actions1(driver);
	act.mouseoveraction(tab1);
	
}}
	


