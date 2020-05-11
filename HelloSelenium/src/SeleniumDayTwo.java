import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		
		WebElement uname = driver.findElement(By.name("userName"));
		uname.sendKeys("mercury");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("mercury");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
			//WebElement 
		/*
		uname.clear();
		uname.getAttribute();
		uname.getClass();
		uname.getCssValue(arg0);
		uname.getLocation();
		uname.getScreenshotAs(arg0);
		uname.getSize();
		uname.getTagName();
		uname.getText();
		
		uname.submit();
		uname.click();
		*/
		
		
		
	}

}
