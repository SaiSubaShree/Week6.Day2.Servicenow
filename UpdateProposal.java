package week6.day2.createnewproposal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week6.day2.ServicenowBaseclass;

public class UpdateProposal extends ServicenowBaseclass{

	@Test
	public  void updateProposal() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		WebElement proposal = shadow.findElementByXPath("//input[@id='filter']");
		proposal.sendKeys("Proposals");
		Thread.sleep(2000);
		/*proposal.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		proposal.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		proposal.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);*/
		proposal.sendKeys(Keys.ENTER);
	
		//Click- new  and  fill mandatory fields and click 'Submit' Button.
		Thread.sleep(2000);
		// to get the intial row count
		List<WebElement> intiver = driver.findElements(By.xpath("//table[@id='std_change_proposal_table']//tr/td"));
		int intirowcount = intiver.size();	
		System.out.println("The row count is" +intirowcount);
		
		Thread.sleep(2000);
		WebElement add = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(add);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		
		// filling mandatory feilds
		Thread.sleep(1000);
		WebElement des = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(des);
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("request changes");
     	Thread.sleep(500);
     	
		driver.findElement(By.xpath("//span[text()='Change Request values']")).click();
		
	Thread.sleep(500);
	WebElement title = driver.findElement(By.xpath("//input[@class='filerTableInput form-control']"));
	title.clear();
	Thread.sleep(500);
	title.sendKeys(" Additional data feild is added");
	
	//adding description
	driver.findElement(By.xpath("//textarea[@class='filerTableInput form-control']")).sendKeys(" Age feild is updated");
	//implementation plan
	WebElement plan = driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[2]"));
	plan.clear();
	plan.sendKeys("Development team will perform by adding data change");
	
	//backout plan
	WebElement backout = driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[3]"));
backout.clear();
backout.sendKeys("The database backup will be  managed by Triumph team");

// testplan
Thread.sleep(500);
WebElement testplan = driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[4]"));
testplan.clear();
testplan.sendKeys("The testing team will do the testcase review");	

// click submit button

driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
driver.switchTo().defaultContent();

// verify the template
WebElement verify = shadow.findElementByXPath("//iframe[@title='Main Content']");
driver.switchTo().frame(verify);
/*String ver = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']//tr[3]/td[4]")).getText();
System.out.println(ver);

Thread.sleep(6000);*/
List<WebElement> ver = driver.findElements(By.xpath("//table[@id='std_change_proposal_table']//tr/td"));
int rowcount = ver.size();	
System.out.println("The row count is" +rowcount);
if(intirowcount!=rowcount )
{
	System.out.println("The new propsal is sucessfully created");
}
	Thread.sleep(4000);
//Click on the proposal
WebElement propose = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']/tbody/tr[1]/td[3]/a"));
propose.click();
driver.switchTo().defaultContent();

// update the proposal
Thread.sleep(2000);
WebElement update = shadow.findElementByXPath("//iframe[@title='Main Content']");
driver.switchTo().frame(update);

// click on state as in progress
Thread.sleep(2000);
WebElement state = driver.findElement(By.xpath("//select[@id='std_change_proposal.state']"));
Select dd= new Select(state);
dd.selectByValue("2");
Thread.sleep(3000);
/*//click on categary
driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
// window handle
String windowHandle = driver.getWindowHandle();
Set<String> windowHandles = driver.getWindowHandles();
List<String>windows= new ArrayList<String>(windowHandles);
driver.switchTo().window(windows.get(1));
Thread.sleep(3000);

driver.findElement(By.xpath("//table[@id='sc_category_table']//tbody/tr/td[3]/a")).click();
driver.switchTo().window(windowHandle);*/

//click on update

driver.findElement(By.xpath("//button[text()='Update']")).click();














	}

}
