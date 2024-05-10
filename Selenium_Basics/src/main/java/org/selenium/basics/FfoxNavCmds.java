package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfoxNavCmds {

	public static void main(String[] args) 
	{
		WebDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.amazon.in/");
		fdriver.manage().window().maximize();
		
		fdriver.navigate().back();
		fdriver.navigate().forward();
		fdriver.navigate().refresh();
		fdriver.navigate().to("https://www.flipkart.com/");
		
	}

}
