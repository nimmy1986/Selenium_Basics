package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.Base;

public class RegistrationPageTest extends Base
{
	@Test
	public void verifyregistrationpagetitle()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String title=driver.getTitle();
		String expectedtitle="Demo Web Shop Register";
		Assert.assertEquals(title, expectedtitle," Loginpage tile is not as expectedtitle");
	}
	@Test
	public void verifyuserregistration()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement female=driver.findElement(By.id("gender-female"));
		female.click();
		
		WebElement first_name=driver.findElement(By.id("FirstName"));
		first_name.sendKeys("Ria");
		
		WebElement last_name=driver.findElement(By.id("LastName"));
		last_name.sendKeys("Anup");
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("riaanup06@gmail.com");
		
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("pwd1234");
		
		WebElement cnf_pwd=driver.findElement(By.id("ConfirmPassword"));
		cnf_pwd.sendKeys("pwd1234");
		
		WebElement register_button=driver.findElement(By.name("register-button"));
		register_button.click();
		
		WebElement text=driver.findElement(By.xpath("//div[@class='result']"));
		String actualtext=text.getText();
		
		String expectedtext="Your registration completed";
		Assert.assertEquals(actualtext, expectedtext, "The Specified Email Already Exist");
		
	}

	
}
