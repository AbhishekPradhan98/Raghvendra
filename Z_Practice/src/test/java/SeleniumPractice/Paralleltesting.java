package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltesting 
{
WebDriver driver;
@Test
public void verifyTitle() 
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");
	
	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.quit();
}
	
@Test
public void logo() throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

	driver.get("https://google.com/");
	
//	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	
	WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
	Assert.assertTrue(logo.isDisplayed());
	
	
	
	driver.quit();

}
	
}
