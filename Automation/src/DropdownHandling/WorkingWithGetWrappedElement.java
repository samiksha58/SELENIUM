package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetWrappedElement {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();

	}

}
