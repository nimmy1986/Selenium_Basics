package org.TestNgCommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class Commands extends BrowserLaunch
{
	@Test
	public void verifyfluentwait()
	{
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement clickme=driver.findElement(By.id("timerAlertButton"));
		clickme.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void verifyWait()

	{

	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	//wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
	WebElement clickme = driver.findElement(By.id("timerAlertButton"));
	clickme.click();
	//wait.until(ExpectedConditions.alertIsPresent());
	Alert alert =driver.switchTo().alert();
	alert.accept();
	}
	@Test
	public void verifykeyboardevents() throws AWTException
	{
		driver.get("https://demowebshop.tricentis.com/");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
		
	@Test
	public void verifyjavascriptexecutorDemoLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName(\"ico-login\")\r\n"
				+ "");
		js.executeScript("document.getElementById(\"Email\").value='nimmyanup26@gmail.com'");
		js.executeScript("document.getElementById(\"Password\").value='pwd1234'");
		
	}
	@Test	
	public void verifyverticalscroll()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		
	}
	@Test
	public void verifyjavascriptexecutor()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"newsletter-email\").value='giaanup08@gmail.com'");
		js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
		
	}
	@Test
	public void verifyisSelector()
	{
		
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean ismaleselected=gender_male.isSelected();
		Assert.assertFalse(ismaleselected, "Gender Male is selected");
		gender_male.click();
		ismaleselected=gender_male.isSelected();
		Assert.assertTrue(ismaleselected, "Gender Male is not Selected");
	}
	@Test
	public void verifyisEnabled()
	{
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscribe_button=driver.findElement(By.cssSelector("input#newsletter-subscribe-button"));
		boolean isenabledornot=subscribe_button.isEnabled();
		//Assert.assertFalse(isenabledornot, "Subscribe Button is Enabled");
		//subscribe_button.click();
		isenabledornot=subscribe_button.isEnabled();
		Assert.assertTrue(isenabledornot,"Subscribe button is not enabled");
		
	}
	@Test
	public void verifyisDisplayed()
	{
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isvotedisplayed=vote_button.isDisplayed();
		Assert.assertTrue(isvotedisplayed, "Vote button is not displayed");
	}
	@Test
	
	public void demotitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle=driver.getTitle();
		System.out.println("Title of the webpage is "+actualtitle);
		String expectedtitle="Demo Web hop";
		Assert.assertEquals(actualtitle, expectedtitle, "Invalid Title");
		
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		
		WebElement emailfield=driver.findElement(By.xpath("//input[@id='Email']"));
		emailfield.sendKeys("nimmyanup26@gmail.com");
		
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='Password']"));
		passwordfield.sendKeys("pwd1234");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		
		WebElement userid=driver.findElement(By.xpath("//a[text()='nimmyanup26@gmail.com']"));
		String useridontop=userid.getText();
		
		String expecteduseridontop="nimmyanp26@gmail.com";
		Assert.assertEquals(useridontop, expecteduseridontop,"Invalid Email id");
	}
		
	}

