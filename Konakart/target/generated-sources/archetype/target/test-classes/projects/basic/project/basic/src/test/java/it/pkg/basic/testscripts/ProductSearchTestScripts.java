package it.pkg.basic.testscripts;

import org.testng.annotations.Test;

import it.pkg.basic.dataprovider.TestDataInputOne;
import it.pkg.basic.dataprovider.TestDataInputTwo;
import it.pkg.basic.testbase.TestBase;
import it.pkg.basic.validations.SearchProductValidation;
import it.pkg.Konkart.pages.ProductSearch;

public class ProductSearchTestScripts extends TestBase {
	ProductSearch search = new ProductSearch();
	SearchProductValidation Searchvalidate = new SearchProductValidation();

	@Test(priority = 1, dataProvider = "Dpdninput", dataProviderClass = TestDataInputOne.class)
	public void productSearchScript(String Data1, String text, String gametext, String price) {
		search.selectAndSearch(Data1, text);
		Searchvalidate.SearchValidate(gametext, price);

	}
	@Test(priority = 2, dataProvider = "Negatveinput", dataProviderClass = TestDataInputTwo.class)
    public void negativesearch(String negativeData1, String negativetext,String expnegativetext) {
		
		search.selectAndSearch(negativeData1, negativetext);
		Searchvalidate.negativesearchvalidate(expnegativetext);
		search.navigateback();
	}
	
	

}
