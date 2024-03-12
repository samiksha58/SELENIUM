package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithNaukaricom {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.id("name")).sendKeys("sammu");
		
		driver.findElement(By.id("email")).sendKeys("sammu@gamil.com");
		driver.findElement(By.id("password")).sendKeys("sammu123");
		driver.findElement(By.id("mobile")).sendKeys("8634095623");
		driver.findElement(By.xpath("//div[@data-val='fresher']"));
		//WebElement RegisterButton=driver.findElement(By.id("Register"));
		
		//WebDriverWait.Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//Wait.until(ExpectedConditions.elementToBeClickable(RegisterButton));
}
}
