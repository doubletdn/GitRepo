package sample;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import Common.Contants;
import Common.BrowsersFactory;
import Common.Pages;
import Pages.joomla_adminstratorLogin;

public class sampleTest {

	// TODO Auto-generated method stub
	// String basePath = new File("").getAbsolutePath();
	// System.out.println(basePath);
	//
	// String path = new
	// File("src/main/resources/conf.properties").getAbsolutePath();
	// System.out.println(path);

	@BeforeMethod
	public void precondition() {
		BrowsersFactory.getBrowser("firefox");
		BrowsersFactory.driver.get(Contants.URL);
	}

	@Test
	public void test() {

		Pages.adminPage.loginToAdmin(Contants.adminUsername, Contants.adminPassword);

	}

}
