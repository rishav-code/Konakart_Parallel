package it.pkg.basic.constants;

import java.io.IOException;
import java.util.Properties;

import it.pkg.basic.util.ReadProp;

public class ValidateData {

	static Properties assessment;

	public ValidateData() {
		try {
			assessment = ReadProp.loadProperty(FilePath.VALIDATION_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static String getData(String key) {
		String value = assessment.getProperty(key);
		return value;

	}

}
