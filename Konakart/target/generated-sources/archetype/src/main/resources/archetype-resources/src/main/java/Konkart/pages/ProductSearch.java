#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Konkart.pages;

import ${package}.${artifactId}.constants.Findloc;
import ${package}.${artifactId}.helper.CommonUtlity;
import ${package}.${artifactId}.testbase.TestBase;

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
