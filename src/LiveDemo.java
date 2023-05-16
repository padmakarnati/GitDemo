import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all web elements into the list
		List<WebElement> frts=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		//capture text of all webelements into the original list
		
		List<String> frtnames=frts.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list--sorted list
		
		List<String> sortlist=frtnames.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		
		Assert.assertTrue(frtnames.equals(sortlist));
		
		
		//scan the name column with gettext(), Beans -> print the price
		List<String> vegprice;
		do{
			List<WebElement> fruits=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		 vegprice=fruits.stream().filter(s->s.getText().contains("Rice")).map(s->getVegiPrice(s))
		
		.collect(Collectors.toList());
		
		vegprice.forEach(a->System.out.println(a));
		
		if(vegprice.size() < 1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		} }
		while (vegprice.size() < 1);
		
		
	}

	private static String getVegiPrice(WebElement s) {
		
		
		String vegprice=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return vegprice;
	}

}
