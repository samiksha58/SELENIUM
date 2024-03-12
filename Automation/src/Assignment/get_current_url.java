package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {

public static void main(String[]args) {
	//launch  the browser
WebDriver driver=new ChromeDriver();
//To maximize the browser
driver.manage().window().maximize();
// To launch the web application
driver.get("https://www.airvistara.com/");
// To fetch the url
String actualUrl=driver.getCurrentUrl();
String expectedUrl=("https://www.airvistara.com/flights/en");
if (actualUrl.equals(expectedUrl)) {
	System.out.println("url is correct");
}else
{
	System.out.println("url is wrong");
}
}
}