import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector("input[placeholder='Date of travel']")).click();
		
		System.out.println("this is for develp branch in calender1");
		System.out.println("this is for develp branch in calender2");
		System.out.println("this is for develp branch in calender3");
		
		System.out.println("this is change in dynamic checkbox1");
		
		while(!driver.findElement(By.cssSelector(".flatpickr-calendar.animate.open.arrowBottom .flatpickr-month")).getText().contains("October ")) {
			driver.findElement(By.cssSelector(".flatpickr-month .flatpickr-next-month")).click();
		}
		
		Thread.sleep(3000);
		List<WebElement> dates=driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day')]"));
		int count=dates.size();
		for(int i=0;i<count;i++) {
			String name=driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day')]")).get(i).getText();
			if(name.equalsIgnoreCase("20")) {
				driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day')]")).get(i).click();
				break;
			}
			
		}
		
//		driver.close();

	}

}
