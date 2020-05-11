import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares_JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		//Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.name("userName"));
		actions.keyDown(we,Keys.SHIFT).sendKeys("uday").keyUp(Keys.SHIFT);
		//Action interface
		Action action = actions.build();
		action.perform();
		/*
		 * actions.contextClick(we).perform(); //right click
		 * actions.doubleClick(we).perform(); //double click
		 */	}

}
