package com.framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pageObjects.LandingPage;
import com.framework.pageObjects.LoginPage;

public class HomePage extends InvokeBrowser{

	public static Logger log= LogManager.getLogger(InvokeBrowser.class.getName());
	@Test(dataProvider="getData")
	public void basePageNavigation(String uname, String pwd, String usrType) throws IOException {
		
		driver=invokeBrowser();
		log.info("Chrome driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("url opened");
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getLogin().click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUName().sendKeys(uname);
		loginPage.getPwd().sendKeys(pwd);
		System.out.println("***"+usrType);
		loginPage.getLoginButton().click();
	}
	
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[2][3];
		//0th row
		data[0][0]="abc@a.com";
		data[0][1]="pwsd1";
		data[0][2]="restricted user";
		//1st row
		data[1][0]="xyz@a.com";
		data[1][1]="pwsd1";
		data[1][2]="nonrestricted user";
		
		return data;
		
	}
}
