package com.atmecs.Konkart.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;
import com.atmecs.Konakart.testbase.TestBase;

public class ProductSearch extends TestBase {
	WebDriver driver;
	CommonUtlity CommonUtlity;
	Findloc loc;

	public ProductSearch(WebDriver driver) {
		this.driver = driver;
		CommonUtlity = new CommonUtlity(driver);
		loc = new Findloc();
	}
	 

	public void selectAndSearch(String Games, String text) {
		CommonUtlity.selectDropdown(loc.getlocator("loc.dpdn.click"), 30, Games);
		CommonUtlity.clickAndSendText(loc.getlocator("loc.search.txt"), 30, text);
		CommonUtlity.clickElement(loc.getlocator("loc.search.click"));

	}

	public void navigateback() {
		CommonUtlity.clickElement(loc.getlocator("loc.homepagecommon.click"));

	}

}
