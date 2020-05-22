package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static String adminURL;

//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		properties = new Properties();
//		FileInputStream inStream = new FileInputStream("./resources/others.properties");
//		properties.load(inStream);
//	}
//
//	@BeforeMethod
//	public void setUp() throws Exception {
//		driver = DriverFactory.getDriver(DriverNames.CHROME);
//		loginPOM = new LoginPOM(driver);
//		baseUrl = properties.getProperty("baseURL");
//		screenShot = new ScreenShot(driver);
//		// open the browser
//		driver.get(baseUrl);
//	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		adminURL = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
		
	}


//	@AfterMethod
//	public void tearDown() throws Exception {
//		driver.quit();
//	}

//	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
//	public void loginDBTest(String userName, String password) {
//		loginPOM.sendUserName(userName);
//		loginPOM.sendPassword(password);
//		loginPOM.clickLoginBtn();
//		screenShot.captureScreenShot(userName);
//
//	}
	
	//VerifyMultiplecategory (UNF_064):
	
	 @Test(priority=0,enabled=false)
	public void VerifyMultiplecategory () {
	
		    loginPOM.adminCorrectUsername("admin");
			loginPOM.adminCorrectPassword("admin@123");
			loginPOM.adminSuccessLogin();	
		    loginPOM.clicknavBar();
			loginPOM.verifyCatalogLinks();
			loginPOM.categories();
			loginPOM.categoriesAdd();		
	
	 }
	
	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String categoryNamedataprovider, String categoryDescdataprovider, String categorymetaTagTitledataprovider, String metaTagDescdataprovider) {
		driver.navigate().to(adminURL);
		loginPOM.adminCorrectUsername("admin");
		loginPOM.adminCorrectPassword("admin@123");
		loginPOM.adminSuccessLogin();	
	    loginPOM.clicknavBar();
		loginPOM.verifyCatalogLinks();
		loginPOM.categories();
		loginPOM.categoriesAdd();	
		loginPOM.categoryNamedataprovider(categoryNamedataprovider);
		loginPOM.categoryDescdataprovider(categoryDescdataprovider);
		loginPOM.categorymetaTagTitledataprovider(categorymetaTagTitledataprovider);
		loginPOM.metaTagDescdataprovider(metaTagDescdataprovider);
		loginPOM.clickdataTab();
		loginPOM.designTab();
		loginPOM.clicksave();
		loginPOM.success();	
		screenShot.captureScreenShot("Third");
		
		System.out.println("categoryNamedataprovider");
		System.out.println("categoryDescdataprovider");
		System.out.println("categorymetaTagTitledataprovider");
		System.out.println("metaTagDescdataprovider");
		
		

	}
	
	//VerifyAddProduct (UNF_065):
	
    @Test(priority=1,enabled=false)
		public void VerifyAddProduct() {
   	        loginPOM.adminCorrectUsername("admin");
			loginPOM.adminCorrectPassword("admin@123");
			loginPOM.adminSuccessLogin();
			loginPOM.clicknavBar();
			loginPOM.verifyCatalogLinks();
			loginPOM.products();
			loginPOM.productsAdd();
			loginPOM.getTitleAdd();
			loginPOM.productName("Blazer Girls(7-8)");
			loginPOM.productmetaTagTitle("Blazer for Girls");
			loginPOM.clickdataTab();
			loginPOM.modeltxtbox("BLG-112");
			loginPOM.pricetxtbox("3000");
			loginPOM.quantitytxtbox("100");
			loginPOM.linksTab();
			loginPOM.categoriestxtbox("School Uniforms");
			loginPOM.attributeTab();
			loginPOM.optionTab();
			loginPOM.recurringTab();
			loginPOM.discountTab();
			loginPOM.specialTab();
			loginPOM.imageTab();
			loginPOM.rewardpointsTab();
			loginPOM.designTab();
			loginPOM.clicksave();
			loginPOM.success();
			loginPOM.logout();
			loginPOM.adminCorrectUsername("admin");
			loginPOM.adminCorrectPassword("admin@123");
			loginPOM.adminSuccessLogin();
			screenShot.captureScreenShot("First");
	
}

    
  //VerifyCategoryinDB (UNF_066):
      @Test(priority=1,enabled=false)
		public void VerifyCategoryinDB() {
    	loginPOM.adminCorrectUsername("admin");
	    loginPOM.adminCorrectPassword("admin@123");
	    loginPOM.adminSuccessLogin();
        loginPOM.clicknavBar();
		loginPOM.verifyCatalogLinks();
		loginPOM.categories();
		loginPOM.categoriesAdd();
		loginPOM.categoryName("Sports");
		loginPOM.categoryDesc("Sports shoes");
		loginPOM.categorymetaTagTitle("shoes");
		loginPOM.metaTagDesc("Sports shoes");
		loginPOM.clickdataTab();
		loginPOM.designTab();
		loginPOM.clicksave();
		loginPOM.success();	
		screenShot.captureScreenShot("Second");
		

      }


}