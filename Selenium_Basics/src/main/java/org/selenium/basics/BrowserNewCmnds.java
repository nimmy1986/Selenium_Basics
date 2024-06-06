package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNewCmnds {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.close();
	}

}
