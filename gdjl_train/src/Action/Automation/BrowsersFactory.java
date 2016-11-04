package Automation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import Automation.Contants;

public class BrowsersFactory {

	// A Map is an object that maps keys to values. A map cannot contain
	// duplicate keys: Each key can map to at most one value
	// The Java platform contains three general-purpose Map implementations:
	// HashMap, TreeMap, and LinkedHashMap.
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "firefox":
			driver = drivers.get("firefox");
			if (driver == null) {
				driver = new FirefoxDriver();
				drivers.put("Firefox", driver);
			}
			break;
		case "ie":
			driver = drivers.get("ie");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver", IEDriverPath);
				driver = new InternetExplorerDriver();
				drivers.put("IE", driver);
			}
			break;
		case "chrome":
			driver = drivers.get("chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			break;
		}
		return driver;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void closeAllBrowsers() {
		for (Map.Entry<String, WebDriver> entry : drivers.entrySet()) {
			entry.getValue().close();
		}
	}

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	private static String IEDriverPath = new File(Contants.IEDriver).getAbsolutePath();
	private static String ChromeDriverPath = new File(Contants.chromeDriver).getAbsolutePath();
	public static WebDriver driver = null;
}