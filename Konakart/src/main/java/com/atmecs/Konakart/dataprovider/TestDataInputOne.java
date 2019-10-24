package com.atmecs.Konakart.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.Konakart.constants.FilePath;
import com.atmecs.Konakart.util.ProvideData;

public class TestDataInputOne {
	@DataProvider(name = "Dpdninput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
