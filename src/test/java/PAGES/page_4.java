package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilites.libraries;

public class page_4 extends libraries
{
	WebDriver dr;  //Declaring WebDriver
	WebElement we; //Declaring WebElement
	
	
	public page_4(WebDriver dr)  //creating constructor for page_4
	{
		this.dr=dr;
	
	}
	
	 By shop=By.xpath("//ul[@id='main-nav']//li[1]//a"); //xpath for shop
	 By productcategory=By.xpath("//ul[@class='product-categories']//li[4]//a");//xpath for productcategory
	 By selenium=By.xpath("//a[@rel='nofollow']");//xpath for selecting one of the product in the list
	// By h=By.xpath("//ul[@id='main-nav']//li[5]//a");
	 
	 public void clk_shop()
	 {
		 we=clickable(shop,50); //Adding webdriver waits for clicking shop
		 we.click();
	 }
	 public void clk_productcategory()
	 {
		 we=clickable(productcategory,50);//Adding webdriver waits for clicking productcategory
		 we.click();
	 }
	 public void clk_selenium()
	 {
		 we=clickable(selenium,50); //Adding webdriver waits for selecting one of the product
		 we.click();
	 }
//	 public void h1()
//	 {
//		 we=l.clickable(h,50);
//		 we.click();
//	 }
	 
	 public void clk_operations()  //Creating method for performing above methods
	 {
		 this.clk_shop();
		 this.clk_productcategory();
		 this.clk_selenium();
		// this.h1();
		 
	 }

}
