package Test_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.Base;
import Utilities.ExcelUtility;
import Utilities.RandomDataUtility;

public class RegistrationPageTest extends Base
{
	@Test
	public void verifyregistrationpagetitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String title=driver.getTitle();
		System.out.println(title);
		String expectedtitle=ExcelUtility.readStringData(0,0,"Registrationpage");
		System.out.println(expectedtitle);
		Assert.assertEquals(title, expectedtitle," Loginpage tile is not as expectedtitle");
	}
	@Test
	public void verifyuserregistration()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String firstname=RandomDataUtility.getFirstName();
		String lastname=RandomDataUtility.getLastName();
		String emailid=firstname+"."+lastname+"@gmail.com";
		String password=firstname+"@"+lastname;	
		
		WebElement female=driver.findElement(By.id("gender-female"));
		female.click();
		
		WebElement first_name=driver.findElement(By.id("FirstName"));
		first_name.sendKeys(firstname);
		
		WebElement last_name=driver.findElement(By.id("LastName"));
		last_name.sendKeys(lastname);
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys(emailid);
		
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys(password);
		
		WebElement cnf_pwd=driver.findElement(By.id("ConfirmPassword"));
		cnf_pwd.sendKeys(password);
		
		WebElement register_button=driver.findElement(By.name("register-button"));
		register_button.click();
		
		WebElement text=driver.findElement(By.xpath("//div[@class='result']"));
		String actualtext=text.getText();
		
		String expectedtext=ExcelUtility.readStringData(1, 0, "Registrationpage");
		Assert.assertEquals(actualtext, expectedtext, "The Specified Email Already Exist");
		
	}
}
