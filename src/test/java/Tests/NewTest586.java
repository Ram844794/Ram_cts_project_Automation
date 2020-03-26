package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PAGES.page_1;
import PAGES.page_2;
import PAGES.page_3;
import PAGES.page_4;
import PAGES.page_5;

public class NewTest586 {

  	protected static WebDriver dr;
  	page_1 p1;
  	page_2 p2;
  	page_3 p3;
  	page_4 p4;
  	page_5 p5;
  	String eid = null;
  	 String pwd = null;
    @Test(priority=1)
    public void f() 
    {
  	page_1 p1=new page_1(dr);
  	 p1.clk_ac();
    }
//    @Test(priority=2)
//    public void f1() 
//    {
//  	  
//  	p2=new page_2(dr);
//  	 p2.registration("bltcts87225@gmail.com","Asvthoraipakkam9877");
//  	
//  	 
//    }
    @Test(priority=3)
    public void f2()
    {
//  	  page_3 p3=new page_3(dr);
//  	   p3.clk_logout();
  	  String l = null;
  	  String p = null;
  	  p2=new page_2(dr);
  	  p2.login("user45@gmail.com","mohankumar@6045");
  	  p4=new page_4(dr);
  	  p4.clk_operations();
    }
    @Test(priority=4)
    public void f3()
    {
  	  p5=new page_5(dr);
  	  p5.demosite("h","t","skdnagar", "asdfghtyqwe@gmail.com","1234564325","Zxcvbnml9@","Zxcvbnml9@");
    }


    @Test(priority=0)
    public void beforeClass()
    {
  	  System.setProperty("WebDriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
  	  dr=new ChromeDriver();
  	  dr.get("http://practice.automationtesting.in/");
  	 
  		dr.manage().window().maximize();
  		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


  //  @AfterClass
  //  public void afterClass()
  //  {
//  	  dr.close();
  //  }

  }


