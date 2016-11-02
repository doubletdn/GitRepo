package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation.BrowsersFactory;

public class Pages {

	public static <T> T getPage(Class<T> page) {
		return PageFactory.initElements(BrowsersFactory.driver, page);
	}

	public static AdminstratorLogin adminPage = getPage(AdminstratorLogin.class);
	public static ControlPanel controlpanelPage = getPage(ControlPanel.class);

}
