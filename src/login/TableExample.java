package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		
		driver.get("http://leafground.com/pages/table.html");
		
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/input")).click();

		
		WebElement Size = driver.findElement(By.xpath("//table[@id='table_id']//th"));
	
		System.out.println(Size.getText());
		
//		driver.findElement(by.);
		
		driver.close();
		
	}

}
