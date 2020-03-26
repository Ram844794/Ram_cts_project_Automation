package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilites.libraries;

public class page_1 extends libraries
{
	WebDriver dr;  //declaring  webdriver variable
	
	
	public page_1(WebDriver dr) //creating Constructor for page_1
	{
		this.dr=dr;
		
	}
	
    By account =(By.xpath("//ul[@id='main-nav']//li[2]//a")); //xpath for my account
    
    public void acc()
    {
    	WebElement we=clickable(account,50); //adding webdriver waits for xpath
    	we.click();
    	
    }
    
   public void clk_ac()  //method for clicking my account
   {
	   this.acc();
   }

}
