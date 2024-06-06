package Test_Package;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.Base;

public class HomePageTest extends Base
{
	@Test
	public void verfyhomepagetitle()
	{
	driver.get("https://demowebshop.tricentis.com/");
	String Title=driver.getTitle();
	String expectedTitle="Demo eb Shop";
	Assert.assertEquals(Title, expectedTitle,"Home page title is not as expected");
	}
	@Test
	public void verifyCommunityPoll() 
	{
	
		driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> communityPollOptions = driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
	    for(WebElement radiobutton : communityPollOptions)
	    {
	    	 String radiobuttontext = radiobutton.getText();
	         System.out.println("Option: " +radiobuttontext);
	         
	         if (radiobuttontext.equalsIgnoreCase("Good")) 
	         {
	        	 radiobutton.click();
	         }
	    }
	    WebElement radiogood=driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
 		boolean isradiogoodselected=radiogood.isSelected();

 		Assert.assertTrue(isradiogoodselected, "Good is not selected");
 		
	}
}
