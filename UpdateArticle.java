package week6.day2.article;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week6.day2.ServicenowBaseclass;

public class UpdateArticle extends ServicenowBaseclass{
@Test
	public void update() throws InterruptedException {
		// TODO Auto-generated method stub
		// click on ALL
		//Shadow shadow=new Shadow(driver);
		
		Thread.sleep(5000);
		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		proposal.sendKeys("article");
		Thread.sleep(2000);
		proposal.sendKeys(Keys.ENTER);
		
		// Select the article from the table
		WebElement add = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(add);
		driver.findElement(By.xpath("//table[@id='kb_knowledge_table']/tbody/tr[2]/td[3]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		//update the details
		WebElement update = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(update);
		Thread.sleep(2000);
		WebElement cate = driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']"));
		Thread.sleep(1000);
		cate.sendKeys("java");
		Thread.sleep(1000);
		cate.sendKeys(Keys.ENTER);
		
		//click on update
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		driver.switchTo().defaultContent();
		
		
			
	
}
}
