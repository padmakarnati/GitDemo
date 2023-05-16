import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		// 1.Get all the urls tiedup to the links using selenium
		//2.Java methods calls the URLs to get the status code
		//3.if the status code is >400 url is not working
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		int count=0;
		SoftAssert a =new SoftAssert();
		for(WebElement link:links) {
			String url=link.getAttribute("href");
	
		
     // String url= driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
      HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
      conn.setRequestMethod("HEAD");
      conn.connect();
      int rescode= conn.getResponseCode();
      System.out.println(rescode);
      a.assertTrue(rescode<400, "The link with text" +link.getText() + "is broken with response code" +rescode);
      if(rescode>400) {
    	  count++;
    	
      }
		}
		 System.out.println("Number of broken links "+count);
      a.assertAll();

		}
}

