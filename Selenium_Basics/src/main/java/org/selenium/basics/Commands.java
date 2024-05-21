package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Commands
{
	public void verifymousehover()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		WebElement move2_option=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions action=new Actions(driver);
		action.moveToElement(move2_option).build().perform();
		
		WebElement subset_option=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(subset_option).build().perform();

		driver.close();	
	}
	
	public void verifydraganddropoffset()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		WebElement dragme=driver.findElement(By.xpath("//div[@id='dragBox']"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragme, 50, 55).build().perform();
		driver.close();
	}
	public void verifydraganddrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropdown=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragme, dropdown).build().perform();
		//driver.close();
		
	}
	public void verifydoubliclickme()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubliclickme_button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubliclickme_button).build().perform();
		
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println(alerttext);
		alert.accept();
		driver.close();
		
	}
	public void verifymouserightclick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightclickme_button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclickme_button).build().perform();
		driver.close();
	}
	public void verifynoofdropdownvalues()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select selectobj=new Select(country_dropdown);
		
		List<WebElement> dropdownlist=selectobj.getOptions();
		System.out.println("Total no of countries in the dropdown list: "+dropdownlist.size());
	}
	public void verifyvaluesfromdropdown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select selectobj=new Select(country_dropdown);
		//selectobj.selectByVisibleText("ANGOLA");
		//selectobj.selectByIndex(8);
		selectobj.selectByValue("BARBADOS");
		WebElement firstoption=selectobj.getFirstSelectedOption();
		String fo=firstoption.getText();
		System.out.println(fo);
		driver.close();
	}
	
	public void verifymultipleoptionsfromdropdownlist()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");	
		driver.manage().window().maximize();
		
		WebElement mutiselect=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectobj=new Select(mutiselect);
		boolean selectedoptions=selectobj.isMultiple();
		System.out.println("Multiple values are selected: "+selectedoptions);
		
		selectobj.selectByIndex(2);
		selectobj.selectByIndex(0);
			List<WebElement> listofselectedoption =selectobj.getAllSelectedOptions();
			for(WebElement e:listofselectedoption)
			{
				System.out.println(e.getText());
			}
			selectobj.deselectByIndex(0);
		 } 
	public void verifyisSelector()
	{
		boolean ismaleselected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		ismaleselected=gender_male.isSelected();
		System.out.println("Male before selected: "+ismaleselected);
		gender_male.click();
		ismaleselected=gender_male.isSelected();
		System.out.println("Male after selected: "+ismaleselected);
		driver.close();
		
	}
	public void verifyisEnabled()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement subscribe_button=driver.findElement(By.cssSelector("input#newsletter-subscribe-button"));
		boolean isenabledornot=subscribe_button.isEnabled();
		System.out.println("Subscribed button isd Enable"+isenabledornot);
		subscribe_button.click();
		isenabledornot=subscribe_button.isEnabled();
		System.out.println("Subscribed button isd Enable"+isenabledornot);
		
	}

	public void verifyisDisplayed()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isvotedisplayed=vote_button.isDisplayed();
		System.out.println("Is the vote button displayed: "+isvotedisplayed);
	}

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
		cmdobj.verifymousehover();
		
		
	}

}
