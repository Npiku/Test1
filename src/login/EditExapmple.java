package login;


//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExapmple {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		

		driver.findElement(By.id("email")).sendKeys("Pikachu@1208@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Prakash");

		String attribute = driver.findElement(By.name("username")).getAttribute("value");

		System.out.println(attribute);
		
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();

		boolean enabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();

		System.out.println(enabled);
	}
}
