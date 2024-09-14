package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how= How.XPATH, using="//a[text()='New Customer']")
	WebElement linkaddnew;
	
	@FindBy(how= How.NAME, using="name")
	WebElement txtUsername;
	
	@FindBy(how=How.NAME, using="rad1")
	WebElement rdgender;
	
	@FindBy(how= How.NAME, using="dob")
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using="addr")
	WebElement txtaddress;
	
	@FindBy(how=How.NAME, using="city")
	WebElement txtcity;
	
	@FindBy(how=How.NAME, using="state")
	WebElement txtstate;
	
	@FindBy(how=How.NAME, using="pinno")
	WebElement txtpin;
	
	@FindBy(how=How.NAME, using="telephoneno")
	WebElement telephone;
	
	@FindBy(how=How.NAME, using="emailid")
	WebElement txtemail;
	
	@FindBy(how=How.NAME, using="sub")
	WebElement submitbtn;
	
	public void clickOnAddNew() {
		linkaddnew.click();
	}
	
	public void setName(String cname) {
		txtUsername.sendKeys(cname);
	}
	
	public void Radiobtn(String rbttn) {
		rdgender.sendKeys(rbttn);
	}
	
	public void setDob(String dd, String mm, String yyyy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yyyy);
	}
	
	public void setAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void setCity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void setState(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void setPin(String cpin) {
		txtpin.sendKeys(String.valueOf(cpin));
	}
	
	public void setTelephone(String ctelephone) {
		telephone.sendKeys(ctelephone);
	}
	
	public void setEmail(String cemail) {
		txtemail.sendKeys(cemail);
	}
	
	public void sbtn() {
		submitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	

}
