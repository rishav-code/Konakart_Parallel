#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.dataprovider;

import org.testng.annotations.DataProvider;

import ${package}.${artifactId}.constants.FilePath;
import ${package}.${artifactId}.util.ProvideData;

public class TestDataInputTwo {
	@DataProvider(name = "Negatveinput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}



}
