package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeNavCmnds {

	public static void main(String[] args) 
	{
		WebDriver edriver=new EdgeDriver();
		
		edriver.get("https://www.amazon.in/");
		edriver.manage().window().maximize();
		edriver.navigate().back();
		edriver.navigate().forward();
		edriver.navigate().refresh();
		edriver.navigate().to("https://www.flipkart.com/");	
		
	}

}
