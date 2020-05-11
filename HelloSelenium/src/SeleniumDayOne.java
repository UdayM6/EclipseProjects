import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		System.out.println(">>>Mercury Tours site opened<<<");
		// all driver 
		
		driver.manage().window().maximize();
		System.out.println("Website Title: "+driver.getTitle());
		System.out.println("Website Title: "+driver.getCurrentUrl());

			//Navigation 
		driver.navigate().to("http://www.toolsqa.com"); //same like driver.get();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
 			//Navigation end		
		
		driver.close();
		driver.quit();
		
		//driver end
	}

}