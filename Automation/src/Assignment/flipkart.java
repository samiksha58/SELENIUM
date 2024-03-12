package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkart {
	
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
	
 WebElement price=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']/ancester::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
 
 String iphoneprice=price.getText();
 
 System.out.println(iphoneprice);
 }
}
