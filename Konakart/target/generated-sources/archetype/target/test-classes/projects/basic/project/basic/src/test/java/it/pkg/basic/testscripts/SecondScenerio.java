package it.pkg.basic.testscripts;

import org.testng.annotations.Test;

import it.pkg.basic.dataprovider.TestDataInputThree;
import it.pkg.basic.testbase.TestBase;
import it.pkg.basic.validations.HeroImageValidation;
import it.pkg.Konkart.pages.HeroImage;

public class SecondScenerio extends TestBase {
	HeroImage heroimage = new HeroImage();
	HeroImageValidation hiv = new HeroImageValidation();

	@Test(priority = 3, dataProvider ="content", dataProviderClass = TestDataInputThree.class)
	public void select(String ifexpectedkindle, String ifexpectedcoffe, String kindleproudctdesctext,
			String coffeproductdesctext, String kindledspecitext, String spectextcoffe,String hightolowdata, String lowtohighdata) {
		heroimage.ProductDiscription();
		hiv.productDescriptionValidation(ifexpectedkindle, ifexpectedcoffe, kindleproudctdesctext,
				coffeproductdesctext);
		heroimage.ProductSpecification();
		hiv.productSpecificationValidation(ifexpectedkindle, ifexpectedcoffe, kindledspecitext, spectextcoffe);
		heroimage.customerReview();
		heroimage.clickOncsdpdn(0);
		hiv.dateValidate(0);
		heroimage.clickOncsdpdn(1);
		hiv.dateValidate(1);
		heroimage.clickOncsdpdn(2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hiv.ratingValidate(hightolowdata);
		heroimage.clickOncsdpdn(3);
		hiv.ratingValidate( lowtohighdata);

	}

	/*
	 * @Test(priority = 4, dataProvider = "starcontent", dataProviderClass =
	 * TestDataInputFour.class) public void date(String hightolowdata, String
	 * lowtohighdata) { System.out.println("hi");
	 * 
	 * heroimage.clickOncsdpdn(0); hiv.dateValidate(0); heroimage.clickOncsdpdn(1);
	 * hiv.dateValidate(1); heroimage.clickOncsdpdn(2);
	 * hiv.ratingValidate(hightolowdata, lowtohighdata); heroimage.clickOncsdpdn(3);
	 * hiv.ratingValidate(hightolowdata, lowtohighdata);
	 * 
	 * }
	 */
}