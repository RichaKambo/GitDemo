package FormyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormyProject {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		// Creating an object of ObjectPage class and calling method to submit new Form
		ObjectPage newPage = new ObjectPage();
		newPage.FormPage(driver);
		newPage.ConfirmSubmit(driver);
		
		// Creating an object of ComponentsPage class and calling method to select different options from Components dropdown
		ComponentsPage componentsPage = new ComponentsPage();
		componentsPage.Components(driver);
		
		System.out.println("This is the pulled code from github");
	}

}
