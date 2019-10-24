package it.pkg.Konkart.pages;

import it.pkg.basic.constants.Findloc;
import it.pkg.basic.helper.CommonUtlity;
import it.pkg.basic.testbase.TestBase;

public class ProductSearch extends TestBase {
	Findloc loc = new Findloc();

	public void selectAndSearch(String Games, String text) {
		CommonUtlity.selectDropdown(loc.getlocator("loc.dpdn.click"), 30, Games);
		CommonUtlity.clickAndSendText(loc.getlocator("loc.search.txt"), 30, text);
		CommonUtlity.clickElement(loc.getlocator("loc.search.click"));

	}

	public void navigateback() {
		CommonUtlity.clickElement(loc.getlocator("loc.homepagecommon.click"));

	}

}
