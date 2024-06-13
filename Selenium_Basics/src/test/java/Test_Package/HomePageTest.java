package Test_Package;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.Base;
import Utilities.ExcelUtility;

public class HomePageTest extends Base
{
	@Test
	public void verifyhomepagetitle() throws IOException
	{
		try
		{
			driver.get("https://demowebshop.tricentis.com/");
			String Title=driver.getTitle();
			String expectedTitle=ExcelUtility.readStringData(0,0,"Homepage");
			Assert.assertEquals(Title, expectedTitle,"Home page title is not as expected");
		}
		catch(Exception e)
		{
			throw new RuntimeException("Title is not same");
		}
	}
	@Test
	public void verifyCommunityPoll() throws IOException 
	{
	try
	{
		driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> communityPollOptions = driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
	    for(WebElement radiobutton : communityPollOptions)
	    {
	    	 String radiobuttontext = radiobutton.getText();
	         System.out.println("Option: " +radiobuttontext);
	         String optionselected=ExcelUtility.readStringData(1,0,"Homepage");
	         if (radiobuttontext.equals(optionselected)) 
	         {
	        	 radiobutton.click();
	         }
	    }
	    WebElement radiogood=driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
 		boolean isradiogoodselected=radiogood.isSelected();

 		Assert.assertTrue(isradiogoodselected, "Good is not selected");
	}
	catch(Exception e)
	{
		throw new RuntimeException("Mentioned option is not selected");
	}
 		
	}
}
