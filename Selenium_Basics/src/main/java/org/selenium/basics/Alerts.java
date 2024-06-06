package org.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{
	
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement clickme_button=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme_button.click();
		
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		driver.close();
		
	}
	
	public  void verifypromptalert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement clickme_button=driver.findElement(By.cssSelector("button#promtButton"));
		clickme_button.click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.sendKeys("Nimmy");
		alert.accept();
		driver.close();
	}
	
	public void verifyConfirmationAlert()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement clickeme=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickeme.click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Confirmation Message: "+text);
		
		alert.accept();
		WebElement confirmation_message=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String conofirmationmessage=confirmation_message.getText();
		System.out.println("After select alert box options: "+conofirmationmessage);
		driver.close();
	}
	
	public static void main(String[] args) 
	{
		Alerts alertobj=new Alerts();
		alertobj.verifyConfirmationAlert();
	}

}
