package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorikingWithZomato {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.xpath("//div[@name='Zomaverse']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.blinkit.com/']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='search delivery location']")).sendKeys("Qspiderwakad",Keys.ENTER);
       //driver.findElement(By.xpath("//img[@src='/62367af8786502e04f60.svg']")).click();
	driver.findElement(By.xpath("//div[@class='SearchBar__PlaceholderContainer-sc-16lps2d-0 dPbxWD']")).sendKeys("sugar");
	}
}
