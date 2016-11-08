package Page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.BrowsersFactory;
import Automation.Contants;
import Automation.General;

public class Abstract extends General {

	public Abstract(){
		log = LogManager.getLogger(getClass());
		DOMConfigurator.configure(Contants.log4j);
	}
	
	public static void initTest() {
		BrowsersFactory.getBrowser(Contants.browser);
		BrowsersFactory.driver.get(Contants.appURL);
	}

	public void enter(String eName, String value) {
		WebElement e = control.findElement(eName);
		e.clear();
		e.sendKeys(value);
	}
	
	public void enter(WebElement eName, String value){
		eName.clear();
		eName.sendKeys(value);
	}

	public void click(String eName) {
		WebElement e = control.findElement(eName);
		e.click();
	}
	
	public void click(WebElement eName){
		eName.click();
	}

	
	protected static General control = new General();
	protected static Logger log;
//	private static Actions act = new Actions(BrowsersFactory.driver);
}
