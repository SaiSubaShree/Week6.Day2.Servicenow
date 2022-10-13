package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CrNewIncciWithError extends ServicenowBaseclass {
//public ChromeDriver driver;
@Test
	public void errorIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		
	
	WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
	proposal.sendKeys("incidents");
	//Thread.sleep(4000);
	proposal.sendKeys(Keys.ENTER);
	
		//click on create new button
		//Shadow shadow1=new Shadow(driver);
		Thread.sleep(1000);
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
		//driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("creating new incidents");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//span[@class='outputmsg_text']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
	}

}
