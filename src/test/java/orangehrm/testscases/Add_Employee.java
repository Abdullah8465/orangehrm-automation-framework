package orangehrm.testscases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.Employee;
import utils.AppUtils;

public class Add_Employee extends AppUtils {

	@Parameters({ "fname", "mname", "lname" })
	@Test
	
	
	
	public void TestAddEmployee(String fname, String mname, String lname) {
		Employee emp = new Employee();
		boolean result = emp.addEmployee(fname, mname, lname);

		Assert.assertTrue(result, "employee not added!");

	}

}
