package Sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.BrowsersFactory;
import Automation.Contants;
import Page.Abstract;

public class TestNGsample extends Abstract {

//	private static Logger log = LogManager.getLogger(TestNGsample.class.getName());
	@BeforeMethod
	public void beforeMethod() throws Exception {
//		DOMConfigurator.configure(Contants.log4j);
		Abstract.initTest();
		log.info("init test run");
	}

	@Test
	public void f() throws Exception {

		pages.m_adminLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		log.info("Login to App with valid account");

	}

	@AfterMethod
	public void afterMethod() {
		 BrowsersFactory.closeAllBrowsers();
		 log.info("Log out App");
	}
}
