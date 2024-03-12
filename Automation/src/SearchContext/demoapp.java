package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoapp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(2000);
		WebElement Register=driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println(Register.isEnabled());
	}

}
