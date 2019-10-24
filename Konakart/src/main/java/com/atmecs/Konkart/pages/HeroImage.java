package com.atmecs.Konkart.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.Konakart.constants.Findloc;
import com.atmecs.Konakart.helper.CommonUtlity;

public class HeroImage {
	WebDriver driver;
	CommonUtlity CommonUtlity;
	Findloc loc;

	public HeroImage(WebDriver driver) {
		this.driver = driver;
		CommonUtlity = new CommonUtlity(driver);
		loc = new Findloc();
	}
 

	public void ProductDiscription() {
		System.out.println("hi");
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
