package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowserCmds {

	public static void main(String[] args) 
	{
		WebDriver edriver=new EdgeDriver();
		edriver.get("https://www.amazon.in/");
		edriver.manage().window().maximize();
		
		String Title=edriver.getTitle();
		System.out.println(Title);
		
		String url=edriver.getCurrentUrl();
		System.out.println(url);
		
		String handle=edriver.getWindowHandle();
		System.out.println(handle);
		
		String code=edriver.getPageSource();
		System.out.println(code);
		
		edriver.close();
		
	}
}
