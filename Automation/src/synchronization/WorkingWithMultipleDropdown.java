package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultipleDropdown {
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/WCCA15_JAVA/multiselectdropdown.html");
		
		//driver.findElement(By.xpath("//select[@id='Dropdown']")).click();
		
		WebElement multiSelectDropdown=driver.findElement(By.id("dropdown"));
		
		//create the object of select class
		Select S=new Select(multiSelectDropdown);
		
		//for loop
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		//create the object of select class
		//Select S=new Select(dropdown);
		
		
	}

}
