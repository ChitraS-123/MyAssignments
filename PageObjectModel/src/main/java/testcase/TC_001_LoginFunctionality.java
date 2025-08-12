package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginFunctionality extends BaseClass {
	
	@Test
	public void loginFunctionality() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton();

	}
	

}
