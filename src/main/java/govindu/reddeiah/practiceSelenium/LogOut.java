package govindu.reddeiah.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	
	public LogOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="span.oxd-userdropdown-tab")
	WebElement preLogoutBtn;
	
	@FindBy(linkText="Logout")
	WebElement logoutBtn;
	
	
	public void Logout() throws InterruptedException {
		preLogoutBtn.click();
		Thread.sleep(1000);
		logoutBtn.click();
		System.out.println("Logged Out Successfully!!");
		System.out.println(" closing Tests!!");
	}
	
	

}
