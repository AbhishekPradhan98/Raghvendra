package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajax {

	public static void main(String[] args) throws Throwable 
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://google.com");
		 
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		 Thread.sleep(2000);
		 WebElement ulelement= driver.findElement(By.className("G43f7e"));
		 List<WebElement>fromlist=ulelement.findElements(By.tagName("li"));
		 System.out.println(fromlist.size());
		 
		 for(int i=0;i<fromlist.size();i++)
		 {
			 if(fromlist.get(i).getText().contains("selenium download"))
			 {
				 fromlist.get(i).click();
				 break;
			 }
		 }
		 

	}

}
