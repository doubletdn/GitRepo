package Automation;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLparse {
	public static Document initXmlDoc(String xmlPath) {

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

	public static NodeList readXLMFile(String xmlPath, String tagName) {

		NodeList nList = null;

		try {
			Document doc = initXmlDoc(xmlPath);
			nList = doc.getElementsByTagName(tagName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nList;
	}

}
