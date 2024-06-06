package CommandsAssignment1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFrames 
{
	
	public void verifyhyrtutorialframes()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		WebElement text_field=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		text_field.sendKeys("This is the Webpage Text box");
		
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int total_frames=totalframes.size();
		System.out.println("Total no of frames = "+total_frames);
		WebElement Frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		driver.switchTo().frame(Frame1);
		
		WebElement course_dropdown=driver.findElement(By.xpath("//*[@id=\"course\"]"));
		Select obj=new Select(course_dropdown);
		obj.selectByValue("python");
		
		WebElement course_selected=obj.getFirstSelectedOption();
		String selectedcourse=course_selected.getText();
		System.out.println("Course Selected is "+selectedcourse);
		driver.switchTo().defaultContent();
		
		WebElement Frame2=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(Frame2);
		
		/*WebElement options_dropdown=driver.findElement(By.id("selectnav1"));
		Select obj1=new Select(options_dropdown);

		obj1.selectByValue("https://www.hyrtutorials.com/p/core-java-telugu.html");
		WebElement option_selected=obj1.getFirstSelectedOption();
		String optionselectedframe2=option_selected.getText();
		System.out.println("Option selected from the dropdown listis: "+optionselectedframe2);*/
			
		WebElement first_name=driver.findElement(By.id("firstName"));
		first_name.sendKeys("Gia");
		
		WebElement last_name=driver.findElement(By.id("lastName"));
		last_name.sendKeys("Anup");	
		
		WebElement female=driver.findElement(By.id("femalerb"));
		female.click();
		
		WebElement english=driver.findElement(By.id("englishchbx"));
		english.click();
		
		WebElement hindi=driver.findElement(By.id("hindichbx"));
		hindi.click();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("giaanup08@gmail.com");
		
		
	}
	
	
	public static void main(String[] args) 
	{
		AssignmentFrames afobj=new AssignmentFrames();
		afobj.verifyhyrtutorialframes();
	}

}
