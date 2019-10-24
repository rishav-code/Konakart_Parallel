#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Konkart.pages;

import ${package}.${artifactId}.constants.Findloc;
import ${package}.${artifactId}.helper.CommonUtlity;

public class GraphicCardSearch {
	Findloc loc = new Findloc();

	
	public void typeAndSearch(String searchtext) {
		CommonUtlity.selectDropdown(loc.getlocator("loc.dpdn.click"), 30, searchtext);
		CommonUtlity.clickElement(loc.getlocator("loc.search.click"));

	}

	
	
}

