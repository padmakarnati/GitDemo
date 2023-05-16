import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiccheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
 WebDriver driver;
 driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com");
	    driver.manage().window().maximize();
	    
	    System.out.println("this is change in dynamic checkbox1");
	    System.out.println("this is change in dynamic checkbox2");
	    System.out.println("this is change in dynamic checkbox3");
	    System.out.println("this is change in dynamic checkbox4");
	    
	    System.out.println("this is change in dynamic checkbox1");

	    WebElement checkbox=driver.findElement(By.xpath("//input[@id='isageselected']"));
		/*
		 * if(checkbox.isSelected()) { System.out.println("Check box is ON");
		 * 
		 * }
		 */
	
	List <WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type=checkbox]"));
	int size=allcheckbox.size();
	for(int i=0;i<size;i++)
	{
		String name=allcheckbox.get(i).getAttribute("value");
		if(name.equalsIgnoreCase("Padma")) {
			allcheckbox.get(i).click();
			break;
		}
			
	}
	
	
	}

}
