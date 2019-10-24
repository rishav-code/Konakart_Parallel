package com.atmecs.Konakart.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.Konakart.constants.FilePath;
import com.atmecs.Konakart.util.ProvideData;

public class TestDataInputFour {
	@DataProvider(name ="starcontent")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 3);
		Object[][] getData = provideData.provideData();
		return getData;
	}

}
