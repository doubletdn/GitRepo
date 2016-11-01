package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Factory.BrowsersFactory;

public class BIAs {
	private static Actions act = new Actions(BrowsersFactory.driver);
	
	public static void enter(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public static void click(WebElement element){
		element.click();
	}
}
