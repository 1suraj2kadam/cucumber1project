package StepDefinations;

import org.openqa.selenium.WebDriver;

import PageObjects.MainIconFunction;
import PageObjects.loginPage;
import utilities.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	public loginPage lg;
	public MainIconFunction mf;
	public ReadConfig readconfig;
	
	
// For used random Alphabets where you want like in Emails.
	/*public String generateEmailID() {
		return(RandomStringUtils.randomAlphabetic(5));
	}*/

}
