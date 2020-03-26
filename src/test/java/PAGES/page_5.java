package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilites.libraries;

public class page_5 extends libraries
{
	WebDriver dr; //Declaring webdriver
	WebElement we; //Declaring webelement
	
	
	public page_5(WebDriver dr) //creating constructor for page_5
	{
		this.dr=dr;
		
	}
	
	By demo=By.xpath("//ul[@id='main-nav']//li[5]//a"); //xpath for demo
	By firstname=By.xpath("//input[@placeholder='First Name']"); //xpath for first name
	By Lastname=By.xpath("//input[@placeholder='Last Name']"); //xpath for lastname
	By address=By.xpath("//textarea[@ng-model='Adress']");//xpath for address
	By email=By.xpath("//input[@ng-model='EmailAdress']"); //xpath for email
	By phone=By.xpath("//input[@ng-model='Phone']");//xpath for phone number
	By gender=By.xpath("//input[@value='FeMale']");//xpath for gender
	By hobbies=By.xpath("//input[@id='checkbox1']");//xpath for hobbiess
	By languages=By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']");//xpath for languages
	By skills=By.xpath("//select[@id='Skills']");//xpath for skills
	By dropdown=By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[8]//a");
	By country=By.xpath("//select[@id='countries']");
	By dropdown_selcountry=By.xpath("//span[@class='select2-selection__arrow']");//xpath for dropdown in countries
	By select_country=By.xpath("//*[@id=\"select2-country-results\"]/li[6]"); //xpath for textarea in countries
	By year=By.xpath("//select[@id='yearbox']//option[10]");//xpath for year
	By month=By.xpath("//select[@placeholder='Month']//option[4]");//xpath for month
	By day=By.xpath("//select[@placeholder='Day']//option[4]");//xpath for day
	By password=By.xpath("//input[@id='firstpassword']");//xpath for password
	By confirm_pwd=By.xpath("//input[@id='secondpassword']");//xpath for confirm pwd
	By button=By.xpath("//button[@id='submitbtn']");//xpath for submit
	
	 public void clk_demo()
	 {
		 we=clickable(demo,50);
		 we.click();
	 }
	
	public void f_n(String f_name)
	{
		we=waitelement(firstname, 20);
		we.sendKeys(f_name);
	}
	public void l_n(String l_name)
	{
		we=waitelement(Lastname, 20);
		we.sendKeys(l_name);
	}
	public void add(String adds)
	{
		we=waitelement(address, 20);
		we.sendKeys(adds);
		
	}
	public void eid(String eid)
	{
		we=waitelement(email, 20);
		we.sendKeys(eid);
	}
	public void ph_num(String ph_0)
	{
		we=waitelement(phone, 20);
		we.sendKeys(ph_0);
	}
	public void clk_gender()
	{
		we=clickable(gender, 20);
		we.click();
	}
	public void select_hobbies()
	{
		we=clickable(hobbies,20);
		we.click();
	}
	public void lan()
	{
		we=clickable(languages, 20);
		we.click();
	}
	public void select_skills()
	{
		WebElement we1=dr.findElement(By.xpath("//select[@id='Skills']"));
		Select s1=new Select(we1);
		s1.selectByVisibleText("C");
	}
	public void drop_co()
	{
		we=clickable(dropdown,80);
		we.click();
	}
//	public void sel_country()
//	{
//		we=clickable(country, 20);
//		we.click();
//	}
	
	public void sel_counteries()
	{
		WebElement we2=dr.findElement(By.xpath("//select[@id='countries']"));
		Select s2=new Select(we2);
		s2.selectByVisibleText("India");
	}
	public void drop_coun()
	{
		we=clickable(dropdown_selcountry,20);
		we.click();
	}
	public void sel_countries()
	{
		we=clickable(select_country, 20);
		we.click();
	}
	
	public void clk_year()
	{
		we=clickable(year, 20);
		we.click();
	}
	public void clk_month()
	{
		we=clickable(month, 20);
		we.click();						
	}
	public void clk_day()
	{
		we=clickable(day, 20);
		we.click();
	}
	public void enter_password(String pd)
	{
		we=waitelement(password, 20);
		we.sendKeys(pd);
	}
	public void con_pwd(String c_pwd)
	{
		we=waitelement(confirm_pwd, 20);
		we.sendKeys(c_pwd);
	}
	public void clk_submit()
	{
		we=clickable(button, 20);
		we.click();
	}
	public void demosite(String f2,String l2,String a2,String e2,String p2,String q2,String r2)
	{
		this.clk_demo();
		this.f_n(f2);
		this.l_n(l2);
		this.add(a2);
		this.eid(e2);
		this.ph_num(p2);
		this.clk_gender();
		this.select_hobbies();
		this.lan();
		//this.d1();
		this.drop_co();
		this.select_skills();
		
		//this.sel_country();
		
		this.sel_counteries();
		this.drop_coun();
		this.sel_countries();
		this.clk_year();
		this.clk_month();
		this.clk_day();
		this.enter_password(q2);
		this.con_pwd(r2);
		this.clk_submit();
	}
	

}
