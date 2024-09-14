package TestCase;

import org.testng.annotations.Test;

import PageObject.AddNewCustomer;
import PageObject.LoginPage;

public class tc_AddNewCustomer extends BaseClass{
	
	@Test
	public void Addnewcustomer() throws Exception {
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("username");
		lp.setPassword(password);
		logger.info("password");
		lp.clickbtn();
		logger.info("clicked on button");
		
		AddNewCustomer ac=new AddNewCustomer(driver);
		Thread.sleep(3000);
		ac.clickOnAddNew();
		logger.info("linked on add new customer");
		Thread.sleep(3000);
		
		ac.setName("Millie");
		logger.info("entered name");
		ac.Radiobtn("female");
		logger.info("selected the radiobtn");
		ac.setDob("06","12","2022");
		logger.info("entered dob");
		ac.setAddress("indus classic apartment");
		logger.info("entered address");
		ac.setCity("Hyderabad");
		logger.info("entered city name");
		ac.setState("Telangana");
		logger.info("entered the state");
		ac.setPin("500000");
		logger.info("enter pincode");
		ac.setTelephone("1234567891");
		logger.info("enter mobile no");
		ac.setEmail("millie.trousy@gmail.com");
		logger.info("enter the email");
		ac.sbtn();
		
		
	}

}
