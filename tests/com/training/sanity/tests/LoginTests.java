package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
//		@Test
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn();
//		screenShot.captureScreenShot("First");
//	}
	
		
		@Test(priority=0)
		public void validOrderDetails() {
			loginPOM.selectLogin();
			loginPOM.clickLogin();
			loginPOM.sendEmailId("neha@gmail.com");
			loginPOM.sendPassword("Uniform_002");
			loginPOM.clickLoginBtn();
			loginPOM.clickOrderHistory();
			loginPOM.webTable();
			loginPOM.webTableOrderId1();
			loginPOM.webTableCustomer();
			loginPOM.webTableNoofproducts();
			loginPOM.webTableStatus();
			loginPOM.webTableTotal();
			loginPOM.webTableDateAdded();			
			loginPOM.clickViewIcon();
			screenShot.captureScreenShot("First");
		}
		
        @Test(priority=1)
		 public void ModifyPersonalDetails() {
        	loginPOM.editAccountInfo();
			loginPOM.sendFirstName("Neha");
			loginPOM.sendLastName("B");
			loginPOM.sendEmailID("neha@gmail.com");
			loginPOM.sendTelephoneNumber("9876543210");
			loginPOM.submit();
			loginPOM.acctsuccessMsg();
			screenShot.captureScreenShot("Second");
		}
		
		@Test(priority=2)
		public void validPasswordChange() {
			loginPOM.changePwd();
			loginPOM.newPwwd("Sneha123");
			loginPOM.confirmPwwd("Sneha123");
			loginPOM.cnt();
			loginPOM.pwdSuccessMsg();
			screenShot.captureScreenShot("Third");
		}
	
		
}
