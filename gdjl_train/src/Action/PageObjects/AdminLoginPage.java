package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Page.Abstract;

public class AdminLoginPage extends Abstract {


	// get class simple name;
	public AdminLoginPage() {
		control.setPage(this.getClass().getSimpleName());
	}

	public void loginAdminstrator(String username, String password) {
//		enter(pages.e_adminLogin.getUsernameTextbox(), username);
//		enter(pages.e_adminLogin.getPasswordTextbox(), password);
//		click(pages.e_adminLogin.getLoginButton());
		
		enter(usernameTextbox, username);
		
		
	}
	
	
//	public void loginAdminstratorByDataTest() throws Exception{
//		ExcelUtils.setExcelFile(Contants.testData, "Sheet1");
//		int _case = 0;
//		int _username = 1;
//		int _password = 2;
//		int _caseNum = ExcelUtils.getRowNumber();
//	}
	
	
	@FindBy(name = "username")
	private WebElement usernameTextbox;

	@FindBy(name = "passwd")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//button[contains(.,'Log in')]")
	private WebElement loginButton;
}
