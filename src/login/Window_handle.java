package login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		String Oldwindow = driver.getWindowHandle();

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String Newwindow : windowHandles) {

			driver.switchTo().window(Newwindow);

		}
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[1]")).click();

		driver.close();

		driver.switchTo().window(Oldwindow);
//
//
//		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
//
//
//		int size = driver.getWindowHandles().size();
//
//
//		System.out.println(size);
//		
		Thread.sleep(5000);
		
		driver.findElement(By.id("color")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
			
		for (String Allwindow : windowHandles2) {
			
			if (!Allwindow.equals(Oldwindow)) {
				
				driver.switchTo().window(Allwindow);
				driver.close();
				
			}
			
		}
		
		}
		
		
	}





