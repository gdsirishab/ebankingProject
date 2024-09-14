package TestCase;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import Utility.XLUtils;

public class tc_loginDDT002 extends BaseClass{
	
	@Test(dataProvider="logindata")
	public void loginDDT(String user, String pwd) {
		driver.get(baseurl);
		logger.info("navigating to url");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(user);
		logger.info("entered username");
		lp.setPassword(pwd);
		logger.info("entered password");
		lp.clickbtn();
		logger.info("click on btn");
		driver.switchTo().alert().accept();
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			logger.info("alert is present");
		}
		
	}
	
	
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
			
			
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="logindata")
	String [][] getData() throws Exception{
		String path=System.getProperty("user.dir")+"./src/test/java/TestData/loginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int cellnum=XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][]=new String[rownum][cellnum];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<cellnum;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
		
		
		
		
		
	}
}
