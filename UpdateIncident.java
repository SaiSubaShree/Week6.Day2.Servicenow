package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class UpdateIncident extends ServicenowBaseclass {
//public ChromeDriver driver;
@Test
	public  void  update() throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Shadow shadow1=new Shadow(driver);
				

		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		proposal.sendKeys("incidents");
		Thread.sleep(3000);
		proposal.sendKeys(Keys.ENTER);
		
				//click on already exit incident
				//Thread.sleep(1000);
				WebElement inci = shadow.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(inci);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@id='incident_table']//tbody//tr/td[3]/a")).click();
				driver.switchTo().defaultContent();
				
				//update the details
				Thread.sleep(1000);
				WebElement inciupdate = shadow.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(inciupdate);
				Thread.sleep(2000);
				WebElement urgency = driver.findElement(By.id("incident.urgency"));
				Select dd =new Select(urgency);
				dd.selectByValue("2");
				
				//select priority
				Thread.sleep(2000);
				WebElement prior = driver.findElement(By.id("incident.state"));
				Select dd1=new Select(prior);
				dd1.selectByValue("2");
				driver.findElement(By.xpath("//button[text()='Update']")).click();
				driver.switchTo().defaultContent();
				
				
	}

}
