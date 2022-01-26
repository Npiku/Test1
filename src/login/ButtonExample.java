package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\elcot\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		Point location = driver.findElement(By.id("position")).getLocation();
		
		System.out.println(location);
		
		int x = location.getX();
		
		int y = location.getY();
		
		System.out.println("Xvalue is:"+x + "yvalue is :"+ y);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		System.out.println(size);
		
		int height = size.getHeight();
		
		int width = size.getWidth();
		
		System.out.println("Height is:"+height+ "Width"+ width );
		
		driver.findElement(By.linkText("Home Page")).click();
		
	
		
		
	}

}
