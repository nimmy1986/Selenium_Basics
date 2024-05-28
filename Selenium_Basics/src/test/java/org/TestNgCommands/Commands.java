package org.TestNgCommands;

import org.testng.annotations.Test;

public class Commands extends BrowserLaunch
{
	@Test
	public void demotitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String Title=driver.getTitle();
		System.out.println("Title of the webpage is "+Title);
	}
}
