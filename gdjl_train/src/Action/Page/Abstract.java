package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.BrowsersFactory;
import Automation.General;

public class Abstract extends General {
	private static Actions act = new Actions(BrowsersFactory.driver);

	public void enter(String eName, String value) {
		WebElement e = control.findElement(eName);
		e.clear();
		e.sendKeys(value);
	}

	public void click(String eName){
		WebElement e = control.findElement(eName);
		e.click();
	}

	protected static General control = new General();
}
