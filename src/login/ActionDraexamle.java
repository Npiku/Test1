package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDraexamle {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("draggable"));
		
		Actions Move = new Actions (driver);
		
		Move.dragAndDrop(From, to).build().perform();
		
		
		
}

}
