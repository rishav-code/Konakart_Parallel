package it.pkg.basic.dataprovider;

import org.testng.annotations.DataProvider;

import it.pkg.basic.constants.FilePath;
import it.pkg.basic.util.ProvideData;

public class TestDataInputOne {
	@DataProvider(name = "Dpdninput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
