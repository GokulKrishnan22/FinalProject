package Assignment;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase extends components implements Repositary{

	
	
	Testcase obj = new Testcase();
	 
	//form
	
	@Test
	public void Testcase1()
	{
		System.out.println("Form testing");
		WebDriver driver = new FirefoxDriver();
		driver.get(formurl);
		WebElement element=driver.findElement(By.xpath(subform));
		element.click();
		waitSleep(3);
		
		WebElement element1=driver.findElement(By.xpath(subform1));
		element1.click();
		WebElement element2=driver.findElement(By.xpath(formiframe));
		driver.switchTo().frame(element2);
		Select dropcount=new Select(driver.findElement(By.id(formdropdown)));
		dropcount.selectByValue("A");
		driver.findElement(By.xpath(formradiobutton)).click();
		
		driver.findElement(By.xpath(formtextfield1)).sendKeys(new String[]{"Gokul"});
		driver.findElement(By.xpath(formtextfield2)).sendKeys(new String[]{"Krishnan"});
		driver.findElement(By.xpath(formtextfield3)).sendKeys(new String[]{"gokul@gmail.com"});
		driver.findElement(By.xpath(formtextfield4)).sendKeys(new String[]{"765"});
		driver.findElement(By.xpath(formtextfield5)).sendKeys(new String[]{"465"});
		driver.findElement(By.xpath(formtextfield6)).sendKeys(new String[]{"4673"});
		driver.findElement(By.xpath(formtextfield7)).sendKeys(new String[]{"359/1"});
		driver.findElement(By.xpath(formtextfield8)).sendKeys(new String[]{"Thilagar Nagar"});
		driver.findElement(By.xpath(formtextfield9)).sendKeys(new String[]{"Tirupur"});
		driver.findElement(By.xpath(formtextfield10)).sendKeys(new String[]{"Tamil nadu"});
		driver.findElement(By.xpath(formtextfield11)).sendKeys(new String[]{"641-652"});
		Select dropcount1=new Select(driver.findElement(By.xpath(formdropdown1)));
		dropcount1.selectByValue("Canada");
		driver.findElement(By.xpath(formsubmit)).click();
		System.out.println("Form testing completed");
	}

	
	public static void waitSleep(int sec){
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	//outlook
	
	
	@Test
	public void Testcase2()
	{
		System.out.println("Out look mail testing");
		Testcase obj1 = new Testcase();
		obj1.login(ouser,opassword,"outlook");
		obj.compose(otoaddress,osubject,ocontent, "outlook");
		obj1.logout("outlook");	
		
	}
	
	
	
	
	//gmail
	
	@Test
	public void Testcase3()
	{
		
		obj.login(guser, gpassword, "gmail");
		obj.logout("gmail");
		
		}
		
	@Test	
	public void Testcase4()
	
	{
		obj.login(ouser, opassword, "outlook");
		obj.reply("gmail");
		obj.logout("outlook");
		
		
	}
	}

		
		
		
		
		
		
	

	
	

