package govindu.reddeiah.practiceSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest{
	
	@Test
	public void BasicE2ETest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.launch();
		LogOut logout = login.Login();
		logout.Logout();
		
	}
	

	@Test
	public void GoogleTest() {
		
		driver.manage().window().maximize();
		driver.get("chrome://newtab");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement input =  (WebElement) js.executeScript(" return document.querySelector('ntp-app').shadowRoot.querySelector('#searchbox')"+
	    ".shadowRoot.querySelector('#inputWrapper')"+
	    ".querySelector('#inputInnerContainer')"+
	    ".querySelector('#input');");
	   input.sendKeys("Hello");
	   
	   System.out.println("Succesfully interacted Shadowed DOM!!");
	}
	
	


}
