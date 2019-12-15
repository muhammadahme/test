package ups.pack.login.PageActions;

import org.openqa.selenium.WebDriver;

import ups.pack.login.pageElements.LoginPageElements;
import ups.pack.login.pageElements.ShippingPageElements;

public class ShippingPageActions {
	
	ShippingPageElements shippingPageElement;

	public ShippingPageActions(WebDriver driver) {
		this.shippingPageElement = new ShippingPageElements(driver);
	}

	public void shippingLink() {
		shippingPageElement.shippingLink().click();
	}
	
	public void hisLink() {
		shippingPageElement.hisLink().click();
	}
	
	public void inputUserId() {
		shippingPageElement.userID().sendKeys("ahmed");
	}

	public void inputPassword() {
		shippingPageElement.password().sendKeys("me123");
	}

	public void login() {
		shippingPageElement.loginButton().click();
	}

	public String readErrorText() {
		String errorText = shippingPageElement.errorText().getText();
		return errorText;
	}

}
