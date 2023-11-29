package com.saucedemo.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Utilities {
	public Properties validPopData;
	public Properties invalidProData;
	public Utilities() {
		try {
			FileInputStream validfis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\saucedemo\\Configuration\\validConfigData.properties");
			validPopData=new Properties();
			validPopData.load(validfis);
			FileInputStream invalidFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\saucedemo\\Configuration\\invalidConfigData.properties");
			invalidProData=new Properties();
			invalidProData.load(invalidFile);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
