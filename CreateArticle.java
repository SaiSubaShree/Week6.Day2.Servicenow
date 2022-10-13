package week6.day2.article;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week6.day2.ServicenowBaseclass;

public class CreateArticle extends ServicenowBaseclass{
	
@Test
			public void newCaller() throws InterruptedException {
				// TODO Auto-generated method stub
				// click on ALL
				//Shadow shadow=new Shadow(driver);
				
				Thread.sleep(5000);
				WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
				proposal.sendKeys("article");
				Thread.sleep(2000);
				proposal.sendKeys(Keys.ENTER);
				//click on new
				WebElement ne= shadow.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(ne);
				
				driver.findElement(By.xpath("(//button[text()='New'])")).click();
				driver.switchTo().defaultContent();
				
				//enter the mandatory details
				WebElement add = shadow.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(add);
				driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
				Thread.sleep(2000);
				String windowHandle = driver.getWindowHandle();
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> window=new ArrayList<String>(windowHandles);
				driver.switchTo().window(window.get(1));
				driver.switchTo().defaultContent();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@id='kb_knowledge_base_table']/tbody/tr/td[3]/a")).click();
				Thread.sleep(2000);
				driver.switchTo().window(windowHandle);
				Thread.sleep(3000);
				
				// enter short description
				WebElement ShortD = shadow.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(ShortD);
				WebElement desc = driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']"));
				Thread.sleep(1000);
				
				desc.sendKeys("Short description");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				driver.switchTo().defaultContent();
				
				
				
				

	}

}
