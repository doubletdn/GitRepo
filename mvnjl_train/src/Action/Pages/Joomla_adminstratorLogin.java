package Pages;

import Automation.BIAs;

public class Joomla_adminstratorLogin extends BIAs {
	public void loginAdminstrator(String username, String password) {
		enter(txt_username, username);
		enter(txt_password, password);
		click(btn_login);
	}
}
