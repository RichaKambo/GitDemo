package FormyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectPage {
	
	
	public void FormPage(WebDriver driver) throws InterruptedException {


	driver.findElement(By.className("form-control")).sendKeys("Richa");
	
	driver.findElement(By.id("last-name")).sendKeys("Kambo");
	
	driver.findElement(By.id("job-title")).sendKeys("QA Analyst");
	
	driver.findElement(By.cssSelector("input[value='radio-button-2']")).click();
	
	driver.findElement(By.id("checkbox-2")).click();
	
	WebElement YearsExp = driver.findElement(By.id("select-menu"));
	
	Select YearsofExp = new Select(YearsExp);
	YearsofExp.selectByIndex(2);
	
	WebElement dob = driver.findElement(By.id("datepicker"));
	dob.sendKeys("10/10/2006");
	dob.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(2000);
	
	}
	
	public void ConfirmSubmit(WebDriver driver) {
		
	WebElement successmsg = driver.findElement(By.cssSelector("div[class='alert alert-success']"));
	String success = successmsg.getText();
	
	if (success.equals("The form was successfully submitted!"))
	{
		System.out.println("Form details succeeded");
	}
	else
		System.out.println("Error in form submission");
	}
	
}
