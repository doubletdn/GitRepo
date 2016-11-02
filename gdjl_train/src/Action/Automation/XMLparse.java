package Automation;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLparse {

	public Document initXmlDoc(String xmlPath) {
		Document doc=null;
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
	
	public NodeList readXLMFile(String XMLFolderPath, String xmlFileName, String tagName)
	{	
		NodeList nList = null;
		try {
			Document doc = initXmlDoc(XMLFolderPath+xmlFileName+".xml");
			nList = doc.getElementsByTagName(tagName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return nList;
	}
		
}
