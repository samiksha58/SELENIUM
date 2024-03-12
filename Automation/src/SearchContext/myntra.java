package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class myntra {
	
    

	public static void main(String[] args){
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			
			
			driver.findElement(By.xpath ( "//input[@placeholder='Search for products, brands and more']")).sendKeys("kurti");
			
			WebElement search;
	
		
			
		

	

     }

	}

		

	




