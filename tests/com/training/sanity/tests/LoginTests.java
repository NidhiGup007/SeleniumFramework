package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;



public class LoginTests {

	private static WebDriver driver;
	private static String baseUrl;
	private static String adminURL;
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
		adminURL = properties.getProperty("adminURL");
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
	
//	@AfterClass
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	
		
	
//		@Test
//	public void validLoginTest() {
//      loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn();
//		screenShot.captureScreenShot("First");
//	}
	
		
//		@Test(priority=0)
//		public void validOrderDetails() {
//			loginPOM.selectLogin();
//			loginPOM.clickLogin();
//			loginPOM.sendEmailId("neha@gmail.com");
//			loginPOM.sendPassword("Uniform_002");
//			loginPOM.clickLoginBtn();
//			loginPOM.clickOrderHistory();
//			loginPOM.webTable();
//			loginPOM.webTableOrderId1();
//			loginPOM.webTableCustomer();
//			loginPOM.webTableNoofproducts();
//			loginPOM.webTableStatus();
//			loginPOM.webTableTotal();
//			loginPOM.webTableDateAdded();			
//			loginPOM.clickViewIcon();
//			screenShot.captureScreenShot("First");
//		}
//		
//        @Test(priority=1)
//		 public void ModifyPersonalDetails() {
//        	loginPOM.editAccountInfo();
//			loginPOM.sendFirstName("Neha");
//			loginPOM.sendLastName("B");
//			loginPOM.sendEmailID("neha@gmail.com");
//			loginPOM.sendTelephoneNumber("9876543210");
//			loginPOM.submit();
//			loginPOM.acctsuccessMsg();
//			screenShot.captureScreenShot("Second");
//		}
//		
//		@Test(priority=2)
//		public void validPasswordChange() {
//			loginPOM.changePwd();
//			loginPOM.newPwwd("Sneha123");
//			loginPOM.confirmPwwd("Sneha123");
//			loginPOM.cnt();
//			loginPOM.pwdSuccessMsg();
//			screenShot.captureScreenShot("Third");
//		}
	
		
//		 //VerifyReturnedOrderedProductAllowed (UNF_036):
//	     @Test(priority=0,enabled=false)
//	     public void validReturnSuccess() {
//	    loginPOM.selectLogin();
//		loginPOM.clickLogin();
//		loginPOM.sendEmailId("neha@gmail.com");
//		loginPOM.sendPassword("Uniform_002");
//		loginPOM.clickLoginBtn();
//		loginPOM.clickUserIconDropDwn();
//		loginPOM.clickOrderHistory();
//		loginPOM.webTable();
//		loginPOM.webTableOrderId1();
//		loginPOM.webTableCustomer();
//		loginPOM.webTableNoofproducts();
//		loginPOM.webTableStatus();
//		loginPOM.webTableTotal();
//		loginPOM.webTableDateAdded();
//		loginPOM.clickViewIcon();
//		loginPOM.clickReturn();
//		loginPOM.clickReturnReason();
//		loginPOM.clickRadioYes();
//		loginPOM.sendreturnReasonDesc("Incorrect Item");
//		loginPOM.clickAgreePolicy();
//		loginPOM.clickSubmitReturn();
//		screenShot.captureScreenShot("First");
//	}
//	     
//	     //VerifyAdminLoginDenial (UNF_037):
//	     
//	     @Test(priority=1, enabled=false)
//			public void loginDenial() {
//	    	    driver.navigate().to(adminURL);
//	    	    loginPOM.adminUsername("Nha");
//				loginPOM.adminPassword("neha2345");
//				loginPOM.adminLogin();
//				loginPOM.adminLoginFailed();
//				screenShot.captureScreenShot("Second");
//		
//}
//	     //VerifyAdminallowstoaddcategory (UNF_038):
//
//	     @Test(priority=2, enabled=true)
//			public void adminAllowsAddCategory() {
//	    	    //driver.navigate().to(adminURL);
//	    	    loginPOM.adminCorrectUsername("admin");
//				loginPOM.adminCorrectPassword("admin@123");
//				loginPOM.adminSuccessLogin();
//				loginPOM.clicknavBar();
//				loginPOM.verifyCatalogLinks();
//				loginPOM.categories();
//				loginPOM.categoriesAdd();
//				loginPOM.getTitleAdd();
//				loginPOM.categoryName("Blazers(3-5)");
//				loginPOM.categoryDesc("Blazers for students");
//				loginPOM.metaTagTitle("BLZ 03");
//				loginPOM.metaTagDesc("Blazers for primary class students");
//				loginPOM.clickdataTab();
//				loginPOM.clickdesignTab();
//				loginPOM.clicksave();
//				loginPOM.modifySuccess();
//				screenShot.captureScreenShot("Third");
//		
//}
//	     
//	   //VerifyAdminEditMetaTag (UNF_039):
//	     @Test(priority=3,enabled=false)
//	     public void adminEditMetaTag() {
//	    	driver.navigate().to(adminURL);
//	    	loginPOM.adminCorrectUsername("admin");
//			loginPOM.adminCorrectPassword("admin@123");
//			loginPOM.adminSuccessLogin();
//			loginPOM.clicknavBar();
//	    	loginPOM.verifyCatalogLinks();
//			loginPOM.clickcategories();
//	    	loginPOM.editCategory();
//	    	loginPOM.metaTagTitle("BLZ 05");
//	    	loginPOM.metaTagDesc("Uniform for students");
//	    	loginPOM.clickdataTab();
//     		loginPOM.clickdesignTab();
//			loginPOM.clicksave();
//			loginPOM.modifySuccess();
//	    	screenShot.captureScreenShot("Fourth");
//	    	 
//	     }
//	     
//	     //VerifyAdminDeleteMultipleCategory (UNF_040):
//	     @Test(priority=4,enabled=false)
//	     public void adminDeleteMultipleCategory() throws InterruptedException, AWTException {
//	    	driver.navigate().to(adminURL);
//	    	loginPOM.adminCorrectUsername("admin");
//			loginPOM.adminCorrectPassword("admin@123");
//			loginPOM.adminSuccessLogin();
//			loginPOM.clicknavBar();
//		    loginPOM.verifyCatalogLinks();
//			loginPOM.categories();
//			loginPOM.selectCategoryName();
//			loginPOM.deleteCategory();
//			//loginPOM.deleteSuccessMsg();
//			screenShot.captureScreenShot("Fifth");
//			
//	      //Navigating to Identify Delete Button
//			//screenShot.captureScreenShot("Delete Button");
//			
//			//driver.findElement(By.xpath("//i[@class='fa fa-trash-o]")).click();
//			Thread.sleep(2000);
//			//driver.switchTo().alert().accept();
//			
//
//          //Accepting the pop up to Confirm Deletion
//			//screenShot.captureScreenShot("Popup Delete Confirmation");
//			//alert.accept();
//			Robot robo = new Robot();
//			robo.keyPress(KeyEvent.VK_ENTER);
//			Thread.sleep(5000);
//			robo.keyPress(KeyEvent.VK_ENTER);
//			robo.keyRelease(KeyEvent.VK_ENTER);
//			screenShot.captureScreenShot("Successful Deletion");
//	     }
	     	
	        //VerifyMultiplecategory (UNF_064):
	
				@Test(enabled=false, dataProvider="inputs")
				public void VerifyMultiplecategory(String categoryNamedataprovider, String categoryDescdataprovider, String categorymetaTagTitledataprovider, String metaTagDescdataprovider) {
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
				
				}
				
//				@DataProvider(name="inputs")
//				public Object[][] getData() {
//					return new Object[][] {
//						{"Sports wear", "Sports", "Sports", "Sports"},
//						{"Cultural wear", "Cultural", "Cultural", "Cultural"},	
//						
//						{"Weekend uniform", "Weekend", "Weekend", "Weekend"},
//						{"Formal wear", "formal", "formal", "formal"}
//					};
//				}
	
	         //VerifyAddProduct (UNF_065):
	
		     @Test(priority=1,enabled=false)
				public void VerifyAddProduct() {
		    	    driver.navigate().to(adminURL);
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
		       @Test(priority=2,enabled=false)
				public void VerifyCategoryinDB() {
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