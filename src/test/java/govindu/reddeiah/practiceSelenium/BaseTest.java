package govindu.reddeiah.practiceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver ;
	
	@BeforeMethod
	public void setup() throws URISyntaxException, IOException {
		
		FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
		Properties p = new Properties();
		p.load(file);
		
		
		if(p.getProperty("execution_env").equalsIgnoreCase("Grid")) {
			

//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setPlatform(Platform.WINDOWS);
//			cap.setBrowserName("Chrome");
			
			ChromeOptions cap = new ChromeOptions();
			cap.setPlatformName("WINDOWS");
			driver = new RemoteWebDriver(new URI("http://10.52.59.77:4444/wd/hub").toURL(), cap);
			
		}
		
		else {
			
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tierDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
