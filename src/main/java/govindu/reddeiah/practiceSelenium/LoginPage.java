package govindu.reddeiah.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(css="input[name='username']")
	WebElement userName;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="button[type='submit")
	WebElement loginBtn;
	
	
	
	
	public void Login() {

		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
		System.out.println("Logged in successFully!!");
	}

}
