package Libery_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilityclass
{
	

	//Author Name: @Monish
	// This method is used to fetch the data from an excel sheet
	// Need to pass 2 parameters: 1.rowIndex,2.cellIndex
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\MonishSahare\\eclipse-workspace\\Donor_Management\\TestData\\Test Data.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		 return value;
	}
	

	//Author Name: @Monish
	// This method is used to capture the screenshot
	// Need to pass 2 parameters: 1.driver,2.TestcaseID
	public static void CaptureScreenShot(WebDriver driver, int TestcaseID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\MonishSahare\\eclipse-workspace\\Donor_Management\\Screenshot\\TCID" +TestcaseID+".jpg");
		 org.openqa.selenium.io.FileHandler.copy(src, dest);
		 
	}
	
	// Method for getting the data from property file
	public static String getDatafromPFile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\MonishSahare\\eclipse-workspace\\Donor_Management\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
		
		
		
	
	}
}
