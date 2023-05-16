import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("autosuggest")).sendKeys("ind");
		 List<WebElement> elements=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 
		 for(WebElement option:elements)
		 {
			 if(option.getText().equalsIgnoreCase("India"))
				 option.click();
			 break;

		 }

	}

}
