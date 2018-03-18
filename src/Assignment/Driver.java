package Assignment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.TestNG;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Driver {
	public static void main(String [] args)
	{
		 //TODO Auto-generated method 

		
		
		components c1 = new components();
		String b1=c1.testcase1 ;
		String b2=c1.testcase2 ;
		String b3=c1.testcase3 ;
		String b4=c1.testcase4 ;
		
		
		
				
		try {

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

		
			Element suite = document.createElement("suite");
			document.appendChild(suite);
			
				Attr suiteattr1 = document.createAttribute("name");
				suiteattr1.setValue("Frameworktest");
				suite.setAttributeNode(suiteattr1);
				
				Attr suiteattr2 = document.createAttribute("verbose");
				suiteattr2.setValue("1");
				suite.setAttributeNode(suiteattr2);

				
		
			Element test1 = document.createElement("test");
			suite.appendChild(test1);

				Attr testattrFV1 = document.createAttribute("name");
				testattrFV1.setValue("Form test");
				test1.setAttributeNode(testattrFV1);

			Element classes1 = document.createElement("classes");
			test1.appendChild(classes1);
			
			Element class1 = document.createElement("class");
			classes1.appendChild(class1);
				
				Attr classattr1 = document.createAttribute("name");
				classattr1.setValue("Assignment.TestClass");
				class1.setAttributeNode(classattr1);
			
			Element method1 = document.createElement("method");
			classes1.appendChild(method1);
			
			if(b1.equalsIgnoreCase("Yes"))		
			{
			Element include1 = document.createElement("include");
			method1.appendChild(include1);
				
				Attr include1attr1 = document.createAttribute("name");
				include1attr1.setValue("FormTesting");
				include1.setAttributeNode(include1attr1);
			}
				
			if(b2.equalsIgnoreCase("Yes"))
			{
				Element include2 = document.createElement("include");
				method1.appendChild(include2);
					
					Attr include1attr2 = document.createAttribute("name");
					include1attr2.setValue("LoginTest");
					include2.setAttributeNode(include1attr2);
			}
			if(b3.equalsIgnoreCase("Yes"))
			{
			Element include4 = document.createElement("include");
			method1.appendChild(include4);
				
				Attr include1attr4 = document.createAttribute("name");
				include1attr4.setValue("ReplyTest");
				include4.setAttributeNode(include1attr4);
				}
				
			if(b4.equalsIgnoreCase(b4))
			{
			
			Element include3 = document.createElement("include");
			method1.appendChild(include3);
				
				Attr include1attr3 = document.createAttribute("name");
				include1attr3.setValue("LogoutTest");
				include3.setAttributeNode(include1attr3);
			}
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File("C:\\Users\\gokul\\workspace\\FinalAssignment\\src\\config\\config.Xml"));

			

			transformer.transform(domSource, streamResult);

			System.out.println("Done creating XML File");

		} catch (ParserConfigurationException ce) {
			ce.printStackTrace();
		} catch (TransformerException fe) {
			fe.printStackTrace();
		}
		
		TestNG tng=new TestNG();		
		List<String> suites=new ArrayList<String>();		
		suites.add("C:\\Users\\gokul\\workspace\\FinalAssignment\\src\\config\\config.Xml");		
		tng.setTestSuites(suites);		
		tng.run();


	}	
		
}	
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
				
		
		
		
		
		
		
		
		
		
		
		
		
