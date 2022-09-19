package com.dev.util;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		 try (OutputStream output = new FileOutputStream("resources/crypto.properties")) {

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("db.url", "");
	            prop.setProperty("db.user", "mkyong");
	            prop.setProperty("db.password", "password");

	            // save properties to project root folder
	            prop.store(output, null);

	            //System.out.println(prop.getProperty("db.url")==null||prop.getProperty("db.url").isEmpty());
	            
	            System.out.println(prop.getProperty("db.uri"));
	            
	            
	            
	            
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
