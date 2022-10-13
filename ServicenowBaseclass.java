package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServicenowBaseclass {
public ChromeDriver driver;
public Shadow shadow;
@Parameters({"url","username","password"})
@BeforeMethod
	public  void Base(String url,String username,String password) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
				
		//Launch ServiceNow application
		driver.get(url);
		
		//Login with valid credentials username as admin and password as Sairam13$
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='not_important']")).click();
		Thread.sleep(6000);
		
	//enter click ALL
		 shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		WebElement all = shadow.findElementByXPath("//div[text()='All']");
		all.click();
		//Thread.sleep(3000);
		
	}
/*@AfterMethod
	public void exit() throws InterruptedException
	{
	Thread.sleep(3500);
		driver.close();
	}*/

}
