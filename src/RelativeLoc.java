import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;



public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nametext=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nametext)).getText());
		
		WebElement emailtext=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(emailtext)).click();
		
		WebElement radiotext=driver.findElement(By.cssSelector("[class='form-check-label']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(radiotext)).click();
		

	}

}
