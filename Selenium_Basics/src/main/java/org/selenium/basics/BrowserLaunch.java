	package org.selenium.basics;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) 
	{
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.seleniumeasy.com/");
		drive.manage().window().maximize();
	}

}
