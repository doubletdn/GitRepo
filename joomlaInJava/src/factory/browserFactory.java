package factory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	private static String IEDriverPath = new File("drivers/IEDriverServer.exe").getAbsolutePath();
	private static String ChromeDriverPath = new File("drivers/chromedriver.exe").getAbsolutePath();

	// A Map is an object that maps keys to values. A map cannot contain
	// duplicate keys: Each key can map to at most one value
	// The Java platform contains three general-purpose Map implementations:
	// HashMap, TreeMap, and LinkedHashMap.
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;

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
}