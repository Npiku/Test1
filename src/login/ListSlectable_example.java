package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ListSlectable_example {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	

		WebDriver driver =new ChromeDriver();
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> listselet = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		
		Actions Move = new Actions (driver);
//		
//		Move.clickAndHold(listselet.get(1));
//		Move.clickAndHold(listselet.get(2));
//		Move.clickAndHold(listselet.get(3));
//		Move.build().perform();
		
//		Move.keyDown(Keys.CONTROL);
//		
		for (WebElement webElement : listselet) {
			
			if (webElement.getText().equals("Item 2") ){
				
				webElement.click();
			}
			
		}
	
		
		Move.keyDown(Keys.CONTROL).click(listselet.get(0)).click(listselet.get(3)).build().perform();
		

	}

}
