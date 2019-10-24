#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.testscripts;

import org.testng.annotations.Test;

import ${package}.${artifactId}.dataprovider.TestDataInputOne;
import ${package}.${artifactId}.dataprovider.TestDataInputTwo;
import ${package}.${artifactId}.testbase.TestBase;
import ${package}.${artifactId}.validations.SearchProductValidation;
import ${package}.Konkart.pages.ProductSearch;

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
