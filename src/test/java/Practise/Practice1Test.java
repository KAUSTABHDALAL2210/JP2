package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1Test {
	//WebDriver driver= null;
	@Test
	public void d1() {
		System.out.println("Hi");
		
		/*String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		driver.get(URL);*/
	}
	
}
