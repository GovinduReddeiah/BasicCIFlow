package govindu.reddeiah.practiceSelenium;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public WebDriver driver;
	
		
	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}


	public BaseClass launch() {
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return this;
	}

}
