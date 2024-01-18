package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesfile {
	
	
	
		Properties prop;
		
		String path="src\\test\\resource\\TestData.properties";

		
		public ReadPropertiesfile(){
			try {
			prop=new Properties();
			
				FileInputStream fis=new FileInputStream(path);
				prop.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			public String getInvalidUsername(){
				String urll=prop.getProperty("invalidUsername");
				return urll;
			}
			
			public String invalidPass() {
				return prop.getProperty("invalidpass");
			}
		}


