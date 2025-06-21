package orangehrm.library;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.AppUtils;

// Employee class: Handles employee-related actions in OrangeHRM
public class Employee extends AppUtils
{
	

    // Add an employee with first, middle, and last name
	 public boolean addEmployee(String fname, String mname, String lname)
	    {
	        // Click on the "PIM" menu
	        driver.findElement(By.linkText("PIM")).click();
	        // Click on the "Add Employee" link
	        driver.findElement(By.linkText("Add Employee")).click();
	        
	        // Enter first, middle, and last names
	        driver.findElement(By.id("firstName")).sendKeys(fname);
	        driver.findElement(By.id("middleName")).sendKeys(mname);
	        driver.findElement(By.id("lastName")).sendKeys(lname);
	        
	        // Capture the generated employee ID before saving
	        String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
	        // Click the Save button
	        driver.findElement(By.id("btnSave")).click();

	        // Go to Employee List to verify if the new employee is added
	        driver.findElement(By.linkText("Employee List")).click();
	        
	        // Enter employee ID in the search box
	        driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	        driver.findElement(By.id("searchBtn")).click();

	        // Get the result table
	        WebElement emptable = driver.findElement(By.id("resultTable"));
	        // Get all rows in the table
	        List<WebElement> rows = emptable.findElements(By.tagName("tr"));

	        boolean empexist = false;

	        // Loop through each row (skip header row at index 0)
	        for(int i = 1; i < rows.size(); i++)
	        {
	            // Get all columns in the current row
	            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	            // Check if the employee ID matches
	            if(cols.get(1).getText().equals(empid))
	            {
	                empexist = true;
	                break;
	            }
	        }
	        // Return true if employee exists, else false
	        return empexist;
	    }
	}