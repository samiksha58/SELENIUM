package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIEnable {
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep (2000);
		//click on from location
		WebElement LoginButton=driver.findElement(By.xpath("//div[text()='Log in']"));
		System.out.println(LoginButton.isEnabled());
	}
}
