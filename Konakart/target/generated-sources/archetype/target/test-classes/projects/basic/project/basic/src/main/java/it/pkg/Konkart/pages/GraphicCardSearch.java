package it.pkg.Konkart.pages;

import it.pkg.basic.constants.Findloc;
import it.pkg.basic.helper.CommonUtlity;

public class GraphicCardSearch {
	Findloc loc = new Findloc();

	
	public void typeAndSearch(String searchtext) {
		CommonUtlity.selectDropdown(loc.getlocator("loc.dpdn.click"), 30, searchtext);
		CommonUtlity.clickElement(loc.getlocator("loc.search.click"));

	}

	
	
}

