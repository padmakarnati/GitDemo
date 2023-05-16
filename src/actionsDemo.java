import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); 
	
		driver.get("https://www.amazon.com/");
		Actions action=new Actions(driver);
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		action.moveToElement(move).build().perform();
		
		action.moveToElement(driver.findElement(By.cssSelector("form[id='nav-search-bar-form']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		
		//driver.close();
	}

}
