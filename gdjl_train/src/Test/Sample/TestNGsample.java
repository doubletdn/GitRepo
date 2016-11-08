package Sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.BrowsersFactory;
import Automation.Contants;
import Page.Abstract;
import Page.Pages;

public class TestNGsample extends Abstract {

	@BeforeMethod
	public void beforeMethod() throws Exception {
		Abstract.initTest();
		log.info("init test run");
	}

	@Test
	public void f() throws Exception {
		Abstract ass = new Abstract();
//		ass.pages.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		//pages.AdminstratorLogin.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		Pages.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		
		log.info("Login to App with valid account");

	}

	@AfterMethod
	public void afterMethod() {
//		 BrowsersFactory.closeAllBrowsers();
		 log.info("Log out App");
	}
}
