import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


//import dev.failsafe.internal.util.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="padma";
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			    ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			    
			    String password=getpassword(driver);
			    driver.get("https://rahulshettyacademy.com/locatorspractice/");
			    driver.manage().window().maximize();
			    driver.findElement(By.id("inputUsername")).sendKeys(name);
			    driver.findElement(By.name("inputPassword")).sendKeys(password);
			    driver.findElement(By.className("submit")).click();
			    Thread.sleep(1000);
			    System.out.println(driver.findElement(By.tagName("p")).getText());
			   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
			   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+ ",");
			   driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			   driver.close();
			   


	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		 //Please use temporary password 'rahulshettyacademy' to Login.
		 
		String passwordarray[]= passwordText.split("'");
		String password=passwordarray[1].split("'")[0];
		
		return password;
		
	}

}
