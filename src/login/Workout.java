package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Workout extends BaseClass {

	public static void main(String[] args) throws IOException {

		Browserlanch("chrome");
		geeturl("http://automationpractice.com/index.php");
		Click(By.linkText("More"));
		select(By.id("group_1"), "2", 1);
		Click(By.className("icon-plus"));
		Click(By.xpath("//p[@id=\"add_to_cart\"]"));
		Click(By.xpath("//a[@title='Proceed to checkout']"));
		

	
		
		
}

}
