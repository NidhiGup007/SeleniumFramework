package com.training.bean;

//public class LoginBean {
//	private String userName;
//	private String password;
//
//	public LoginBean() {
//	}
//
//	public LoginBean(String userName, String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Override
//	public String toString() {
//		return "LoginBean [userName=" + userName + ", password=" + password + "]";
//	}



public class LoginBean {
	private String categoryNamedataprovider;
	private String categoryDescdataprovider;
	private String categorymetaTagTitledataprovider;
	private String metaTagDescdataprovider;
	

	public LoginBean() {
	}

	public LoginBean(String categoryNamedataprovider, String categoryDescdataprovider, String categorymetaTagTitledataprovider, String metaTagDescdataprovider) {
		super();
		this.categoryNamedataprovider = categoryNamedataprovider;
		this.categoryDescdataprovider = categoryDescdataprovider;
		this.categorymetaTagTitledataprovider = categorymetaTagTitledataprovider;
		this.metaTagDescdataprovider = metaTagDescdataprovider;
	}

	public String getcategoryNamedataprovider() {
		return categoryNamedataprovider;
	}

	public void setcategoryNamedataprovider(String categoryNamedataprovider) {
		this.categoryNamedataprovider = categoryNamedataprovider;
	}

	public String getcategoryDescdataprovider() {
		return categoryDescdataprovider;
	}

	public void setcategoryDescdataprovider(String categoryDescdataprovider) {
		this.categoryDescdataprovider = categoryDescdataprovider;
	}

	public String getcategorymetaTagTitledataprovider() {
		return categorymetaTagTitledataprovider;
	}

	public void setcategorymetaTagTitledataprovider(String categorymetaTagTitledataprovider) {
		this.categorymetaTagTitledataprovider = categorymetaTagTitledataprovider;
	}

	public String getmetaTagDescdataprovider() {
		return metaTagDescdataprovider;
	}

	public void setmetaTagDescdataprovider(String metaTagDescdataprovider) {
		this.metaTagDescdataprovider = metaTagDescdataprovider;
	}
	@Override
	public String toString() {
		return "LoginBean [categoryNamedataprovider=" + categoryNamedataprovider + ", categoryDescdataprovider=" + categoryDescdataprovider + ", categorymetaTagTitledataprovider=" + categorymetaTagTitledataprovider + ", metaTagDescdataprovider=" + metaTagDescdataprovider + "]";
	}
}


