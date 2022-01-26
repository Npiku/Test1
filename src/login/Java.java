package login;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Java {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver =new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
				
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.xpath("(//input[@class=\"hidden\"][2])")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File soruce = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("D:\\Testing\\aaa.png");
		
		FileHandler.copy(soruce, destination);
		
	}

}
