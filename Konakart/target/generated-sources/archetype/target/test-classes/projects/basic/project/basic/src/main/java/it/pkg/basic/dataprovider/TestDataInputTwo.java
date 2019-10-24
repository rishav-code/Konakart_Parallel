package it.pkg.basic.dataprovider;

import org.testng.annotations.DataProvider;

import it.pkg.basic.constants.FilePath;
import it.pkg.basic.util.ProvideData;

public class TestDataInputTwo {
	@DataProvider(name = "Negatveinput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}



}
