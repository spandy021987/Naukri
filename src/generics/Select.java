package generics;


	

	import java.util.List;

import org.openqa.selenium.WebElement;

	public class Select{
		

		Select s = null;
		
		
			
		public Select(WebElement target) {
					
				s=new Select(target);
				
		}

		public boolean ifMultiple()
		{
			
		return s.isMultiple();
		}
		

		private boolean isMultiple() {
			// TODO Auto-generated method stub
			return false;
		}

		public void selectByIndex(int index)
		{
			
			s.deselectByIndex(index);
			
		}
		
		private void deselectByIndex(int index) {
			// TODO Auto-generated method stub
			
		}

		public void selectByvalue(String value) throws InterruptedException
		{
					
			s.selectByValue(value);
		}
		
		private void selectByValue(String value) {
			// TODO Auto-generated method stub
			
		}

		public void selectByText(String text)
		{
			s.selectByVisibleText(text);		
		}
		
		private void selectByVisibleText(String text) {
			// TODO Auto-generated method stub
			
		}

		public void delectAll()
		{
			s.delectAll();
		}
		
		public void deSelectByIndex(int index)
		{
			s.deselectByIndex(index);
		}
		
		public void deSelectByvalue(String value)
		
		{
			s.deSelectByvalue(value);
		}
		
		public void deSelectByText(String text)
		{		
			s.deselectByVisibleText(text);
		}
		
		private void deselectByVisibleText(String text) {
			// TODO Auto-generated method stub
			
		}

		public List<WebElement> getOptions()
		{
			return s.getOptions();
			
		}
		public List<WebElement> allSelectedOptions(String text)
		{
			return s.getAllSelectedOptions();
		}
		
		private List<WebElement> getAllSelectedOptions() {
			// TODO Auto-generated method stub
			return null;
		}

		public WebElement firstSelectedOptions(String text)
		{
			return s.getFirstSelectedOption();
		}

		private WebElement getFirstSelectedOption() {
			// TODO Auto-generated method stub
			return null;
		}


	}


