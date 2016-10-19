package sample;

import java.io.File;

import org.openqa.selenium.WebDriver;

import factory.browserFactory;

public class sampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String basePath = new File("").getAbsolutePath();
		// System.out.println(basePath);
		//
		// String path = new
		// File("src/main/resources/conf.properties").getAbsolutePath();
		// System.out.println(path);
		
		WebDriver driver = browserFactory.getBrowser("ie");
		
		driver.get("http://google.com");
		
	}

}
