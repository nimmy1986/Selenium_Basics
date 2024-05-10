package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ffoxbrwsrcmds {

	public static void main(String[] args) 
	{
		WebDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.amazon.in/");
		fdriver.manage().window().maximize();
		
		String title=fdriver.getTitle();
		System.out.println(title);
		
		String url=fdriver.getCurrentUrl();
		System.out.println(url);
		
		String handle=fdriver.getWindowHandle();
		System.out.println(handle);
		
		String code=fdriver.getPageSource();
		System.out.println(code);
		
		
	}

}
