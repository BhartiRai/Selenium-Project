package LaunchGoogle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	WebDriver driver;
	
	@Test(groups = { "all" })

	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all cookies
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Go URL
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
		System.out.println ("correct alert message");
		}
		
		else {
			System.out.println ("incorrect alert message");
			
		}
		alert.accept();		
		
		driver.quit();
	
	}

}
