package LaunchGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
		
		WebDriver driver;

		
		@Test(groups = { "ebay" })

		public void setUp() throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.ebay.com"); // Go URL
			
			driver.manage().window().maximize(); // maximize the window
			driver.manage().deleteAllCookies(); // delete all cookies	
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //dynamic wait for WebElements to load
			
			Actions action = new Actions(driver);
			
			WebElement element = driver.findElement(By.linkText("Electronics"));
			
			action.moveToElement(element).build().perform();
			
			WebDriverWait wait = new WebDriverWait (driver,10);
			
			wait.until (ExpectedConditions.visibilityOfElementLocated (By.linkText("Video Games")));
				
             WebElement element2 = driver.findElement(By.linkText("Video Games"));
			
			action.moveToElement(element2).build().perform();
			
			driver.close();
	     
	}

}
