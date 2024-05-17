package CommandsAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommandsAssignment 
{
	public void VerifySingleInputForm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement entermessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessagefield.sendKeys("Hello1234&");
		
		WebElement showmessage_button=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		showmessage_button.click();
		
		WebElement text=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=text.getText();
		System.out.println(message);
		driver.close();
		
	}
	
	public void verify2inputfield()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		valueA.sendKeys("6");
		
		WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueB.sendKeys("8");
		
		WebElement gettotal_button=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotal_button.click();
		
		WebElement totaltext=driver.findElement(By.xpath("//div[@id='message-two']"));
		String total=totaltext.getText();
		System.out.println(total);
		driver.close();
		
	}
	
	public void verifySingleCheckboxDemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean issinglecheckboxselected=singlecheckbox.isSelected();
		System.out.println(issinglecheckboxselected);
		
		singlecheckbox.click();
		
		issinglecheckboxselected=singlecheckbox.isSelected();
		System.out.println(issinglecheckboxselected);
		
		WebElement successmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=successmessage.getText();
		System.out.println(message);
		driver.close();
		
	}
	
	public void verifyMultipleCheckboxDemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean issinglecheckboxselected=checkbox1.isSelected();
		System.out.println(issinglecheckboxselected);
		
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		issinglecheckboxselected=checkbox2.isSelected();
		System.out.println(issinglecheckboxselected);
		
		WebElement checkbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		issinglecheckboxselected=checkbox3.isSelected();
		System.out.println(issinglecheckboxselected);
		
		WebElement checkbox4=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		issinglecheckboxselected=checkbox4.isSelected();
		System.out.println(issinglecheckboxselected);
		
		WebElement selectall_button=driver.findElement(By.xpath("//input[@id='button-two']"));
		selectall_button.click();
		
		issinglecheckboxselected=checkbox1.isSelected();
		System.out.println(issinglecheckboxselected);
		issinglecheckboxselected=checkbox2.isSelected();
		System.out.println(issinglecheckboxselected);
		issinglecheckboxselected=checkbox3.isSelected();
		System.out.println(issinglecheckboxselected);
		issinglecheckboxselected=checkbox4.isSelected();
		System.out.println(issinglecheckboxselected);
	}
	
	public void verifyradiodemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement malebutton=driver.findElement(By.xpath("//input[@name='inlineRadioOptions'and@id='inlineRadio1']"));
		boolean ismalebuttonselected=malebutton.isSelected();
		System.out.println(ismalebuttonselected);
		
		malebutton.click();
		
		ismalebuttonselected=malebutton.isSelected();
		System.out.println(ismalebuttonselected);
		WebElement showselectedvalue_button=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvalue_button.click();
		
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String text=message.getText();
		System.out.println(text);
		//driver.close();
		
	}
	
	public void verifyformsubmit()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Gia");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("Anup");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("GiaAnup");
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("Trivandrum");
		
		WebElement State=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		State.sendKeys("Kerala");
		
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("695145");
		
		WebElement tc=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		tc.click();
		
		WebElement submitform=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitform.click();
		
		WebElement text=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=text.getText();
		System.out.println(message);
		
		driver.close();
		
	}
	public static void main(String[] args) 
	{
		CommandsAssignment ca=new CommandsAssignment();
		//ca.VerifySingleInputForm();
		//ca.verify2inputfield();
		//ca.verifySingleCheckboxDemo();
		//ca.verifyMultipleCheckboxDemo();
		//ca.verifyradiodemo();
		ca.verifyformsubmit();
		
		
	}

}
