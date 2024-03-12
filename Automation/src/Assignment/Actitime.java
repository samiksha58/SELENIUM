package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException 
	{
		//random class
		Random r=new Random();
		int no=r.nextInt(10000);

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://desktop-lj7o278/user/submit_tt.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.id("LoginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//div[text()='Users']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		
		driver.findElement(By.xpath("//input [@value='Create New User']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(20));
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("John");
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(20));
		
		
		
		String password="John@123";
	    driver.findElement(By.xpath("//input [@name='passwordText'] ")).sendKeys("password");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	    
		driver.findElement(By.xpath("//input [@name='passwordTextRetype']")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John"+no);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dange"+no);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@value='   Create User   ']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	

	
}


