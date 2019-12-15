package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPageElements {
	
	WebDriver driver;

	public ShippingPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement shippingLink() {
		WebElement shippingLink = driver.findElement(By.xpath("//a[@id='ups-menuLinks1']"));
		return shippingLink;
	}

	public WebElement hisLink() {
		WebElement hisLink = driver.findElement(By.xpath("//a[contains(text(),'View Shipping History')]"));
		return hisLink;
	}

	
	
	
	public WebElement userID() {
		WebElement userID = driver.findElement(By.xpath("//input[@id='email']"));
		return userID;
	}

	public WebElement password() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pwd']"));
		return password;
	}

	public WebElement loginButton() {
		WebElement loginButton = driver.findElement(By.id("submitBtn"));
		return loginButton;
	}

	public WebElement errorText() {
		WebElement errorMsg = driver.findElement(By.xpath("//ul[@class='ups-icons-error']"));
		return errorMsg;

	}

}
