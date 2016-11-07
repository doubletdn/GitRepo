package Page;

import org.openqa.selenium.support.PageFactory;

import Automation.BrowsersFactory;

public class Pages {

	public static <T> T getPage(Class<T> page) {
		return PageFactory.initElements(BrowsersFactory.driver, page);
	}

//	public static AdminLoginPage AdminstratorLogin = getPage(AdminLoginPage.class);
//	public static ControlPanelPage controlpanelPage = getPage(ControlPanelPage.class);
	

	public Joomla.AdminLoginPage e_adminLogin = getPage(Joomla.AdminLoginPage.class);
	public PageObjects.AdminLoginPage m_adminLogin = getPage(PageObjects.AdminLoginPage.class);
}
