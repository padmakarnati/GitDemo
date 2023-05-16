import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Newwindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		//switch windows
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String>itr=handles.iterator();
		String parentwindow=itr.next();
		String childwindow=itr.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String coursetitle=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		
		driver.switchTo().window(parentwindow);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(coursetitle);
		
		//screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		
	}

}

