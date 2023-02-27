package pageObjects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_2.Base_2;
import dev.failsafe.internal.util.Assert;

public class Indexpage  {
	
// private WebDriver driver;

//	
//	 WebDriver driver;
	 public  void openlogin(WebDriver driver) throws Exception {
	driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[1]/div/div[3]/ul/li[1]/a/span[2]/img")).click();
		 driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtEmail\"]")).sendKeys("8186029810");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]")).sendKeys("Yuktha@1234");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")).click();
		
			
		// driver.findElement(By.xpath("//*[@id=\"ctl00_imglogo\"]")).isDisplayed();
		
		 
		 
	 }
	 

}
