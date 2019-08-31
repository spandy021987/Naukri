package generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Scroll(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void scrolldown(WebElement ele) {
		Point loc=ele.getLocation();
		int x = loc.getX();
		int y =loc.getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");

	}

	public void scrollup(WebElement ele) {
		Point loc=ele.getLocation();
		int x = loc.getX();
		int y =loc.getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + -x + "," + -y + ")");

	}

	public void findElementID(String Id, String text) {
		js.executeScript("document.getElementById(Id).value=text");

	}

}
