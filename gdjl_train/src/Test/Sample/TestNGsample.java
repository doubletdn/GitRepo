package Sample;

import org.testng.annotations.Test;

import Automation.BrowsersFactory;
import Automation.Contants;
import Page.Abstract;
import Page.Pages;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGsample extends Abstract {

//	private static Logger log = LogManager.getLogger(TestNGsample.class.getName());
	@BeforeMethod
	public void beforeMethod() throws Exception {
//		DOMConfigurator.configure(Contants.log4j);
		Abstract.initTest();
	}

	@Test
	public void f() throws Exception {

		Pages.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		log.info("Login to App with valid account");

	}

	@AfterMethod
	public void afterMethod() {
		 BrowsersFactory.closeAllBrowsers();
		 log.info("Log out App");
	}
}
