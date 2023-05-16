import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown =new Select(staticdropdown);
		 dropdown.selectByIndex(3);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 dropdown.selectByVisibleText("AED");
		 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByValue("INR");
		
		 System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
