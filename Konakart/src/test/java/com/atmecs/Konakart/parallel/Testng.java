
package com.atmecs.Konakart.parallel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.atmecs.Konakart.constants.FilePath;
import com.atmecs.Konakart.testscripts.ProductSearchTestScripts;
import com.atmecs.Konakart.testscripts.SecondScenerio;
import com.atmecs.Konakart.util.ReadProp;

@Test
public class Testng {

	Properties baseClass;
	String browser;

	@SuppressWarnings("deprecation")
	public void base() throws IOException {
		baseClass = ReadProp.loadProperty(FilePath.CONFIG_FILE);
		browser = baseClass.getProperty("browser");
		String[] browser2 = browser.split(",");

		XmlSuite xmlsuite = new XmlSuite();
		xmlsuite.setName("suitename");
		xmlsuite.setVerbose(2);
		xmlsuite.setThreadCount(3);
		xmlsuite.setParallel("tests");
		for (String element : browser2) {

			XmlTest xmltest = new XmlTest(xmlsuite);
			Map<String, String> parameter = new HashMap<String, String>();
			parameter.put("browsername", element);
			xmltest.setParameters(parameter);
			xmltest.setName("Test validate " + element);

			XmlClass homePage = new XmlClass(ProductSearchTestScripts.class);
			XmlClass productDetail = new XmlClass(SecondScenerio.class);
			List<XmlClass> list = new ArrayList<XmlClass>();
			list.add(homePage);
			list.add(productDetail);
			xmltest.setXmlClasses(list);
			

		}

		TestNG testng = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlsuite);
		testng.setXmlSuites(suites);

		testng.run();

	}

}
