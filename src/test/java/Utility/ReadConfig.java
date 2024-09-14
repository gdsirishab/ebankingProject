package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig () {
		File src=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e){
		System.out.println(e);	
		}
	}
	
	public String getApplicationurl() {
	
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getUsernamee() {
		
		String username=pro.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		
		String password=pro.getProperty("password");
		return password;
		
	}

}
