package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMyntra {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
	    driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("jeans",Keys.ENTER);
		   driver.findElement(By.xpath("//label[text()='Women']")).click();
		driver.findElement(By.xpath("//label[text()='Roadster']")).click();
		driver.findElement(By.xpath("//label[text()='Rs. 239 to Rs. 8180']")).click();
		driver.findElement(By.xpath(""));
	}

}
