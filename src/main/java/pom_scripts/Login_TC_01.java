package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_TC_01 extends BasePage {

	public Login_TC_01(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement UserNameTF;
	public void enterValueInTF(String UserName) {
		enter_value(UserNameTF, UserName);
	}
	
	@FindBy(xpath="//input[@type='password']")
	WebElement PswdTF;
	public void enterValueInPswdTF(String Pswd) {
		enter_value(PswdTF , Pswd);
	}

	@FindBy(xpath="//button[.='Login']")
	WebElement Login;
	public void clickAction() {
		clickAction(Login);
	}
	
}
