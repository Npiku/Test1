package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowActionExample   {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		

		WebDriver driver =new ChromeDriver();
		
			
		driver.get("https://www.google.com/search?q=instagram+login&oq=in&aqs=chrome.1.69i57j69i59j0i67l2j69i65j69i61l3.2892j0j4&sourceid=chrome&ie=UTF-8");
	

//		Actions action  = new Actions (driver);
		
	WebElement Contextclick = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
	
	Actions action  = new Actions (driver);
	
	action.contextClick(Contextclick).perform();
	
	
	
		
		
		
		
	}

}
