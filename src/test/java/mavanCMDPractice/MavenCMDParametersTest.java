package mavanCMDPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenCMDParametersTest {
	
	@Test
	public void vtigerLoginTest() {
		
		String browser=System.getProperty("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver();
	
		}
		driver.manage().Window.maximize();
		String url=System.getProperty("url");
		driver.get(url);
		driver.manage().time
		
	}

}
