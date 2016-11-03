package PageObjects;

import Page.Abstract;
import Page.Interfaces;

public class AdminstratorLoginPage extends Abstract {

	// get class simple name;
	public AdminstratorLoginPage() {
		control.setPage(this.getClass().getSimpleName());
	}

	public void loginAdminstrator(String username, String password) {
		enter(Interfaces.AdminstratorLogin.usernameTextbox, username);
		enter(Interfaces.AdminstratorLogin.passwordTextbox, password);
		click(Interfaces.AdminstratorLogin.loginButton);
	}
}
