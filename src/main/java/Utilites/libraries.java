package Utilites;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class libraries 
{
	static int counter=0;
	protected static WebDriver dr;
	public static WebDriver Launch_browser(String browser,String url)
	{
		//String ch1="C:\\Users\\BLTuser.BLT0189\\eclipse-workspace\\CTS_maven_125\\src\\test\\resources\\DRIVER"
		
		if(browser.contains("CHROME"))
		{
		
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
			dr=new ChromeDriver();
			
		}
		else {
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Driver\\geckodriver.exe");
			dr=new FirefoxDriver();
			
		}
		dr.get(url);
		
		return dr;
	}
	
	
	public static WebElement waitelement(By Locator,int timeout)
	{
		WebElement e=null;
		try
		{
		WebDriverWait wait= new WebDriverWait(dr,timeout);
		 e=wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		System.out.println("element located");

		}
		catch(Exception e1)
		{
			
		  System.out.println("element not found"+e1);	
		}
	return e;	
	}
	public  static WebElement clickable(By Locator, int timeout) 
	{
		WebElement e=null;
		try 
		{
			WebDriverWait wait = new WebDriverWait(dr,timeout);
			e= wait.until(ExpectedConditions.elementToBeClickable(Locator));
			System.out.println("element located");
			return e;
		}
		catch(Exception e1)
		{

			  System.out.println("element not found"+e1);	
		}
		return null;
	}

public static void Screenshot() {
		
		String path="src\\test\\resources\\ScreenShot\\";
		String filename=counter+".png";
		
		File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);		
		 File f2= new File(path+filename);
		 try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 counter++;
 
	}

}
