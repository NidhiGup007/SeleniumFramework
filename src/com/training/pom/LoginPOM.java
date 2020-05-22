package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class LoginPOM {
	private WebDriver driver;
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 //VerifyMultiplecategory (UNF_064):
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement categoryNamedataprovider;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']//p")
	private WebElement categoryDescdataprovider;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement categorymetaTagTitledataprovider;
	
	@FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement metaTagDescdataprovider;
	
	
	//VerifyAddProduct (UNF_065):
	
	@FindBy(xpath="//input[@id='input-username']")
  private WebElement adminCorrectUsername;
	
	@FindBy(xpath="//input[@id='input-password']")
  private WebElement adminCorrectPassword;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
  private WebElement adminSuccessLogin;
	
  @FindBy(xpath="//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='catalog']/a[1]")
  private WebElement navbar;
	
	@FindBy(xpath="//li[@id='catalog']//ul//li//a")
	private List<WebElement> verifyCatalogLinks;
	
	@FindBy(xpath="//li[@id='catalog']//ul//li//a[contains(text(),'Products')]")
	private WebElement products;
	
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	private WebElement productsAdd;
	
	@FindBy(xpath="//h3[@class='panel-title']")
	private WebElement getTitleAdd;	
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement productName;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement productmetaTagTitle;
	
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement dataTab;
	
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement modeltxtbox;
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement pricetxtbox;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantitytxtbox;
	
	@FindBy(xpath="//a[contains(text(),'Links')]")
	private WebElement linksTab;
	
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement categoriestxtbox;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Attribute')]")
	private WebElement attributeTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Option')]")
	private WebElement optionTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Recurring')]")
	private WebElement recurringTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Discount')]")
	private WebElement discountTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Special')]")
	private WebElement specialTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Discount')]")
	private WebElement imageTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement rewardpointsTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Design')]")
	private WebElement designTab;	
	
	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
	private WebElement save;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement success;
	
	@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement logout;
	
	 //VerifyCategoryinDB (UNF_066):
	
  	@FindBy(xpath="//li[@id='catalog']//ul//li//a[contains(text(),'Categories')]")
	private WebElement categories;
	
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	private WebElement categoriesAdd;
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement categoryName;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']//p")
	private WebElement categoryDesc;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement categorymetaTagTitle;
	
	@FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement metaTagDesc;
	
		
	 //VerifyMultiplecategory (UNF_064)
	
	   
    public void categoryNamedataprovider(String categoryNamedataprovider) {
        this.categoryNamedataprovider.clear();
        this.categoryNamedataprovider.sendKeys(categoryNamedataprovider);        
        }       

    public void categoryDescdataprovider(String categoryDescdataprovider) {
        this.categoryDescdataprovider.clear();
        this.categoryDescdataprovider.sendKeys(categoryDescdataprovider);       
        }
    
       public void categorymetaTagTitledataprovider(String categorymetaTagTitledataprovider) {
        this.categorymetaTagTitledataprovider.clear();
        this.categorymetaTagTitledataprovider.sendKeys(categorymetaTagTitledataprovider);        
        }  
    
         
    public void metaTagDescdataprovider(String metaTagDescdataprovider) {
        this.metaTagDescdataprovider.clear();
        this.metaTagDescdataprovider.sendKeys(metaTagDescdataprovider);        
        }
	
	//VerifyAddProduct (UNF_065):
	
	public void adminCorrectUsername(String adminCorrectUsername) {
	      //this.adminCorrectUsername.clear();
	      this.adminCorrectUsername.sendKeys(adminCorrectUsername);
	     String expectedmsg = "admin";
     String actualmsg = adminCorrectUsername;
     Assert.assertTrue(actualmsg.contains(expectedmsg));
     System.out.println(actualmsg);
	      
	 }
	
	public void adminCorrectPassword(String adminCorrectPassword) {
	      this.adminCorrectPassword.clear();
	      this.adminCorrectPassword.sendKeys(adminCorrectPassword);
	      String expectedmsg = "admin@123";
	         String actualmsg = adminCorrectPassword;
	         Assert.assertTrue(actualmsg.contains(expectedmsg));
	         System.out.println(actualmsg);
	 }
	
	public void adminSuccessLogin() {
	      this.adminSuccessLogin.click();
	 }
   
		                
            public void clicknavBar() {
                this.navbar.click();      
                }
                

          public void verifyCatalogLinks() {
          String expectedmsg1 = "Categories";
          String expectedmsg2 = "Products";
          String expectedmsg3 = "Recurring Profiles";
          String actualmsg1 = verifyCatalogLinks.get(0).getText();
          String actualmsg2 = verifyCatalogLinks.get(1).getText();
          String actualmsg3 = verifyCatalogLinks.get(2).getText();                 
          Assert.assertTrue(actualmsg1.contains(expectedmsg1));
          Assert.assertTrue((actualmsg2).contains(expectedmsg2));
          Assert.assertTrue((actualmsg3).contains(expectedmsg3));
          System.out.print(actualmsg1);
          System.out.print(actualmsg2);
          System.out.print(actualmsg3);                   
         
  }
                   
            public void products() {
                this.products.click();   
                }
            
            public void productsAdd() {
                this.productsAdd.click();     
                }
            
            public void getTitleAdd() {
             	 String expectedmsg = "Add Product";
                  String actualmsg = getTitleAdd.getText();
                  Assert.assertTrue(actualmsg.contains(expectedmsg));
                  System.out.println(actualmsg);
                  
          
           	      }
            
            public void productName(String productName) {
                this.productName.clear();
                this.productName.sendKeys(productName);
                String expectedmsg = "Blazer Girls(7-8)";
                String actualmsg = productName;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                }     
        
                     
            public void productmetaTagTitle(String productmetaTagTitle) {
                this.productmetaTagTitle.clear();
                this.productmetaTagTitle.sendKeys(productmetaTagTitle);
                String expectedmsg = "Blazer for Girls";
                String actualmsg = productmetaTagTitle;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                }            
                     
            public void clickdataTab() {
                this.dataTab.click();
                }
            
            public void modeltxtbox(String modeltxtbox) {
                this.modeltxtbox.clear();
                this.modeltxtbox.sendKeys(modeltxtbox);
                String expectedmsg = "BLG-112";
                String actualmsg = modeltxtbox;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                } 
            
            public void pricetxtbox(String pricetxtbox) {
                this.pricetxtbox.clear();
                this.pricetxtbox.sendKeys(pricetxtbox);
                String expectedmsg = "3000";
                String actualmsg = pricetxtbox;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                }
            
            public void quantitytxtbox(String quantitytxtbox) {
                this.quantitytxtbox.clear();
                this.quantitytxtbox.sendKeys(quantitytxtbox);
                String expectedmsg = "100";
                String actualmsg = quantitytxtbox;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                }
            
            public void linksTab() {
                this.linksTab.click();
                }
            
            public void categoriestxtbox(String categoriestxtbox) {
                this.categoriestxtbox.clear();
                this.categoriestxtbox.sendKeys(categoriestxtbox);
                String expectedmsg = "School Uniforms";
                String actualmsg = categoriestxtbox;
                Assert.assertTrue(actualmsg.contains(expectedmsg));
                System.out.println(actualmsg);
                }
            
            public void attributeTab() {
                this.attributeTab.click();
                }
            public void optionTab() {
                this.optionTab.click();
                }
            public void recurringTab() {
                this.recurringTab.click();
                }
            public void discountTab() {
                this.discountTab.click();
                }
            public void specialTab() {
                this.specialTab.click();
                }
            public void imageTab() {
                this.imageTab.click();
                }
            public void rewardpointsTab() {
                this.rewardpointsTab.click();
                }
            
            public void designTab() {
                this.designTab.click();
                }           
            
            public void clicksave() {
                this.save.click();
                }
            
            public void success() {
            	 String expectedmsg = "Success";
                 String actualmsg = success.getText();
                 Assert.assertTrue(actualmsg.contains(expectedmsg));
                 System.out.println(actualmsg);                           
          	      }
            public void logout() {
                this.logout.click();
                }
            
            //VerifyCategoryinDB (UNF_066):
            
            
            public void categories() {
              this.categories.click();   
              }
          
          public void categoriesAdd() {
              this.categoriesAdd.click();     
              }         
             
          public void categoryName(String categoryName) {
              this.categoryName.clear();
              this.categoryName.sendKeys(categoryName);
              String expectedmsg = "Sports";
              String actualmsg = categoryName;
              Assert.assertTrue(actualmsg.contains(expectedmsg));
              System.out.println(actualmsg);
              }       
      
          public void categoryDesc(String categoryDesc) {
              this.categoryDesc.clear();
              this.categoryDesc.sendKeys(categoryDesc);
              String expectedmsg = "Sports shoes";
              String actualmsg = categoryDesc;
              Assert.assertTrue(actualmsg.contains(expectedmsg));
              System.out.println(actualmsg);
              }
          
             public void categorymetaTagTitle(String categorymetaTagTitle) {
              this.categorymetaTagTitle.clear();
              this.categorymetaTagTitle.sendKeys(categorymetaTagTitle);
              String expectedmsg = "shoes";
              String actualmsg = categorymetaTagTitle;
              Assert.assertTrue(actualmsg.contains(expectedmsg));
              System.out.println(actualmsg);
              }  
          
               
          public void metaTagDesc(String metaTagDesc) {
              this.metaTagDesc.clear();
              this.metaTagDesc.sendKeys(metaTagDesc);
              String expectedmsg = "Sports shoes";
              String actualmsg = metaTagDesc;
              Assert.assertTrue(actualmsg.contains(expectedmsg));
              System.out.println(actualmsg);
              }
          
          
	 //VerifyReturnedOrderedProductAllowed (UNF_036):
	
//	@FindBy(xpath="//i[@class='fa fa-user']")
//	private WebElement loginoption;
//	
//	
//	@FindBy(xpath="//a[contains(text(),'Login')]")
//	private WebElement login;
//	
//	@FindBy(xpath="//input[@id='input-email']")
//	private WebElement userName;
//	
//	@FindBy(xpath="//input[@id='input-password']")
//		private WebElement password;
//	
//	@FindBy(xpath="//input[@class='btn btn-primary']")
//	private WebElement submit;
//	
//	@FindBy(xpath="//li[@class='dropdown myaccount']")
//	private WebElement userIconDropDwn;
//	
//	@FindBy(xpath="//a[contains(text(),'My Account')]")
//	private WebElement dropdownMyAccount;
//	
//	@FindBy(xpath="//a[contains(text(),'Order History')]")
//	private WebElement dropdownOrderHistory;
//	
//	@FindBy(xpath="//a[contains(text(),'Transactions')]")
//	private WebElement dropTransactions;
//	
//	@FindBy(xpath="//a[contains(text(),'Downloads')]")
//	private WebElement dropDownloads;
//	
//	@FindBy(xpath="//a[contains(text(),'Logout')]")
//	private WebElement dropLogout;
//	
//	
//	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right myaccount-menu']//a[contains(text(),'Order History')]")
//	private WebElement orderHistory;	
//	
//	@FindBy(xpath="//table[@class='table table-bordered table-hover']")
//	private List<WebElement> webTable;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[1]")
//    private WebElement webTableOrderId;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[2]")
//    private WebElement webTableCustomer;
//
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[3]")
//    private WebElement webTableNoofProducts;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[4]")
//    private WebElement webTableStatus;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[5]")
//    private WebElement webTableTotal;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[6]")
//    private WebElement webTableDateAdded;
//	
//
//	@FindBy(xpath="//i[@class='fa fa-eye']")
//	private WebElement viewIcon;
//
//	@FindBy(xpath="//tr[1]//td[6]//a[2]//i[1]")
//	private WebElement returnIcon;
//	
//	@FindBy(xpath="//div[@class='form-group required']//div[3]//label[1]")
//	private WebElement returnReason;
//	
//	@FindBy(xpath="//body[@class='account-return-add-186 layout-2 right-col']/div[@class='container']/div[@class='row']/div[@id='content']/form[@class='form-horizontal']/fieldset/div[@class='form-group required']/div[@class='col-sm-10']/label[1]")
//	private WebElement radioYes;
//	
//	@FindBy(xpath="//textarea[@id='input-comment']")
//	private WebElement returnReasonDesc;
//	
//	@FindBy(xpath="//input[@name='agree']")
//	private WebElement agreePolicy;
//	
//	@FindBy(xpath="//input[@class='btn btn-primary']")
//	private WebElement submitReturn;
	
	 //VerifyAdminLoginDenial (UNF_037):
	
//	@FindBy(xpath="//input[@id='input-username']")
//    private WebElement adminUsername;
//	
//	@FindBy(xpath="//input[@id='input-password']")
//    private WebElement adminPassword;
//	
//	@FindBy(xpath="//button[@class='btn btn-primary']")
//    private WebElement adminLogin;
//	
//	@FindBy(xpath="//div[@class='alert alert-danger']")
//    private WebElement adminLoginFailed;
//	
//	 //VerifyAdminallowstoaddcategory (UNF_038)
            
//	@FindBy(xpath="//input[@id='input-username']")
//    private WebElement adminCorrectUsername;
//	
//	@FindBy(xpath="//input[@id='input-password']")
//    private WebElement adminCorrectPassword;
//	
//	@FindBy(xpath="//button[@class='btn btn-primary']")
//    private WebElement adminSuccessLogin;
//	
//    @FindBy(xpath="//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='catalog']/a[1]")
//    private WebElement navbar;
//	
//	@FindBy(xpath="//li[@id='catalog']//ul//li//a")
//	private List<WebElement> verifyCatalogLinks;
//	
//	@FindBy(xpath="//li[@id='catalog']//ul//li//a[contains(text(),'Categories')]")
//	private WebElement categories;
//	
//	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
//	private WebElement categoriesAdd;
//	
//	@FindBy(xpath="//h3[@class='panel-title']")
//	private WebElement getTitleAdd;	
//	
//	@FindBy(xpath="//input[@id='input-name1']")
//	private WebElement categoryName;
//	
//	@FindBy(xpath="//div[@class='note-editable panel-body']//p")
//	private WebElement categoryDesc;
//	
//	@FindBy(xpath="//input[@id='input-meta-title1']")
//	private WebElement metaTagTitle;
//	
//	@FindBy(xpath="//textarea[@id='input-meta-description1']")
//	private WebElement metaTagDesc;
//	
//	@FindBy(xpath="//a[contains(text(),'Data')]")
//	private WebElement dataTab;
//	
//	@FindBy(xpath="//input[@id='input-parent']")
//	private WebElement dataTabParent;
//	
//	@FindBy(xpath="//input[@id='input-filter']")
//	private WebElement dataTabFilters;
//	
//	@FindBy(xpath="//input[@id='input-keyword']")
//	private WebElement dataTabSEOURL;
//	
//	@FindBy(xpath="//input[@id='input-column']")
//	private WebElement dataTabColumns;
//	
//	@FindBy(xpath="//input[@id='input-sort-order']")
//	private WebElement dataTabSortOrder;
//	
//	@FindBy(xpath="//a[contains(text(),'Design')]")
//	private WebElement designTab;
//	
//	@FindBy(xpath="//option[contains(text(),'Default')]")
//	private WebElement defaultLayout;
//	
//	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
//	private WebElement save;
//	
//	@FindBy(xpath="//div[@class='alert alert-success']")
//	private WebElement modifySuccess;
	
	//VerifyAdminEditMetaTag (UNF_039):
//	
//	@FindBy(xpath="//span[contains(text(),'Catalog')]")
//	private List<WebElement> catalogLinks;
	
//	@FindBy(xpath="//ul[@class='collapse in']//a[contains(text(),'Categories')]")
//	private WebElement categories1;
//	
//	@FindBy(xpath="//tr[1]//td[4]//a[1]//i[1]")
//	private WebElement editCategory;
//	
//	//VerifyAdminDeleteMultipleCategory (UNF_040):
//	
//	@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody//tr[1]//td[1]//input[1]")
//	private WebElement selectCategoryName;
//	
//    @FindBy(xpath="//i[@class='fa fa-trash-o']")
//    private WebElement deleteCategory;
//    
//    @FindBy(xpath="/div[@class='alert alert-success']")
//    private WebElement deleteSuccessMsg;
	
	
	//VerifyReturnedOrderedProductAllowed (UNF_036):
	
//	public void selectLogin() {
//	      this.loginoption.click();
//	 }
//		 	
//	 public void clickLogin() {
//    this.login.click();
//  }
//	 
//    public void sendEmailId(String EmailId) {
//       this.userName.clear();
//        this.userName.sendKeys(EmailId);
//    }    
//          
//       public void sendPassword(String password) {
//        this.password.sendKeys(password); 
//        
//       }
//       
//       public void clickLoginBtn() {
//       this.submit.click();         
//       }
//       
//       public void clickUserIconDropDwn() {
//           this.userIconDropDwn.click();       
//           }
//        
//       
//       public void dropdownMyAccount() {
//           String expText = "My Account";
//           String actText = dropdownMyAccount.getText();
//           Assert.assertTrue(actText.contains(expText));    
//           System.out.print(actText+" , ");
//       }
//             	   
//                 
//    	         
//        public void clickOrderHistory() {
//         this.orderHistory.click();  
//         }
//     
//     public void webTable() {
//    	 int noofRows = webTable.size();
//         System.out.println("Number of record Displayed are :" +noofRows);  
//         } 
//     
//     
//     public void webTableOrderId1() {
//         String expText = "Order ID";
//         String actText = webTableOrderId.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//     
//     public void webTableCustomer() {
//         String expText = "Customer";
//         String actText = webTableCustomer.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//     
//     public void webTableNoofproducts() {
//         String expText = "No. of Products";
//         String actText = webTableNoofProducts.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//     
//     public void webTableTotal() {
//         String expText = "Total";
//         String actText = webTableTotal.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//     
//     public void webTableDateAdded() {
//         String expText = "Date Added";
//         String actText = webTableDateAdded.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//     
//     
//     public void webTableStatus() {
//         String expText = "Status";
//         String actText = webTableStatus.getText();
//         Assert.assertTrue(actText.contains(expText));    
//         System.out.print(actText+" , ");
//     }
//
//      
//     public void clickViewIcon() {
//         this.viewIcon.click();             
//     }
//     
//     public void clickReturn() {
//         this.returnIcon.click();
//         
//     }
//     public void clickReturnReason() {
//    	 this.returnReason.click();
//     }    
//     
//     public void clickRadioYes() {
//    	 this.radioYes.click();       
//     }
//     
//     public void sendreturnReasonDesc(String returnReasonDesc) {
//         this.returnReasonDesc.clear();
//         this.returnReasonDesc.sendKeys(returnReasonDesc);
//         
//        }
//     
//     public void returnReasonDesc() {
//    	 returnReasonDesc.sendKeys("Incorrect Item");
//     	 String actualmsg = returnReasonDesc.getText();
//          String expectedmsg = "Incorrect Item";
//          Assert.assertTrue(actualmsg.contains(expectedmsg));
//   	      }
     
//     public void clickAgreePolicy() {
//         this.agreePolicy.click();
//         
//        }
//     
//     public void clickSubmitReturn() {
//         this.submitReturn.click();
//         
//        }
        
     //VerifyAdminLoginDenial (UNF_037):
//	 	public void adminUsername(String adminUsername) {
// 	      this.adminUsername.clear();
// 	      this.adminUsername.sendKeys(adminUsername);
// 	     String expectedmsg = "Nha";
//         String actualmsg = adminUsername;
//         Assert.assertTrue(actualmsg.contains(expectedmsg));
//         System.out.println(actualmsg);
// 	      
// 	 }
// 	
// 	public void adminPassword(String adminPassword) {
//	      this.adminPassword.clear();
//	      this.adminPassword.sendKeys(adminPassword);
//	      String expectedmsg = "neha2345";
//	         String actualmsg = adminPassword;
//	         Assert.assertTrue(actualmsg.contains(expectedmsg));
//	         System.out.println(actualmsg);
//	 }
// 	
// 	public void adminLogin() {
//	      this.adminLogin.click();
//	 }
//          
// 	public void adminLoginFailed() {
//     	 String expectedmsg = "No match";
//          String actualmsg = adminLoginFailed.getText();
//          Assert.assertTrue(actualmsg.contains(expectedmsg));
//          System.out.println(actualmsg);                           
//   	      }
//      
                   
          
        //VerifyAdminallowstoaddcategory (UNF_038):
// 	public void adminCorrectUsername(String adminCorrectUsername) {
//	      this.adminCorrectUsername.clear();
//	      this.adminCorrectUsername.sendKeys(adminCorrectUsername);
//	     String expectedmsg = "admin";
//       String actualmsg = adminCorrectUsername;
//       Assert.assertTrue(actualmsg.contains(expectedmsg));
//       System.out.println(actualmsg);
//	      
//	 }
//	
//	public void adminCorrectPassword(String adminCorrectPassword) {
//	      this.adminCorrectPassword.clear();
//	      this.adminCorrectPassword.sendKeys(adminCorrectPassword);
//	      String expectedmsg = "admin@123";
//	         String actualmsg = adminCorrectPassword;
//	         Assert.assertTrue(actualmsg.contains(expectedmsg));
//	         System.out.println(actualmsg);
//	 }
//	
//	public void adminSuccessLogin() {
//	      this.adminSuccessLogin.click();
//	 }
//     
// 		                
//              public void clicknavBar() {
//                  this.navbar.click();      
//                  }
//                  
//
//            public void verifyCatalogLinks() {
//            String expectedmsg1 = "Categories";
//            String expectedmsg2 = "Products";
//            String expectedmsg3 = "Recurring Profiles";
//            String actualmsg1 = verifyCatalogLinks.get(0).getText();
//            String actualmsg2 = verifyCatalogLinks.get(1).getText();
//            String actualmsg3 = verifyCatalogLinks.get(2).getText();                 
//            Assert.assertTrue(actualmsg1.contains(expectedmsg1));
//            Assert.assertTrue((actualmsg2).contains(expectedmsg2));
//            Assert.assertTrue((actualmsg3).contains(expectedmsg3));
//            System.out.print(actualmsg1);
//            System.out.print(actualmsg2);
//            System.out.print(actualmsg3);                   
//           
//    }
//                     
//              public void categories() {
//                  this.categories.click();   
//                  }
//              
//              public void categoriesAdd() {
//                  this.categoriesAdd.click();     
//                  }
//              public void getTitleAdd() {
//               	 String expectedmsg = "Add Category";
//                    String actualmsg = getTitleAdd.getText();
//                    Assert.assertTrue(actualmsg.contains(expectedmsg));
//                    System.out.println(actualmsg);
//                    
//            
//             	      }
//              
//              public void categoryName(String categoryName) {
//                  this.categoryName.clear();
//                  this.categoryName.sendKeys(categoryName);
//                  String expectedmsg = "Blazers(3-5)";
//                  String actualmsg = categoryName;
//                  Assert.assertTrue(actualmsg.contains(expectedmsg));
//                  System.out.println(actualmsg);
//                  }       
//          
//              public void categoryDesc(String categoryDesc) {
//                  this.categoryDesc.clear();
//                  this.categoryDesc.sendKeys(categoryDesc);
//                  String expectedmsg = "Blazers for students";
//                  String actualmsg = categoryDesc;
//                  Assert.assertTrue(actualmsg.contains(expectedmsg));
//                  System.out.println(actualmsg);
//                  }
//              
//              public void metaTagTitle(String metaTagTitle) {
//                  this.metaTagTitle.clear();
//                  this.metaTagTitle.sendKeys(metaTagTitle);
//                  String expectedmsg = "BLZ 03";
//                  String actualmsg = metaTagTitle;
//                  Assert.assertTrue(actualmsg.contains(expectedmsg));
//                  System.out.println(actualmsg);
//                  }
//              
//              public void metaTagDesc(String metaTagDesc) {
//                  this.metaTagDesc.clear();
//                  this.metaTagDesc.sendKeys(metaTagDesc);
//                  String expectedmsg = "Blazers for primary class students";
//                  String actualmsg = metaTagDesc;
//                  Assert.assertTrue(actualmsg.contains(expectedmsg));
//                  System.out.println(actualmsg);
//                  }
//              
//              public void clickdataTab() {
//                  this.dataTab.click();
//                  }
//              
//              public void dataTabParent(String parent) {
//                  this.dataTabParent.clear();
//                  this.dataTabParent.sendKeys(parent);
//                  }
//              
//              public void dataTabFilters(String filters) {
//                  this.dataTabFilters.clear();
//                  this.dataTabFilters.sendKeys(filters);
//                  }
//              
//              public void dataTabSEOURL(String seoURL) {
//                  this.dataTabSEOURL.clear();
//                  this.dataTabSEOURL.sendKeys(seoURL);
//                  }
//              
//              public void dataTabColumns(String columns) {
//                  this.dataTabColumns.clear();
//                  this.dataTabColumns.sendKeys(columns);
//                  }
//              
//              public void dataTabSortOrder(String sortOrder) {
//                  this.dataTabSortOrder.clear();
//                  this.dataTabSortOrder.sendKeys(sortOrder);
//                  }
//              
//              public void clickdesignTab() {
//                  this.designTab.click();
//                  }
//    
//              
//              public  void adminViaDropDownByName() {
//            	    By byCss = By.cssSelector("div.container-fluid:nth-child(2) div.panel.panel-default div.panel-body form.form-horizontal div.tab-content div.tab-pane.active:nth-child(3) div.table-responsive table.table.table-bordered.table-hover tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) select.form-control > option:nth-child(8)");
//            	    driver.findElement(byCss).click();    
//            	    }
//              public void clicksave() {
//                  this.save.click();
//                  }
//              
//              public void modifySuccess() {
//              	 String expectedmsg = "Success";
//                   String actualmsg = modifySuccess.getText();
//                   Assert.assertTrue(actualmsg.contains(expectedmsg));
//                   System.out.println(actualmsg);                           
//            	      }
//               
            //VerifyAdminEditMetaTag (UNF_039):
              
//              public void clickCatalog() {
//                  this.catalog.click();  
//                  }
//              
//              public void clickcategories() {
//                  this.categories.click();   
//                  }
//              
//                            
//              public void editCategory() {
//                  this.editCategory.click();
//                  }
//              
// 
//            //VerifyAdminDeleteMultipleCategory (UNF_040): 
//              public void selectCategoryName() {
//            	  this.selectCategoryName.click();
//                  }
//              
//              public void deleteCategory() {
//                  this.deleteCategory.click();
//                  }
//              
//                                
//              public void deleteSuccessMsg() {
//             	 String expectedmsg = "Success";
//                  String actualmsg = deleteSuccessMsg.getText();
//                  Assert.assertTrue(actualmsg.contains(expectedmsg));
//           	      }  
//              
//                  
//	 
//}


	
	
	
//	xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	
//	@FindBy(xpath="//i[@class='fa fa-user']")
//	private WebElement loginoption;
//	
//	
//	@FindBy(xpath="//a[contains(text(),'Login')]")
//	private WebElement login;
//	
//	@FindBy(xpath="//input[@id='input-email']")
//	private WebElement userName;
//	
//	@FindBy(xpath="//input[@id='input-password']")
//		private WebElement password;
//	
//	@FindBy(xpath="//input[@class='btn btn-primary']")
//	private WebElement submit;
//	
//	@FindBy(xpath="//div[@class='alert alert-success']")
//	private WebElement success;
//	
//	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Order History')]")
//	private WebElement orderHistory;
//	
//	@FindBy(xpath="//table[@class='table table-bordered table-hover']")
//	private List<WebElement> webTable;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[1]")
//    private WebElement webTableOrderId;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[2]")
//    private WebElement webTableCustomer;
//
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[3]")
//    private WebElement webTableNoofProducts;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[4]")
//    private WebElement webTableStatus;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[5]")
//    private WebElement webTableTotal;
//	
//	@FindBy(xpath = "//table[@class='table table-bordered table-hover']/thead/tr/td[6]")
//    private WebElement webTableDateAdded;
//	
//	@FindBy(xpath="//i[@class='fa fa-eye']")
//	private WebElement viewIcon ;
//	
//	//validateModifyPersonalDetails
//	
//	@FindBy(xpath="//a[contains(text(),'Edit Account')]")
//	private WebElement editAccountInfo;
//	
//	@FindBy(xpath="//input[@id='input-firstname']")
//	private WebElement fName;
//	
//	@FindBy(xpath="//input[@id='input-lastname']")
//	private WebElement lName;
//	
//	@FindBy(xpath="//input[@id='input-email']")
//	private WebElement emailID;
//	
//	@FindBy(xpath="//input[@id='input-telephone']")
//	private WebElement tPhone;
//	
//	@FindBy(xpath="//input[@class='btn btn-primary']")
//	private WebElement sub;

//	@FindBy(xpath="//div[@class='alert alert-success']")
//	private WebElement acctsuccessMsg;
	
//	//Password Change
//	@FindBy(xpath="//a[contains(text(),'Change your password')]")
//	private WebElement changePwd;
//	
//	@FindBy(xpath="//input[@id='input-password']")
//	private WebElement newPwd;
//	
//	@FindBy(xpath="//input[@id='input-confirm']")
//	private WebElement confirmPwd;
//	
//	@FindBy(xpath="//input[@class='btn btn-primary']")
//	private WebElement cnt;
//	
//	@FindBy(xpath="//div[@class='alert alert-success']")
//	private WebElement pwdSuccessMsg;
//	
//	
//	
//	
//	public void selectLogin() {
//	      this.loginoption.click();
//	 }
//		 	
//	 public void clickLogin() {
//      this.login.click();
//    }
//	 
//      public void sendEmailId(String EmailId) {
//         this.userName.clear();
//          this.userName.sendKeys(EmailId);
//      }    
//            
//         public void sendPassword(String password) {
//          this.password.clear(); 
//          this.password.sendKeys(password); 
//          
//         }
//         
//         public void clickLoginBtn() {
//         this.submit.click();         
//         }
//         
//         //Order Details Page
//         public void clickOrderHistory() {
//             this.orderHistory.click();  
//             }
//         
//         public void webTable() {
//        	 int noofRows = webTable.size();
//             System.out.println("Number of record Displayed are :" +noofRows);  
//             } 
//         
//         
//         public void webTableOrderId1() {
//             String expText = "Order ID";
//             String actText = webTableOrderId.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//         
//         public void webTableCustomer() {
//             String expText = "Customer";
//             String actText = webTableCustomer.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//         
//         public void webTableNoofproducts() {
//             String expText = "No. of Products";
//             String actText = webTableNoofProducts.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//         
//         public void webTableTotal() {
//             String expText = "Total";
//             String actText = webTableTotal.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//         
//         public void webTableDateAdded() {
//             String expText = "Date Added";
//             String actText = webTableDateAdded.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//         
//         
//         public void webTableStatus() {
//             String expText = "Status";
//             String actText = webTableStatus.getText();
//             Assert.assertTrue(actText.contains(expText));    
//             System.out.print(actText+" , ");
//         }
//
//          
//         public void clickViewIcon() {
//             this.viewIcon.click();             
//         }
//    	 
//    	  //validateModifyPersonalDetails
//         
//             public void editAccountInfo() {
//            	 this.editAccountInfo.click();      	 
//            }
//         public void sendFirstName(String firstName) {
//             this.fName.clear();
//              this.fName.sendKeys(firstName);
//          }
//         public void sendLastName(String lastName) {
//             this.lName.clear();
//              this.lName.sendKeys(lastName);         
//          }
//         public void sendEmailID(String emailID) {
//             this.emailID.clear();
//              this.emailID.sendKeys(emailID);
//          }
//         public void sendTelephoneNumber(String TelephoneNumber) {
//             this.tPhone.clear();
//              this.tPhone.sendKeys(TelephoneNumber);           
//          }
//         public void submit() {
//   	      this.submit.click();
//   	      }
//         public void acctsuccessMsg() {
//        	 String expectedmsg = "Success";
//             String actualmsg = acctsuccessMsg.getText();
//             Assert.assertTrue(actualmsg.contains(expectedmsg));
//      	      }
//         
//         //Password Change
//         
//         public void changePwd() {
//         this.changePwd.click();
//         }
//         
//         public void newPwwd(String newPwd) {
//             this.newPwd.clear();
//             this.newPwd.sendKeys(newPwd);
//             }
//         public void confirmPwwd(String confirmPwd) {
//             this.confirmPwd.clear();
//             this.confirmPwd.sendKeys(confirmPwd);
//             }
//         public void cnt() {
//      	      this.cnt.click();
//      	      }
//         public void pwdSuccessMsg() {
//        	 String expectedmsg = "Success";
//             String actualmsg = pwdSuccessMsg.getText();
//             Assert.assertTrue(actualmsg.contains(expectedmsg));
//      	      }
//         	 
         
//        xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx    
         
         
         
         
       	 
       	 
       	 
         
       	 
         
         
	
	
	@FindBy(id="login")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
       public void clickLoginBtn() {
		this.loginBtn.click(); 
	
      
       }
       
}

	 

