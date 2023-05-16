import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Firefox launch
		//geckodriver
		
		/*
		 * System.setProperty("webdriver.gecko.driver","C://Users//HP//Documents/geckodriver.exe"); 
		 * WebDriver driver=new FirefoxDriver();
		 * 
		 * driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 * System.out.println(driver.getTitle());
		 */

		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); 
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
	}

}
