package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands 
{
	public void verifydemowebshopRegister()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.className("ico-register"));
		register.click();
		
		WebElement female=driver.findElement(By.id("gender-female"));
		female.click();
		
		WebElement first_name=driver.findElement(By.id("FirstName"));
		first_name.sendKeys("Gia");
		
		WebElement last_name=driver.findElement(By.id("LastName"));
		last_name.sendKeys("Anup");
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("giaanup08@gmail.com");
		
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("pwd1234");
		
		WebElement cnf_pwd=driver.findElement(By.id("ConfirmPassword"));
		cnf_pwd.sendKeys("pwd1234");
		
		WebElement register_button=driver.findElement(By.name("register-button"));
		register_button.click();
		
	}
	public void verifyguru99registration()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement register_link=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		register_link.click();
		
		WebElement first_name=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"));
		first_name.sendKeys("Gia");
		
		WebElement last_name=driver.findElement(By.name("lastName"));
		last_name.sendKeys("Anup");
		
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9061608685");
		
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("giaanup08@gmail.com");
		
		WebElement address=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		address.sendKeys("Ajantha, Sreenivasapuram po, Varkala");
		
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Trivandrum");
		
		WebElement state=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > input"));
		state.sendKeys("Kerala");
		
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		postalcode.sendKeys("695145");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("giaanup08@gmail.com");
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("pwd1234");
		
		WebElement cnfpwd=driver.findElement(By.name("confirmPassword"));
		cnfpwd.sendKeys("pwd1234");
		
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		
	}
	public void verifynoftagsintheapplication()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		List<WebElement> Inputtype=driver.findElements(By.tagName("input"));
		int Inputsize=Inputtype.size();
		System.out.println(Inputsize);
	}
	public void verifyLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination_field=driver.findElement(By.linkText("your destination"));
		destination_field.click();
	}
	public void verifypartialLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination_field=driver.findElement(By.partialLinkText("destination"));
		destination_field.click();
	}
	public void verifydemowebshopLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement login_link=driver.findElement(By.className("ico-login"));
		login_link.click();
		
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys("nimmyanup26@gmail.com");

		WebElement pwd_field=driver.findElement(By.id("Password"));
		pwd_field.sendKeys("pwd1234");

		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		//driver.close();
		
		
	}
	public void verifydemowebshop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.className("ico-register"));
		register.click();
		driver.close();
		
	}
	public void verifySwagLabLoginnew()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username_field=driver.findElement(By.className("input_error"));
		username_field.sendKeys("standard_user");
		WebElement password_field=driver.findElement(By.name("password"));
		password_field.sendKeys("secret_sauce");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
		//driver.close();
		
	}
	/*public void verifySwagLabLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximise();
		WebElement username_field=driver.findElement(By.id("user-name"));
		username_field.sendKeys("standard_user");
		WebElement password_field=driver.findElement(By.id("password"));
		password_field.sendKeys("secret_sauce");
		WebElement login_button=driver.findElement(By.id("login-button"));
		login_button.click();
		driver.close();
		
	}*/
	public static void main(String[] args) 
	{
		Commands cmdobj=new Commands();
		//cmdobj.verifydemowebshop();
		//cmdobj.verifySwagLabLogin();
		//cmdobj.verifySwagLabLoginnew();
		//cmdobj.verifydemowebshopLogin();
		//cmdobj.verifypartialLinkText();
		//cmdobj.verifynoftagsintheapplication();
		//cmdobj.verifydemowebshopRegister();
		cmdobj.verifyguru99registration();
		
		
	}

}
