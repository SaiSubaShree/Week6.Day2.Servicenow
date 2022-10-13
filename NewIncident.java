package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

@Test
public class NewIncident   extends ServicenowBaseclass{
public ChromeDriver driver;
	public  void  newIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		//click on create new button
		
		//Thread.sleep(1000);
		
		//Thread.sleep(000);
		
		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		//Thread.sleep(30000);
		proposal.sendKeys("incidents");
		Thread.sleep(3000);
		proposal.sendKeys(Keys.ENTER);
		
		//Shadow shadow1=new Shadow(driver);
		WebElement inci = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(inci);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		
		//enter the details
		Thread.sleep(1000);
		WebElement incidetails = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(incidetails);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("creating new incidents");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
	}

}
