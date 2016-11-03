package Sample;

import org.testng.annotations.Test;

import Automation.BrowsersFactory;
import Automation.Contants;
import Page.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGsample {

  @BeforeMethod
  public void beforeMethod() {
	  BrowsersFactory.getBrowser("firefox");
	  BrowsersFactory.driver.get(Contants.appURL);
  }
  
  @Test
  public void f() {
	  Pages.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
  }

  
  @AfterMethod
  public void afterMethod(){
	  BrowsersFactory.closeAllBrowsers();
  }
}
