package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Repositary {
	

	//form xpath
	
	public static String formurl="http://www.wufoo.com/gallery/";
	public static String subform="//ul[@ id='templatesNav']//li/a[@title='payment forms']";
	public static String subform1="//ul//li/a[@title='View Online Order Form.']";
	public static String formiframe="//iframe[@id='wufooFormq1s4vl030rd6fkj']";
	public static String formdropdown="Field614";//select by value A
	public static String formradiobutton="//input[@id='Field616_0']";
	public static String formtextfield1="//input[@id='Field2']";
	public static String formtextfield2="//input[@id='Field3']";
	public static String formtextfield3="//input[@id='Field4']";
	public static String formtextfield4="//input[@id='Field5']";
	public static String formtextfield5="//input[@id='Field5-1']";
	public static String formtextfield6="//input[@id='Field5-2']";
	public static String formtextfield7="//input[@id='Field6']";
	public static String formtextfield8="//input[@id='Field7']";
	public static String formtextfield9="//input[@id='Field8']";
	public static String formtextfield10="//input[@id='Field9']";
	public static String formtextfield11="//input[@id='Field10']";
	public static String formdropdown1="//select[@id='Field11']";//value for this  is canada
	public static String formsubmit="//input[@id='saveForm']";
	
	
	
	
	
	
	//gmail Xpath
	
	WebDriver driver = new FirefoxDriver();
	public static String gmailurl="https://accounts.google.com/ServiceLogin?service=mail";
	public static String gmailusername= "//input[@id='Email']";
	public static String gmailnextbutton = "//input[@id='next']";
	public static String gmailpassword = "//input[@id='Passwd']";
	public static String gmailsignin = "//input[@ id='signIn']";
	
	public static String gmailcompose = "//div [@class='T-I J-J5-Ji T-I-KE L3']";
	public static String gmailcomposemaximize = "//td//img[@alt='Pop-out']";
	public static String gmailtoaddress="//div//textarea[@class='vO']";
	public static String gsubject="//div//input[@class='aoT']";
	public static String gmessage="//table[@class='iN']//table[@class='cf An']//tbody//tr//td//div[@class='Am Al editable LW-avf']";
	public static String gsend="//div[@class='T-I J-J5-Ji aoO T-I-atl L3']";

	public static String gmaillogoutoption="//span[@class='gb_3a gbii']";
	public static String gmaillogout="//div//a[@class='gb_Fa gb_Fe gb_Ne gb_rb']";
	
	public static String gmailinbox = "//div[@class='aio UKr6le']";		
	public static String gmailsubject = "//div[@class='y6']//span/b";		
	public static String gmailreply="//div[@aria-label='Reply']//img[@class='hB T-I-J3']";
	public static String gmailreplysend="//div[@class='T-I J-J5-Ji aoO T-I-atl L3']";
	
	
	
	
	
	
	//out look xpath
	
	
	public static String outlookurl="https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=12&ct=1465013697&rver=6.4.6456.0&wp=MBI_SSL_SHARED&wreply=https:%2F%2Fmail.live.com%2Fdefault.aspx&lc=1033&id=64855&mkt=en-us&cbcxt=mai";
	public static String outlookusername="//input[@type='email']";
	public static String outlookpassword="//input[@type='password']";
	public static String outlooksignin ="//input[@type='submit']";
	
	
	public static String outlookcompose="//button[@class='_fce_h ms-fwt-r ms-fcl-np o365button']";
	public static String outlooktoaddress="//form//input[@role='textbox']";
	public static String outlooksubject="//div//div[@class='_mcp_z4']//input[@placeholder='Add a subject']";
	public static String outlookmessage="//div[@class='_mcp_s4 _mcp_W4 ms-border-color-neutralTertiaryAlt ms-border-color-neutralTertiary-hover']//div/p";
	public static String outlooksend="//div[@class='_mcp_T4']//button[@title='Send']";
	
	
	public static String outlooklogoutoption="//div[@class='o365cs-nav-topItem o365cs-rsp-tn-hideIfAffordanceOn']//button";
	public static String outlooklogout="//div//a[@aria-label='Sign out']";
	
	public static String outlookinbox="//div//div//div//span[@title='Inbox']";
	public static String outlookcontent="//div//div[@class='_lvv_z _lvv_A _lvv_C _lvv_B ms-bg-color-themeLight']";
	public static String outlookreplyclick="//div//button[@title='Reply all']";
	public static String outlookreplycontent="//div[@class='_mcp_z2 ms-border-color-themeTertiary']//div//div[@class='_z_i1 ms-font-weight-regular ms-font-color-neutralTertiary']";

}