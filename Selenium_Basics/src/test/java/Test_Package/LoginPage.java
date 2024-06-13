package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.Base;
import Utilities.ExcelUtility;
import dataprovider.dataproviders;

public class LoginPage extends Base
{
	@Test
	public void loginpagetitle()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		String expectedtitle=ExcelUtility.readStringData(0 ,0,"Loginpage");
		Assert.assertEquals(title, expectedtitle," Loginpage tile is not as expectedtitle");
	}
	@Test
	public void verifyuserlogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		ExcelUtility.readStringData(0,0,"Loginpage");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("pwd1234");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		
		WebElement useridontop=driver.findElement(By.xpath("//a[text()='nimmyanup26@gmail.com']"));
		String userid_top=useridontop.getText();
		String expecteduseridontop="nimmyanup26@gmail.com";
		
		Assert.assertEquals(userid_top, expecteduseridontop,"User is not logged in");
		
	}
	@Test(dataProvider="InvalidUserCredentials", dataProviderClass=dataproviders.class)
	public void verifyinvaliduserlogin(String usrnm,String pwd)
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys(usrnm);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys(pwd);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		
		WebElement invalidcredentialstext=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String actualerromessage=invalidcredentialstext.getText();
		System.out.println(actualerromessage);
		String expectederrormessage=ExcelUtility.readIntegerData(1, 0,"Loginpage");
		Assert.assertEquals(actualerromessage, expectederrormessage, "Incorrect Error message");
	}
}
