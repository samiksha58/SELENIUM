package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on login
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		
		//Enter the email
		driver.findElement(By.id("Email")).sendKeys("samiajmire20@gamil.com",Keys.ENTER);
		Thread.sleep(2000);
		
		//Enter the Password
		driver.findElement(By.id("Password")).sendKeys("sammu@5820",Keys.ENTER);
		Thread.sleep(2000);
		
		//click on book
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		
		//click on add to cart
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		//click on shopping cart 
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		//select country
		driver.findElement(By.xpath("//select[@id='CountryId']")).sendKeys("India",Keys.ENTER);
		Thread.sleep(2000);
		
		//click on check box
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(2000);
		
		//click on checkout 
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		
		//click on address dropdown
		driver.findElement(By.xpath("//select[@id='billing-address-select']")).click();
		Thread.sleep(2000);
	
		//click on continue
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(2000);
		
		//click on check box
		driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		Thread.sleep(2000);

	    //click on 2nd continue
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		
		//click on ground
		driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
		Thread.sleep(2000);
		
		//click on 3rd continue
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(2000);
		
		//click on continue4
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(2000);

		//click on continue5
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(2000);

		
		//click on continue6
		driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
		Thread.sleep(2000);

		
		//click on logout
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);

		System.out.println("Your order has been successfully processed!");
		}
}
