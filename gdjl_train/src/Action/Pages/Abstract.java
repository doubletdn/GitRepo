package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.BrowsersFactory;
import Automation.XMLparse;

public class Abstract {
	private static Actions act = new Actions(BrowsersFactory.driver);

	public static void enter(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void click(String element) {
		
		element.click();
	}
	
	public void getElementInfo(String elementName){
		XMLparse xmlEle = new XMLparse();
		Document xmlDoc = xmlEle.readXLMFile(XMLFolderPath, xmlFileName, tagName)
	}
}
