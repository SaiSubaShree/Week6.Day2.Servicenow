package week6.day2.caller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
//import week5.day2.Assingment.AssingBaseClass;
import week6.day2.ServicenowBaseclass;

public class Newcaller extends ServicenowBaseclass {

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
		
		//Create new Caller by filling all the fields and click 'Submit'.
		WebElement add = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(add);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		
		// enter the details
		WebElement pw = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(pw);
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Sindhu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Vidhu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.switchTo().defaultContent();
		
		// verify 
		
		WebElement verify = shadow.findElementByXPath("//iframe[@title='Main Content']");
		
		driver.switchTo().frame(verify);
		String ver = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		System.out.println("Primary email device created ");
		
	
	}

	}


