package testngFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGGrouping {
  @Test(groups = {"group"})
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  /* <<dependsOnMethods usage>>
    @Test(dependsonMethods={"beforeMethod"})
  	public void f() {
	  	driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
  }
	@Test
	public void beforeMethod() {
	 	System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
  }

	@Test (dependsonMethods={"f"})
	public void afterMethod() {
	  	driver.quit();
  }
   * 
   * 
   */

}
