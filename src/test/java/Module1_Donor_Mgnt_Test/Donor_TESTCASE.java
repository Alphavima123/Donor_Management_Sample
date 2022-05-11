
package Module1_Donor_Mgnt_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libery_Files.Baseclass;
import Libery_Files.Utilityclass;
import Module1_Donor_Management.DonorLoginPage;

public class Donor_TESTCASE extends Baseclass
{

	DonorLoginPage login;
	Sheet sh;
	int TestcaseID;
	
	@BeforeClass
	public void open()
	{
		
	}

	//	@Test(priority = 1)
	@BeforeMethod
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		 initilizeBrowser();
		
	//	DonorLoginPage login=new DonorLoginPage(driver);                  // Wrong way
	 login=new DonorLoginPage(driver);										// right way

	}
	
//	@Test(priority = 2)
	@Test
	public void FillInfo() throws EncryptedDocumentException, IOException
	{
		TestcaseID=100;
		
		login.clickDonorLoginPageDAmount();
    	login.clickDonorLoginPageCFund(); 
		login.setDonorLoginPageFname();
		login.setDonorLoginPageLname();
		login.setDonorLoginPageEmail();						// set-->input enter, click-->for click to perform action
		login.setDonorLoginPageNumber();
		login.setDonorLoginPageAddress();
		login.setDonorLoginPageAddress1();
		login.setDonorLoginPageCity();
		login.setDonorLoginPagecountry();
		login.setDonorLoginPageState();
		login.setDonorLoginPagecode();
		
		login.setDonorLoginPagecard(Utilityclass.getTD(1, 0));
//		login.setDonorLoginPageexpirecardyear(Utilityclass.getTD(1, 1));
//		login.setDonorLoginPageexpirecardmonth(Utilityclass.getTD(1, 2));
		login.setDonorLoginPagecvv(Utilityclass.getTD(1, 3));
		
		login.clickDonorLoginPageSubmit();
				
	}
	
	@AfterMethod
	public void logoutBrowser(ITestResult result) throws InterruptedException, IOException 
	{	
		if(result.getStatus()==ITestResult.FAILURE)					//code for the failed test cases
		{
			Utilityclass.CaptureScreenShot(driver, TestcaseID);
		}
	}

	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{	
		Thread.sleep(5000);
		driver.close();
		login=null;				//clear all global variable to null--> to clear the garbage collector
		sh=null;
		driver=null;		
		
	}
	
}
