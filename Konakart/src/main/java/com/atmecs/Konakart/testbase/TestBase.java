package com.atmecs.Konakart.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.atmecs.Konakart.constants.FilePath;
import com.atmecs.Konakart.util.ReadProp;

public class TestBase {

	Properties baseClass;
	String url;
	public String browser;
	int downloadFile;
	public String normal;
	public WebDriver driver;
	String nodeUrl;
	ReadProp property = new ReadProp();

	
	@BeforeTest
	@Parameters("browsername")
	public void intitailizeBrowser(String browsername) throws IOException {

		baseClass = ReadProp.loadProperty(FilePath.CONFIG_FILE);
		url = baseClass.getProperty("url");
		// browser = baseClass.getProperty("browser");
		normal = baseClass.getProperty("normal");

		if (normal.equalsIgnoreCase("normal")) {
			System.out.println("browser is " + browser);

			if (browsername.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", FilePath.CHROME_PATH);

				driver = new ChromeDriver();
				driver.get(url);
			} else if (browsername.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", FilePath.FIREFOX_PATH);
				driver = new FirefoxDriver();
				driver.get(url);
			} else if (browsername.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.edge.driver", FilePath.IE_PATH);
				DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
				ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, url);
				driver = new InternetExplorerDriver(ieCaps);
			}

//		} ELSE IF (NORMAL.EQUALSIGNORECASE("GRID")) {
//			WEBDRIVER DRIVER 
//			SYSTEM.OUT.PRINTLN("GRID CONNECTION");
//			
//			WEBDRIVER DRV =GRID.GETCONNECTION(DRIVER, BROWSER);
//			/* TESTBASE.DRIVER=DRV; */
//			DRIVER.GET(URL);
//		}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
//	@AfterTest()
//	public void end() {
//		driver.quit();
//	}

	}
}
