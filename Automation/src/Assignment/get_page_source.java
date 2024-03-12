package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_page_source {
public static void main(String [] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String Source=driver.getPageSource();
	System.out.println("source");
}

}