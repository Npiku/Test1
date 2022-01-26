package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\elcot\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement findElement = driver.findElement(By.id("dropdown1"));

		Select s = new Select (findElement);

		s.selectByVisibleText("Selenium");
		
		findElement.sendKeys("Loadrunner");

		s.selectByValue("3");

		List<WebElement> options = s.getOptions();

		int size = options.size();

		System.out.println(size);

		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select q = new Select (findElement2);
		
		q.selectByIndex(1);
		q.selectByIndex(2);
		


	}

}
