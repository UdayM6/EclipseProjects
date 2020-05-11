package com.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public WebDriver driver;
	public Properties prop;

	public WebDriver invokeBrowser() throws IOException {
		prop=new Properties();
		FileInputStream propFile = new FileInputStream("E:\\EclipseProjects\\FrameworkDemo\\src\\main\\java\\com\\framework\\resources\\data.properties");
		prop.load(propFile);
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
