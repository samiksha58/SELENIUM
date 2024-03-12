package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMulitSelectDropdown {
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		//clock on UI testing concept
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		//click on dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//phone no
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8543876423",Keys.ENTER);
		
		//select gender
		WebElement dropdown=driver.findElement(By.id("select2"));
		
		//create the object of select gender
		Select s=new Select(dropdown);
		
		//use the method select by value
		s.selectByValue("female");
		
		
		//select country
	     WebElement dropdown1=driver.findElement(By.id("select3"));
	    
				
		//create the object of select country
	    Select s1=new Select(dropdown1);
				
	   //use the method select by value
		s1.selectByValue("India");
		
		//select state
	     WebElement dropdown2=driver.findElement(By.id("select5"));
	    
	    //create the object of select state
	    Select s2=new Select(dropdown2);
				
	   //use the method select by value
		s2.selectByValue("Maharashtra");
		
		//select city
	    // WebElement dropdown3=driver.findElement(By.id(""));
	    
	    //create the object of select city
	    //Select s3=new Select(dropdown3);
				
	   //use the method select by value
		//s3.selectByValue("Pune");
		
				
		//select product quantity
	     WebElement dropdown4=driver.findElement(By.id("select7"));
	    
	    //create the object of  product quantity
	    Select s4=new Select(dropdown4);
				
	   //use the method select by value
		s4.selectByIndex(2);

		//section[@class='flex justify-between pt-8']/ancester::section[@class='pb-2 border-b-[1px] flex justify-between']/descendant::p[@class='font-bold']
		
	}
}


