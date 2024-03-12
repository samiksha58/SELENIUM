package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//click on Samsung phone
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']"));
		//pass pincode inside the check delivery text box
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		//identify the check button
	       WebElement checkButton = driver.findElement(By.id("check"));
	}

}
