package CommandsAssignment1;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommandsAssignment2 
{
	public void verifyqabibledraganddrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag1, drop).build().perform();
		
		WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		action.dragAndDrop(drag2, drop).build().perform();
		
		WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		action.dragAndDrop(drag3, drop).build().perform();
		
		WebElement drag4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		action.dragAndDrop(drag4, drop).build().perform();
		driver.close();
	}
	public void verifydemoguru99deletecustomerform()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customerID_field=driver.findElement(By.xpath("//input[@name='cusid']"));
		customerID_field.sendKeys("Gia1234");
		
		WebElement submit_button=driver.findElement(By.xpath("//input[@name='submit']"));
		submit_button.click();
		
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println("Text on the Alert: "+alerttext);
		
		alert.accept();
		alerttext=alert.getText();
		System.out.println(alerttext);
		
		
	}
	public void verifyselectinputdemo()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement selectcolordropdownlist=driver.findElement(By.cssSelector("select#single-input-field"));
		Select obj=new Select(selectcolordropdownlist);
		List<WebElement> options=obj.getOptions();
		System.out.println("No of options= "+options.size());
		obj.selectByIndex(1);
		
		WebElement firstoption=obj.getFirstSelectedOption();
		String fo=firstoption.getText();
		System.out.println(fo);
		driver.close();
		
	}
	public static void main(String[] args) 
	{
		CommandsAssignment2 ca2=new CommandsAssignment2();
		//ca2.verifyselectinputdemo();
		ca2.verifyqabibledraganddrop();
		
		
	}

}
