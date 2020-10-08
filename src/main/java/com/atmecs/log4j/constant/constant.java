package com.atmecs.log4j.constant;

import com.atmecs.log4j.setup.SetUp;

public class constant extends SetUp{
	
	   public static final String BASE_PATH=System.getProperty("user.dir");
		
		public static final String DATA_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/Locators/Data.properties";
	   
		public static final String LOCATOR_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/Locators/Locators.properties";

	    public static final String CHROME_PATH=System.getProperty("user.dir")+"/driver/chromedriver.exe";

}
