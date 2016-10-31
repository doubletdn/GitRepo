package Sample;

import org.testng.annotations.Test;

import Automation.Contants;
import Factory.BrowsersFactory;

import org.testng.annotations.BeforeMethod;

public class TestNGsample {
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  BrowsersFactory.getBrowser("firefox");
	  BrowsersFactory.driver.get(Contants.autURL);
  }

}
