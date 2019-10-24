#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Konkart.pages;

import ${package}.${artifactId}.constants.Findloc;
import ${package}.${artifactId}.helper.CommonUtlity;

public class HeroImage {

	Findloc loc = new Findloc();

	public void ProductDiscription() {
		CommonUtlity.clickElement(loc.getlocator("loc.heroimage.click"));
		CommonUtlity.clickElement(loc.getlocator("loc.productdiscription.click"));

	}

	public void ProductSpecification() {
		CommonUtlity.clickElement(loc.getlocator("loc.productspecification.click"));

	}

	public void customerReview() {

		CommonUtlity.clickElement(loc.getlocator("loc.customerreview.click"));
		CommonUtlity.scrollDownPage(300);
	}

	public void clickOncsdpdn(int dpdnindex) {

		CommonUtlity.selectDropdownByIndex(loc.getlocator("loc.customerreview.dpdn"), dpdnindex);
		CommonUtlity.scrollDownPage(300);
		

	}

}
