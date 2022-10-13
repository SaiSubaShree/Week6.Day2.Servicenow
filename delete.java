package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class delete extends ServicenowBaseclass {
	//public ChromeDriver driver;
	@Test
	public void Delete() throws InterruptedException {
		//Shadow shadow1=new Shadow(driver);

		
		//Thread.sleep(1000);
		
		//Thread.sleep(8000);
		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		proposal.sendKeys("incidents");
		Thread.sleep(4000);
		proposal.sendKeys(Keys.ENTER);
		
		
		//click on already exit incident
		Thread.sleep(1000);
		WebElement inci = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(inci);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='incident_table']//tbody//tr/td[3]/a")).click();
		driver.switchTo().defaultContent();
		
	// delete
		Thread.sleep(1000);
		WebElement delete = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(delete);
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		//button[text()='Delete'])[3]
		driver.switchTo().defaultContent();
}
}
