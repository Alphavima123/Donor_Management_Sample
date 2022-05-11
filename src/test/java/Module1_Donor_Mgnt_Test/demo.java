package Module1_Donor_Mgnt_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Libery_Files.Utilityclass;

public class demo {
	
	@Test
	public void runtestcase() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MonishSahare\\eclipse-workspace\\Donor_Management\\Browser\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement type = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		type.sendKeys("abcd");
		Thread.sleep(1000);
		type.clear();
	}
	
	
}
