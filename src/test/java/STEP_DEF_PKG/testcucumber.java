package STEP_DEF_PKG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.page_1;
import PAGES.page_2;
import PAGES.page_3;
import PAGES.page_4;
import PAGES.page_5;
import Utilites.libraries;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcucumber extends libraries {
	
	static final Logger log = Logger.getLogger(testcucumber.class);

	protected static WebDriver dr;
  	page_1 p1;
  	page_2 p2;
  	page_3 p3;
  	page_4 p4;
  	page_5 p5;
  	String eid = null;
  	 String pwd = null;
  	@Given("^the user launch the Chrome application$")
  	public void the_user_launch_the_Chrome_application() throws Throwable {
  		dr=Launch_browser("CHROME","http://practice.automationtesting.in/");
    		dr.manage().window().maximize();
    		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    		log.info(" Chrome Browser is Successfully launched");
  		
  	}

  	@When("^the user open my Account page to register$")
  	public void the_user_open_my_Account_page_to_register() throws Throwable{
  		page_1 p1=new page_1(dr);
  	  	 p1.clk_ac();
  	}

  	@Then("^the user register using \"([^\"]*)\" and \"([^\"]*)\"$")
  	public void the_user_register_using_and(String arg1, String arg2) throws Throwable
  	{
  		p2=new page_2(dr);
  	  	 p2.registration(arg1,arg2);
  	  	 
  	  	Screenshot();
  	 try
  	 {
  		String errormsg= dr.findElement(By.xpath("//ul[@class='woocommerce-error']//li")).getText();
  		System.out.println(errormsg);
  		
  		 log.info(errormsg);
  	 }
  	 catch(Exception e)
  	 
  	 {  	   page_3 p3=new page_3(dr);
	   p3.clk_logout();
	   log.info(" Register happenned sucessfully");
  	 }
  		
  	}

  	@Then("^user login using \"([^\"]*)\" and \"([^\"]*)\"$")
  	public void user_login_using_and(String arg1, String arg2) throws Throwable{
  
    	  String l = null;
    	  String p = null;
    	  p2=new page_2(dr);
    	  p2.login(arg1,arg2);
    	  Screenshot();
    	 
    	  log.info("Sucessfull login "); 
    	  
  	}
  	@Then("^click on the login button user go to the next page$")
  	public void click_on_the_login_button_user_go_to_the_next_page() throws Throwable 
  	{
  		System.out.println("Sucessfull login");
  	}
  	
  	@Then("^Displays an error message that already registered$")
  	public void Displays_an_error_message_that_already_registered() throws Throwable 
  	{
  		System.out.println("An account is already registered with your email address. Please login.");
  	}
  	
  	@Then("^user click on the shop button and click on the add to cart button$")
  	public void user_click_on_the_shop_button_and_click_on_the_add_to_cart_button() throws Throwable {
  		 p4=new page_4(dr);
  	  	  p4.clk_operations();
  	  	 log.info("Items are added to the cart");
  	  	Screenshot();
  	}
  	
  	@Then("^user click on the Demo site and enters the details$")
  	public void user_click_on_the_Demo_site_and_enters_the_details() throws Throwable {
  		p5=new page_5(dr);
    	  p5.demosite("h","t","skdnagar", "asdfgh@gmail.com","1234432255","Zxcvbnml9@","Zxcvbnml9@");
    	  log.info("Registration for demo site is sucessfully done");
    	  Screenshot();
  	}
  		
  		
  		
  	}

	

