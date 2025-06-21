package orangehrm.library;

import org.openqa.selenium.By;
import utils.AppUtils;

// LoginPage class: Represents the Login page and its actions (Page Object Model)
public class LoginPage extends AppUtils {

    // Method to perform login
    public void login(String uid, String pwd)  
    {
        // Enter username and password in their fields
        driver.findElement(By.id("txtUsername")).sendKeys(uid);
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);
        // Click the Submit/Login button
        driver.findElement(By.name("Submit")).click();
    }

    //verify successful login
    public boolean isAdminmoduledisplayed() 
    {
    if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
    {
            return true;
    }
    	else {
            return false;
        	 }
    }

    // Method to perform logout
    public void logout() 
    {
        driver.findElement(By.partialLinkText("Welcome")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    // verify failed login
    public boolean iserrormsgdisplayed() 
    {
    if (driver.findElement(By.id("spanMessage")).isDisplayed()) 
    	{
            return true;
        } 
    else {
            return false;
        }
    }
}
