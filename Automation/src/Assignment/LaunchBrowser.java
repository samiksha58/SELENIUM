package Assignment;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main (String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("==Enter your browsername==");
String browser=Sc.next();
ChromeDriver driver;

if (browser.equals("chrome"));
{
	System.out.println("valid browser");
}
System.out.println("invalid browser");

}
}



