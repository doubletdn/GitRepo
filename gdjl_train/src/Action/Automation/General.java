package Automation;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class General {

	public Document initXmlDoc(String xmlPath) {
		Document doc = null;
		try {
			File xmlFile = new File(xmlPath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public NodeList readXLMFile(String xmlPath, String tagName) {
		NodeList nList = null;
		try {
			Document doc = initXmlDoc(xmlPath);
			nList = doc.getElementsByTagName(tagName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nList;
	}
	
	public void initElement(String eName) {
		String pagePath = Contants.interfacePath + getPage() + ".xml";

		NodeList eList = readXLMFile(pagePath, "element");

		for (int temp = 0; temp < eList.getLength(); temp++) {
			Node nNode = eList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("name").item(0).getTextContent().equals(eName)) {
					seteType(eElement.getElementsByTagName("type").item(0).getTextContent());
					seteValue(eElement.getElementsByTagName("value").item(0).getTextContent());
				}
			}
		}
	}

	public WebElement findElement(String eName) {
		WebElement element = null;
		element = BrowsersFactory.driver.findElement(getBy(eName));
		return element;
	}

	public By getBy(String eName) {
		// load control information
		initElement(eName);
		By by = null;
		String type = geteType();
		String value = geteValue();
		// get element by xpath value
		if (type.equals("xpath")) {
			by = By.xpath(value);
		}
		// get element by id value
		if (type.equals("id")) {
			by = By.id(value);
		}
		// get element by name value
		if (type.equals("name")) {
			by = By.name(value);
		}
		return by;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPage() {
		return page;
	}

	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	public String geteValue() {
		return eValue;
	}

	public void seteValue(String eValue) {
		this.eValue = eValue;
	}

	private String page;
	private String eType;
	private String eValue;

}
