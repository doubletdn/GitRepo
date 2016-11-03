package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation.BrowsersFactory;
import PageObjects.AdminstratorLoginPage;
import PageObjects.ControlPanelPage;

public class Pages {

	public static <T> T getPage(Class<T> page) {
		return PageFactory.initElements(BrowsersFactory.driver, page);
	}

	public static AdminstratorLoginPage AdminstratorLogin = getPage(AdminstratorLoginPage.class);
	public static ControlPanelPage controlpanelPage = getPage(ControlPanelPage.class);

}
