package govindu.reddeiah.practiceSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest{
	
	@Test(groups = {"Regression"})
	public void BasicE2ETest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.launch();
		LogOut logout = login.Login();
		logout.Logout();
		
	}
	
	
	@Test(groups = {"Sanity"})
	public void GoogleTest() {
		System.out.println("just entering into Sanity Block");
		driver.get("chrome://newtab");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement input =  (WebElement) js.executeScript(" return document.querySelector('ntp-app').shadowRoot.querySelector('#searchbox')"+
	    ".shadowRoot.querySelector('#inputWrapper')"+
	    ".querySelector('#inputInnerContainer')"+
	    ".querySelector('#input');");
	   input.sendKeys("Hello");
	   
	   System.out.println("Succesfully interacted Shadowed DOM!!");
	}
	
	@Test(groups = {"Sanity"})
	public void justTest() {
		System.out.println("SanityTest");
	}
	
	


}
