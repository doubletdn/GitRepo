package PageObjects;

import Automation.Contants;
import Automation.ExcelUtils;
import Automation.General;
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
	
	public void loginAdminstratorByDataTest() throws Exception{
		ExcelUtils.setExcelFile(Contants.testData, "Sheet1");
		int _case = 0;
		int _username = 1;
		int _password = 2;
		int _caseNum = ExcelUtils.getRowNumber();
		
	}
}
