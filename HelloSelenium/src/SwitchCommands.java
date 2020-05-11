import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch to window, frame, alert
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		
		driver.getWindowHandle();
		driver.getWindowHandles();
		String handle1 = null;
		driver.switchTo().window(handle1);	//windows
		driver.switchTo().frame(0); //frame
		driver.switchTo().alert(); //alert alert.dismiss(), .confirm(), .sendKeys(), .getText();
			
	}

}
