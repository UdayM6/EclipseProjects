import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWebElements {

	public static void main(String[] args) throws InterruptedException {
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
		System.out.println("Login successful");
		
		//flights
		
		boolean b = driver.findElement(By.xpath("//input[1]")).isSelected();
		if(b) {
			System.out.println("Round trip selected by default");
		}
		//select one way radio button
		driver.findElement(By.xpath("//input[2]")).click();
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select portFrom = new Select(fromPort);
		List<WebElement> cities = portFrom.getOptions();
		System.out.println("total cities: "+cities.size()+" PFB list");
		
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i).getText());
		}
		portFrom.selectByValue("Zurich");
		System.out.println("from port Zurich selected");
		
	}

}
