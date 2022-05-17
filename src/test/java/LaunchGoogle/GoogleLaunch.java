package LaunchGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLaunch {


		WebDriver driver;

		@Test(groups = { "all" })

		public void setUp() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // maximize the window
			driver.manage().deleteAllCookies(); // delete all cookies
			driver.get("https://yahoo.com"); // Go URL
		
			driver.findElement(By.linkText("Sign in")).click();
		
			driver.findElement(By.linkText("Create an account")).click();
				
			driver.findElement(By.cssSelector("#usernamereg-firstName")).sendKeys("Jai");
			
			driver.findElement(By.cssSelector("#usernamereg-lastName")).sendKeys("krishna");
					
		    driver.findElement(By.cssSelector("#usernamereg-yid")).sendKeys("Jaikrishna2022");
		    
		    driver.findElement(By.cssSelector("#usernamereg-password")).sendKeys ("Abcd123!");
		    
		    driver.findElement(By.cssSelector("#usernamereg-phone")).sendKeys ("2098146671");
					
		    driver.findElement(By.cssSelector ("#reg-submit-button")).click();
				
		    Select select = new Select (driver.findElement(By.cssSelector("#usernamereg-month")));
		    
		    select.selectByVisibleText("December");	
			   
			driver.findElement(By.cssSelector ("#usernamereg-day")).sendKeys("14");
			    		
			driver.findElement(By.cssSelector ("#usernamereg-year")).sendKeys ("1990");
			     
		   driver.findElement(By.cssSelector ("#reg-submit-button")).click ();
		   
		   driver.quit();
			

	}

}
