package week6.day2.caller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week6.day2.ServicenowBaseclass;

public class DeleteCaller extends ServicenowBaseclass{

	@Test
	public void newCaller() throws InterruptedException {
		// TODO Auto-generated method stub
		// click on ALL
		//Shadow shadow=new Shadow(driver);
		
		Thread.sleep(5000);
		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		proposal.sendKeys("Callers");
		Thread.sleep(2000);
		proposal.sendKeys(Keys.ENTER);
		
		
		//select an item to update
		WebElement add = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(add);
		WebElement table = driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody/tr[2]/td[3]/a"));
	table.click();
	driver.switchTo().defaultContent();
	
	//click on delete
	WebElement update = shadow.findElementByXPath("//iframe[@title='Main Content']");
	
	driver.switchTo().frame(update);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='Delete']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
	driver.switchTo().defaultContent();
	
	}

}
