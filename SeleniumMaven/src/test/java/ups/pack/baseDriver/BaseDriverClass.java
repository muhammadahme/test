package ups.pack.baseDriver;

import org.openqa.selenium.WebDriver;
// i am on ups webside , i click on shipping,on shipping  page click on view shipping history, that page i enter invalid emailid and 
//invalid password then i see the message :Please correct the following errors:
//Email or User ID fieldis required
//Password fieldis required

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriverClass {

	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
 