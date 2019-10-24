package com.atmecs.Konakart.constants;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.Konakart.util.ReadProp;

public class Findloc {
	static Properties assessment;

	public Findloc() {
		try {
			assessment = ReadProp.loadProperty(FilePath.LOCATOR_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getlocator(String key) {
		String value = assessment.getProperty(key);
		return value;

	}

}
