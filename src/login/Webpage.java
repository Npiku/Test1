package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
	
		Driver.get("https://www.google.com/search?q=googleinstagram&ei=zt2dYfuuNd6a4t4P2ZKhsAc&ved=0ahUKEwj7zZfOsbD0AhVejdgFHVlJCHYQ4dUDCA4&uact=5&oq=googleinstagram&gs_lcp=Cgdnd3Mtd2l6EANKBAhBGABQAFgwYDdoAHACeACAAQCIAQCSAQCYAQCgAQHAAQE&sclient=gws-wiz");
		
		Driver.findElement(By.linkText("google instagram")).click();
		
		Driver.manage().window().maximize();
		
		Driver.findElement(By.name("q")).clear();
		
		Driver.findElement(By.name("q")).sendKeys("Facebook"+ Keys.ENTER);
		
		Driver.findElement(By.linkText("Log In")).click();
		
		Driver.findElement(By.name("email")).sendKeys("Gopi12");
		
		Driver.findElement(By.name("pass")).sendKeys("gopi12");
		
//		Driver.findElement(By.id("u_0_c_fR"+ Keys.ENTER));
		
		Driver.close();
	}
}
