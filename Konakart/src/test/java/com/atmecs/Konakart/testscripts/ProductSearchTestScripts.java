package com.atmecs.Konakart.testscripts;

import org.testng.annotations.Test;

import com.atmecs.Konakart.dataprovider.TestDataInputOne;
import com.atmecs.Konakart.dataprovider.TestDataInputTwo;
import com.atmecs.Konakart.testbase.TestBase;
import com.atmecs.Konakart.validations.SearchProductValidation;
import com.atmecs.Konkart.pages.ProductSearch;

public class ProductSearchTestScripts extends TestBase {
	ProductSearch search ;
	SearchProductValidation Searchvalidate ;

	@Test(priority = 1, dataProvider = "Dpdninput", dataProviderClass = TestDataInputOne.class)
	public void productSearchScript(String Data1, String text, String gametext, String price) {
		 search = new ProductSearch(driver);
		 Searchvalidate = new SearchProductValidation(driver);
		search.selectAndSearch(Data1, text);
		Searchvalidate.SearchValidate(gametext, price);

	}
	@Test(priority = 2, dataProvider = "Negatveinput", dataProviderClass = TestDataInputTwo.class)
    public void negativesearch(String negativeData1, String negativetext,String expnegativetext) {
		
		
		  search = new ProductSearch(driver); 
		  Searchvalidate = new  SearchProductValidation(driver);
		 
		 
		
		search.selectAndSearch(negativeData1, negativetext);
		Searchvalidate.negativesearchvalidate(expnegativetext);
		search.navigateback();
	}
	
	

}
