package com.framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By uName= By.id("user_email");
	By pwd=By.id("user_password");
	By loginButton = By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	
	public WebElement getUName() {
		return driver.findElement(uName);
	}
	
	public WebElement getPwd() {
		return driver.findElement(pwd);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
}
