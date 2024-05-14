package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands 
{
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
		cmdobj.verifySwagLabLoginnew();
		cmdobj.verifydemowebshopLogin();
	}

}
