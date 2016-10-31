package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.Joomla_adminstratorLogin;
import Pages.Joomla_controlPanel;

public class Pages {

	public static <T> T getPage(Class<T> page) {
		return PageFactory.initElements(BrowsersFactory.driver, page);
	}

	public static Joomla_adminstratorLogin adminPage = getPage(Joomla_adminstratorLogin.class);
	public static Joomla_controlPanel controlpanelPage = getPage(Joomla_controlPanel.class);

}
