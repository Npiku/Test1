package login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	private static Object FileUtils;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver =new ChromeDriver();


		driver.get("https://www.google.com/search?q=instagram+login&oq=in&aqs=chrome.1.69i57j69i59j0i67l2j69i65j69i61l3.2892j0j4&sourceid=chrome&ie=UTF-8");


		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);

		File destionaton = new File ("D:\\Testing\\aaa.png");
		
		FileHandler.copy(src, destionaton);
		
	 
		
		
	}

}
