package TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Utility.ReadConfig;

public class BaseClass {
	
	ReadConfig rc=new ReadConfig();
	public String baseurl=rc.getApplicationurl();
	public String username=rc.getUsernamee();
	public String password=rc.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger=Logger.getLogger("e banking");
		PropertyConfigurator.configure("log4j.properties");
	}

}
