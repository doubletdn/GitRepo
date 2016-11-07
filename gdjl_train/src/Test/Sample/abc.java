package Sample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Automation.BrowsersFactory;
import Automation.Contants;
import Automation.ExcelUtils;
import Automation.General;
import Page.Pages;

public class abc {

	// public static void main(String[] args) throws Exception {
	// abc dongVat = new abc();
	// String[] tiengKeu = dongVat.getTiengKeu();
	// for (String keu : tiengKeu) {
	// System.out.println(keu);
	// }
	//
	// }
	//
	// public String[] getTiengKeu() {
	// return new String[] { "gau gau", "meo meo" };
	// }
	private static Logger Log = Logger.getLogger(TestNGsample.class.getName());

	public static void main(String[] args) throws Exception {
		DOMConfigurator.configure(Contants.log4j);
		BrowsersFactory.getBrowser("firefox");
		Log.info("Instant driver");
		BrowsersFactory.driver.get(Contants.appURL);
		Log.info("Navigate to App");

		Pages.AdminstratorLogin.loginAdminstrator(Contants.adminUser, Contants.adminPass);
		Log.info("Login to App with valid account");

		BrowsersFactory.closeAllBrowsers();
		Log.info("Log out App");
	}
}
