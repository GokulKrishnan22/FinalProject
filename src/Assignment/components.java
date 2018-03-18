package Assignment;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jboss.netty.channel.socket.Worker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Testcase.Testdata;

public class components implements Repositary{
	
	

	//excel sheet1 data read 
	
	Testdata test = new Testdata();
	//Get the data from sheet using getdata method.It is present in testdata.java class
	String guser=test.getdata(0, 1,1);
	String gpassword=test.getdata(0, 1,2);
	String gtoaddress=test.getdata(0, 1,3);
	String gsubject=test.getdata(0, 1,4);
	String gcontent=test.getdata(0, 1,5);
	String greplysubject=test.getdata(0, 1,6);
	String greplycontent=test.getdata(0, 1,7);
	
	String ouser=test.getdata(0, 2,1);
	String opassword=test.getdata(0, 2,2);
	String otoaddress=test.getdata(0, 2,3);
	String osubject=test.getdata(0, 2,4);
	String ocontent=test.getdata(0, 2,5);
	String oreplysubject=test.getdata(0, 2,6);
	String oreplycontent=test.getdata(0, 2,7);
	
	
	//excel sheet2 data
	
	String testcase1=test.getdata(1,1,2);
	String testcase2=test.getdata(1,2,2);
	String testcase3=test.getdata(1,3,2);
	String testcase4=test.getdata(1,4,2);
	
	
	// this method is used to login to gmail or outlook
	void login(String username,String password,String mail)
	{
		if(mail.equalsIgnoreCase("gmail"))
		{
		WebDriver driver = new FirefoxDriver();
		driver.get(gmailurl);
		driver.findElement(By.xpath(gmailusername)).sendKeys(new String[]{username});
		driver.findElement(By.xpath(gmailnextbutton)).click();
		driver.findElement(By.xpath(gmailpassword)).sendKeys(new String[]{password});
		driver.findElement(By.xpath(gmailsignin)).click();
		}
		if(mail.equalsIgnoreCase("outlook"))
		{
			driver.get(outlookurl);
			driver.findElement(By.xpath(outlookusername)).sendKeys(new String[]{username});
			driver.findElement(By.xpath(outlookpassword)).sendKeys(new String[]{password});
			driver.findElement(By.xpath(outlooksignin)).click();
		}
	}
	
	// this method is used to compose the mail in gmail or outlook
	void compose(String toaddress,String subject,String message, String mail )
	{
		if(mail.equalsIgnoreCase("gmail"))
		{
		driver.findElement(By.xpath(gmailcompose)).click();
		driver.findElement(By.xpath(gmailcomposemaximize)).click();
		driver.findElement(By.xpath(gmailtoaddress)).sendKeys(new String[]{toaddress});
		driver.findElement(By.xpath(gsubject)).sendKeys(new String[]{subject});
		driver.findElement(By.xpath(gmessage)).sendKeys(new String[]{message});
		driver.findElement(By.xpath(gsend)).click();
	
		}
		if(mail.equalsIgnoreCase("outlook"))
		{
			driver.findElement(By.xpath(outlookcompose)).click();
			driver.findElement(By.xpath(outlooktoaddress)).sendKeys(new String[]{toaddress});
			driver.findElement(By.xpath(outlooksubject)).sendKeys(new String[]{subject});
			driver.findElement(By.xpath(outlookmessage)).sendKeys(new String[]{message});
			driver.findElement(By.xpath(outlooksend)).click();
		}
	}
	
	//this method is used to logout from gmail or outlook
	void logout(String mail)
	{
		if(mail.equalsIgnoreCase("gmail"))
		{
			driver.findElement(By.xpath(gmaillogoutoption)).click();
			driver.findElement(By.xpath(gmaillogout)).click();
		}
		if(mail.equalsIgnoreCase("outlook"))
		{
			driver.findElement(By.xpath(outlooklogoutoption)).click();
			driver.findElement(By.xpath(outlooklogout)).click();
		}
	}
	
	//this method is used to reply by gmail or outlook 
	void reply(String mail)
	{
		if(mail.equalsIgnoreCase("gmail"))
			
		{
			driver.findElement(By.xpath(gmailinbox)).click();
			driver.findElement(By.xpath(gmailsubject)).sendKeys(greplysubject);
			driver.findElement(By.xpath(gmailreply)).sendKeys(greplycontent);
			driver.findElement(By.xpath(gmailreplysend)).click();
		}
		if(mail.equalsIgnoreCase("outlook"))
		{
			driver.findElement(By.xpath(outlookinbox)).click();
			driver.findElement(By.xpath(outlookcontent)).sendKeys(oreplysubject);
			driver.findElement(By.xpath(outlookreplyclick)).sendKeys(oreplycontent);
			driver.findElement(By.xpath(outlookreplycontent)).click();
		}
			
		}
	}

