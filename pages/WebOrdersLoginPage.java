package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrdersLoginPage {

	public WebOrdersLoginPage(WebDriver driver) {

		// using the driver initialize or locate all elements in this class

		PageFactory.initElements(driver, this);

	}

	// Using @FindBy specify a way to locate the webelement

	@FindBy(id = "ctl00_MainContent_username")

	public WebElement userName;

	@FindBy(id = "ctl00_MainContent_password")

	public WebElement password;

	@FindBy(id = "ctl00_MainContent_login_button")

	public WebElement loginButton;

	@FindBy(id = "ctl00_MainContent_status")

	public WebElement invalidUserNameErrMsg;

	public void login(String usI, String usP) {
		userName.sendKeys(usI);
		password.sendKeys(usP);
		loginButton.click();
	}
}