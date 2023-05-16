import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement adultnumber=driver.findElement(By.id("divpaxinfo"));
		//.click();
		System.out.println(adultnumber.getText());
		adultnumber.click();
		Thread.sleep(1000);
		for(int i=1;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(adultnumber.getText());
		

	}

}
