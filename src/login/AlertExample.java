package login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(5000);

		driver.switchTo().alert().accept();


		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("promtButton")).click();

		driver.switchTo().alert().sendKeys("no need");

		Thread.sleep(5000);

		driver.switchTo().alert().accept();

//		driver.close();


	}

}
