package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithdemoapp {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
       // driver.findElement(By.xpath("//h3[text()='Form Validation']")).click();
         //SearchTextField.sendKeys("formvalidation");
        WebElement from=driver.findElement(By.name("search"));
		from.click();
		from.sendKeys("Form Validation",Keys.ENTER);
      
         
         
         
         
         
         
         
         // sendKeys("formvalidation",Keys.ENTER);
       // WebElement search;
		
		//driver.findElement(By.xpath("//a[@href='/ui/formValidation']")).click();
		
	}
}


