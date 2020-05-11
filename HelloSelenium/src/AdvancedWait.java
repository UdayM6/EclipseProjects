import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class AdvancedWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Softwares_JARs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//Advanced Fluent Wait using Function until
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.pollingEvery(250,TimeUnit.MILLISECONDS);
		fwait.withTimeout(3,TimeUnit.SECONDS);
		
		//Defining function 
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>(){
			public Boolean apply(WebDriver arg0) {
				WebElement element = arg0.findElement(By.id("colorVar"));
				String color = element.getAttribute("style");
				System.out.println("the color of the button is "+color);
				if(color.equals("color: red;")) {
					return true;
				}
				return false;
			}
		};
		fwait.until(function);
	}

}
