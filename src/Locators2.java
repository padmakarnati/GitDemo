import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
		// WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		 
		 
		 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
