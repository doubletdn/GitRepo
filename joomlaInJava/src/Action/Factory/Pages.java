package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.joomla_adminstratorLogin;
import Pages.joomla_controlPanel;

public class Pages {

	public static <T> T getPage(Class<T> page) {
		return PageFactory.initElements(BrowsersFactory.driver, page);
	}

	public static joomla_adminstratorLogin adminPage = getPage(joomla_adminstratorLogin.class);
	public static joomla_controlPanel controlpanelPage = getPage(joomla_controlPanel.class);

}
