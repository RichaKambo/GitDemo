package FormyProject;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class ComponentsPage {

	public void Components(WebDriver driver) throws InterruptedException {
		
		WebElement ComponentsDrpDwn = driver.findElement(By.id("navbarDropdownMenuLink"));
		ComponentsDrpDwn.click();
		Thread.sleep(1000);
		
		//Clicking on Autocomplete and calling the method 
        driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[1]")).click();	
        Thread.sleep(1000);
		Autocomplete(driver);
		
		//Clicking on Buttons
		Thread.sleep(2000);
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Buttons")).click();
	    
	    //Clicking on Checkbox and calling the method
	    Thread.sleep(2000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[3]")).click();
	    Checkbox(driver);
	    
	    //Clicking on Datepicker
	    Thread.sleep(2000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[4]")).click();
	    datepicker(driver);
	    
	  //Clicking on Drag and drop and calling method for drag&drop functionality
	    Thread.sleep(2000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[5]")).click();
		DragDrop(driver);
		
		//clicking on Enabled and disabled elements and call method to check their functionality
		Thread.sleep(2000);
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[7]")).click();
		EnabledDisabled(driver);
		
		//clicking on File upload and sendkeys - Canva-1.42.0.dmg
		Thread.sleep(2000);
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[8]")).click();
		fileUpload(driver);
		
		//clicking on KeyBoard and Mouse Input and calling a method to select a name from list
		Thread.sleep(2000);
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[9]")).click();
		KeyboardMouseInput(driver);
		
		//clicking on Page Scroll, calling method to simulate page scrolling and moving to the name element
		Thread.sleep(2000);
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[11]"));
		PageScroll(driver);
	
		//Clicking on the Radio Button, calling method to select radio buttons
		Thread.sleep(2000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[12]")).click();
	    RadioButton(driver);
		
		//Clicking on Switch Window, calling method to demonstrate switching window handles 
	    Thread.sleep(2000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/div/a[13]")).click();
	    SwitchWindow(driver);
	    
	    //Clicking on Complete Web Form
	    Thread.sleep(1000);
	    driver.findElement(By.id("navbarDropdownMenuLink")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Complete Web Form")).click();
	    Thread.sleep(1000);
	    driver.get("https://formy-project.herokuapp.com/form");
	    Thread.sleep(2000);
	    driver.quit(); 
		
	}
	
	public void Autocomplete(WebDriver driver) throws InterruptedException {
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		WebElement address = driver.findElement(By.id("autocomplete"));
		address.click();
		address.sendKeys("55,West Street");
		
	}
	
		
	public void Checkbox(WebDriver driver) {
		
		driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.id("checkbox-3")).click();
	}
	
	public void datepicker(WebDriver driver) throws InterruptedException {
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[6]")).click();
		
	}
	
	public void DragDrop(WebDriver driver) {
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		WebElement image=driver.findElement(By.id("image"));
		WebElement box=driver.findElement(By.id("box"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image, box).perform();
	}
		
		public void EnabledDisabled(WebDriver driver) {
			
		driver.get("https://formy-project.herokuapp.com/enabled");
		WebElement disabled = driver.findElement(By.id("disabledInput"));
		WebElement enabled =driver.findElement(By.id("input"));
		if (disabled.isEnabled()==true) 
			System.out.println("Disabled textbox test failed");
		else
			System.out.println("Disabled textbox test passed");
		
		enabled.sendKeys("We can type anything");
		
	}
		
		public void fileUpload(WebDriver driver) throws InterruptedException {
			
			driver.get("https://formy-project.herokuapp.com/fileupload");
			driver.findElement(By.id("file-upload-field")).sendKeys("Canva-1.42.0.dmg");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button")).click();
			driver.findElement(By.id("file-upload-field")).clear();
			
		}
		
		public void KeyboardMouseInput(WebDriver driver) throws InterruptedException {
			
			driver.get("https://formy-project.herokuapp.com/keypress");
			WebElement fullname = driver.findElement(By.id("name"));
			fullname.click();
			Thread.sleep(1000);
			fullname.sendKeys("Ritika");
			driver.findElement(By.id("button")).click();
			
		}
		
		public void PageScroll(WebDriver driver) throws InterruptedException {
			
			driver.get("https://formy-project.herokuapp.com/scroll");
			Thread.sleep(1000);
			WebElement name = driver.findElement(By.id("name"));
			Actions actions = new Actions(driver);
			actions.moveToElement(name);
			name.sendKeys("Richa");
			
		}
		
		public void RadioButton(WebDriver driver) throws InterruptedException {
			driver.get("https://formy-project.herokuapp.com/radiobutton");
			driver.findElement(By.cssSelector("input[value='option2']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[value='option3']")).click();
		}
		
		public void SwitchWindow(WebDriver driver) throws InterruptedException {
			
			driver.get("https://formy-project.herokuapp.com/switch-window");
			driver.findElement(By.id("new-tab-button")).click();
			String OriginalHandle = driver.getWindowHandle();
			for(String handle:driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			Thread.sleep(1000);
			driver.switchTo().window(OriginalHandle);
			WebElement alertbutton= driver.findElement(By.id("alert-button"));
			alertbutton.click();
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			if(alertmsg.equals("This is a test alert!"))
				System.out.println("Alert test passed");
			else
				System.out.println("Alert test failed");
			Thread.sleep(1000);
			alert.accept();
			
			
		}
			
		
}
