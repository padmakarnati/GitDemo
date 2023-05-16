import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1.total links in the webpage

		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2.total links in the footersection
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3.total links in the first column of the footer
		WebElement links = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int columncount = links.findElements(By.tagName("a")).size();
		System.out.println(columncount);

		// 4.click on each link of the column and check its opening..
		for (int i = 1; i < columncount; i++) {
			String controlclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(controlclick);
			Thread.sleep(5000L);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();

			while (itr.hasNext()) {
				driver.switchTo().window(itr.next());

				System.out.println(driver.getTitle());
			}
		
	
		
		driver.close();
		

	}

}
