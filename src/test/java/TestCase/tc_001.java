package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class tc_001 extends BaseClass {
	
	@Test
	public void loginTest() throws Exception {
		driver.get(baseurl);
		logger.info("naviagting the web page");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("entered the username");
		lp.setPassword(password);
		logger.info("entered the password");
		lp.clickbtn();
		logger.info("clicked on loginbtn");
		Thread.sleep(3000);
		System.out.println(driver.getTitle().equals("GTPL Bank Manager HomePage"));
		logger.info("title is verified & login is successful");
	}
	
	

}
