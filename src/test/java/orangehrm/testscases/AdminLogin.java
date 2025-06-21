package orangehrm.testscases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLogin extends AppUtils {

	@Parameters({ "uid", "pwd" })
	@Test

	public void checkAdminLogin(String uid, String pwd) {
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isAdminmoduledisplayed();
		Assert.assertTrue(res);
		

	}

}
