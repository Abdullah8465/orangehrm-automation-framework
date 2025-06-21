package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import orangehrm.library.LoginPage;


public class AppUtils {

	
	
	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com";
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url);
		
	}

	
	@AfterTest
	public void logoutOnce() 
	{
	    LoginPage lp = new LoginPage();
	    lp.logout();   
	    driver.quit();
	}


	
	
	
}
