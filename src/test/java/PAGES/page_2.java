package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilites.libraries;

public class page_2 extends libraries
{
	WebDriver dr; //Declaring WebDriver variable
	
	WebElement we; //Declaring Webelement
	
	public page_2(WebDriver dr) //Creating constructor for page_2
	{
		this.dr=dr;
				
	}
	
	By email= By.xpath("//form[@class='register']//input[1][@type='email']"); //xpath for email id
	By password=By.xpath("//form[@class='register']//input[@type='password']");//xpath for password
	By button=By.xpath("//form[@class='register']//input[@type='submit']");//xpath for signin
	By uid=By.xpath("//form[@class='login']//input[@name='username']");//xpath for username
	By pwd=By.xpath("//form[@class='login']//input[@name='password']");//xpath for password
	By submit=By.xpath("//form[@class='login']//input[@type='submit']");//xpath for submit
	
	public void eid(String e)
	{
		we=waitelement(email,20); //adding webdriver waits for emailid
		we.sendKeys(e);
	}
	public void rep_password(String p)
	{
		we=waitelement(password,20); //adding webdriver waits for password
		we.sendKeys(p);
	}
	public void clk_button()
	{
		we=clickable(button,120); //adding webdriver waits for sigin
		we.click();
	}
	public void username(String u)
	{
		we=waitelement(uid, 20); //adding webdriver waits for username
		we.sendKeys(u);
	}
	public void user_password(String p1)
	{
		we=waitelement(pwd, 20); //adding webdriver waits for password
		we.sendKeys(p1);
	}
	public void clk_submit()
	{
		we=clickable(submit, 20); //adding webdriver waits for submit
		we.click();
	}
	public void registration(String em,String rep_pwd) // creating method for registration
	{
		this.eid(em);
		this.rep_password(rep_pwd);
		this.clk_button();
		
	}
	
	public void login(String us_na,String us_pwd) // creating method for login
	{
		this.username(us_na);
		this.user_password(us_pwd);
		this.clk_submit();
	}
	
	
		
	}
	
	


