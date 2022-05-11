package Module1_Donor_Management;


import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
public class DonorLoginPage 
{
//1
    @FindBy(xpath="//button[@value='100']") private WebElement DonationAmount;
	@FindBy(xpath="//label[@for='cause']") private WebElement CauseFund;
	@FindBy(xpath="//input[@name='first_name']") private WebElement ContactInfo_Fname;
	@FindBy(xpath="//input[@name='last_name']") private WebElement ContactInfo_lname;
	@FindBy(xpath="//input[@name='email']") private WebElement ContactInfo_Email;
	@FindBy(xpath="//input[@name='phone_number']") private WebElement ContactInfo_phoneno;
	@FindBy(xpath="//input[@name='address']") private WebElement Address_Eadd;
	@FindBy(xpath="//input[@id='street']") private WebElement Address1_Eadd1;
	@FindBy(xpath="//input[@name='city']") private WebElement Address_Ecity;
	@FindBy(xpath="//input[@name='country']") private WebElement Address_Ecountry;
	@FindBy(xpath="//input[@name='state']") private WebElement Address_Estate;
	@FindBy(xpath="//input[@name='zip']") private WebElement Address_postalcode;
	@FindBy(xpath="//input[@name='cardnumber']") private WebElement CardDetails_cardno;
//	@FindBy(xpath="//select[@id='cardexpireyear']") private WebElement CardDetails_Eyear;
//	@FindBy(xpath="//select[@id='cardexpiremonth']") private WebElement CardDetails_Emonth;
	@FindBy(xpath="//input[@name='cardcvc']") private WebElement CardDetails_cardcvv;
	@FindBy(xpath="//button[@id='sumbitbtn']") private WebElement submitbtn;
//2	
	public DonorLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	3	
	public void clickDonorLoginPageDAmount() {
		DonationAmount.click();	
	}
	public void clickDonorLoginPageCFund() {
		CauseFund.click();
	}
	public void setDonorLoginPageFname() {
		ContactInfo_Fname.sendKeys("Rohit");
	}
	public void setDonorLoginPageLname() {
		ContactInfo_lname.sendKeys("Sharma");
	}
	public void setDonorLoginPageEmail() {
		ContactInfo_Email.sendKeys("rohits@gmail.com");
	}
	public void setDonorLoginPageNumber() {
		ContactInfo_phoneno.sendKeys("1234567890");
	}
	public void setDonorLoginPageAddress() {
		Address_Eadd.sendKeys("pune bus stop");
	}
	public void setDonorLoginPageAddress1() {
		Address1_Eadd1.sendKeys("vikas nagar pune");
	}
	public void setDonorLoginPageCity() {
		Address_Ecity.sendKeys("pune");
	}
	public void setDonorLoginPagecountry() {
		Address_Ecountry.sendKeys("INDIA");
	}
	public void setDonorLoginPageState() {
		Address_Estate.sendKeys("MAHARASHTRA");
	}
	public void setDonorLoginPagecode() {
		Address_postalcode.sendKeys("321321");
	}
	public void setDonorLoginPagecard(String cardno) 
	{
		CardDetails_cardno.sendKeys(cardno);
	}
	
	
//	public void setDonorLoginPageexpirecardyear()
//	{
//		
//		Action act=new Action();
//		act.click(CardDetails_Eyear).perform();
//		
//		for(int i=1; i<=4; i++)
//		{
//			act.sendkeys(Keys.ARROW_UP).perform();
//		}
//		act.sendkeys(Keys.ENTER).perform();
//	}
//	public void setDonorLoginPageexpirecardmonth(String cardmonth) 
//	{
//		CardDetails_cardno.sendKeys(cardmonth);
//	}
	public void setDonorLoginPagecvv(String cvvNo)
	{
		CardDetails_cardcvv.sendKeys(cvvNo);
	}
	public void clickDonorLoginPageSubmit() {
		submitbtn.click();
	}
	
}
