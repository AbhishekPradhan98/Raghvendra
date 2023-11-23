package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.redbus.in/");
		 
		 driver.findElement(By.id("onwardCal")).click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// Select From and To Cities

		 js.executeScript("arguments[0].value = arguments[1]",driver.findElement(By.id("onwardCal")), "28-11-2023");
		 

	}

}
