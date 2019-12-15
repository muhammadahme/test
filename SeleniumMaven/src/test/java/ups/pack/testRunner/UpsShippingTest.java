package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.ShippingPageActions;

public class UpsShippingTest extends BaseDriverClass{
	WebDriver driver = getChromeDriver();
	ShippingPageActions shippAction = new ShippingPageActions(driver);

	@BeforeTest
	public void beforeMethod() {
		driver.get(
				"https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fship%2Fhistory%3Ftx%3D2968600659710338");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void shippingTest() throws InterruptedException {
		shippAction.shippingLink();
		shippAction.hisLink();
		shippAction.inputUserId();
		shippAction.inputPassword();
		shippAction.login();;

		String msg = shippAction.readErrorText();
		System.out.println();
		System.out.println(msg);

		if (msg.contains("The information that you have entered does not match any ups.com profile.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			fail();
		}
		Thread.sleep(12000);

	}
	
   
	@AfterTest
	
	public void afterTest() {
		driver.close();
	}


}
