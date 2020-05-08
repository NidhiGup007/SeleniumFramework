package com.training.pom;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	private WebElement loginoption;
	
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='input-password']")
		private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement success;
	
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Order History')]")
	private WebElement orderHistory;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover']")
	private List<WebElement> webTable;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[1]")
    private WebElement webTableOrderId;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[2]")
    private WebElement webTableCustomer;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[3]")
    private WebElement webTableNoofProducts;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[4]")
    private WebElement webTableStatus;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[5]")
    private WebElement webTableTotal;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[6]")
    private WebElement webTableDateAdded;
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement viewIcon ;
	
	//validateModifyPersonalDetails
	
	@FindBy(xpath="//a[contains(text(),'Edit Account')]")
	private WebElement editAccountInfo;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lName;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailID;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement tPhone;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement sub;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement acctsuccessMsg;
	
	//Password Change
	@FindBy(xpath="//a[contains(text(),'Change your password')]")
	private WebElement changePwd;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement newPwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement confirmPwd;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement cnt;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement pwdSuccessMsg;
	
	
	
	
	public void selectLogin() {
	      this.loginoption.click();
	 }
		 	
	 public void clickLogin() {
      this.login.click();
    }
	 
      public void sendEmailId(String EmailId) {
         this.userName.clear();
          this.userName.sendKeys(EmailId);
      }    
            
         public void sendPassword(String password) {
          this.password.clear(); 
          this.password.sendKeys(password); 
          
         }
         
         public void clickLoginBtn() {
         this.submit.click();         
         }
         
         //Order Details Page
         public void clickOrderHistory() {
             this.orderHistory.click();  
             }
         
         public void webTable() {
        	 int noofRows = webTable.size();
             System.out.println("Number of record Displayed are :" +noofRows);  
             } 
         
         
         public void webTableOrderId1() {
             String expText = "Order ID";
             String actText = webTableOrderId.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }
         
         public void webTableCustomer() {
             String expText = "Customer";
             String actText = webTableCustomer.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }
         
         public void webTableNoofproducts() {
             String expText = "No. of Products";
             String actText = webTableNoofProducts.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }
         
         public void webTableTotal() {
             String expText = "Total";
             String actText = webTableTotal.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }
         
         public void webTableDateAdded() {
             String expText = "Date Added";
             String actText = webTableDateAdded.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }
         
         
         public void webTableStatus() {
             String expText = "Status";
             String actText = webTableStatus.getText();
             Assert.assertTrue(actText.contains(expText));    
             System.out.print(actText+" , ");
         }

          
         public void clickViewIcon() {
             this.viewIcon.click();             
         }
    	 
    	  //validateModifyPersonalDetails
         
             public void editAccountInfo() {
            	 this.editAccountInfo.click();      	 
            }
         public void sendFirstName(String firstName) {
             this.fName.clear();
              this.fName.sendKeys(firstName);
          }
         public void sendLastName(String lastName) {
             this.lName.clear();
              this.lName.sendKeys(lastName);         
          }
         public void sendEmailID(String emailID) {
             this.emailID.clear();
              this.emailID.sendKeys(emailID);
          }
         public void sendTelephoneNumber(String TelephoneNumber) {
             this.tPhone.clear();
              this.tPhone.sendKeys(TelephoneNumber);           
          }
         public void submit() {
   	      this.submit.click();
   	      }
         public void acctsuccessMsg() {
        	 String expectedmsg = "Success";
             String actualmsg = acctsuccessMsg.getText();
             Assert.assertTrue(actualmsg.contains(expectedmsg));
      	      }
         
         //Password Change
         
         public void changePwd() {
         this.changePwd.click();
         }
         
         public void newPwwd(String newPwd) {
             this.newPwd.clear();
             this.newPwd.sendKeys(newPwd);
             }
         public void confirmPwwd(String confirmPwd) {
             this.confirmPwd.clear();
             this.confirmPwd.sendKeys(confirmPwd);
             }
         public void cnt() {
      	      this.cnt.click();
      	      }
         public void pwdSuccessMsg() {
        	 String expectedmsg = "Success";
             String actualmsg = pwdSuccessMsg.getText();
             Assert.assertTrue(actualmsg.contains(expectedmsg));
      	      }
         	 
         
         
         
       	 
       	 
       	 
         
       	 
         
         
	
	
	//@FindBy(id="login")
	//private WebElement userName;
	
	//@FindBy(id="password")
	//private WebElement password;
	
	
//	@FindBy(id="formLogin_submitAuth")
//	private WebElement loginBtn; 
//	
//		
//	public void sendUserName(String userName) {
//		this.userName.clear();
//		this.userName.sendKeys(userName);
//	}
//	
//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//       public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
	 

