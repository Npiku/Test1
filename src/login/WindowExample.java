package login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		String Old  = driver.getWindowHandle();

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();


		// last one will be execute 
		for (String New : windowHandles) {
			driver.switchTo().window(New);
		}

		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[1]")).click();
		driver.close();	
		driver.switchTo().window(Old);


		driver.findElement(By.id("color")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();

		for (String All : windowHandles2) {
			if (!All.equals(Old)) {
				driver.switchTo().window(All);
				driver.close();
			}
			driver.switchTo().window(Old);
			driver.manage().window().maximize();

		}


		//							driver.quit();
	}




}




