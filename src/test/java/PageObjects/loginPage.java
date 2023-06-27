package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath="//input[@id='pass']")
	WebElement password;

	@FindBy(xpath="//button[@name='login']")
	WebElement Login;

	@FindBy(xpath="(//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg'])[1]")
	WebElement ProfileAccount;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement logout;
	
	public void EnterEmail(String addEmail) throws Exception {
		email.clear();
		email.sendKeys(addEmail);
		Thread.sleep(2000);
	}
	
	public void EnterPassword(String addPass) throws Exception {
		password.clear();
		password.sendKeys(addPass);
		Thread.sleep(2000);
	}
	
	public void ClickOnLogin() throws Exception {
		Login.click();
		Thread.sleep(5000);
	}
	
	public void LogOutAccount() throws Exception {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(ProfileAccount).click().build().perform();
		Thread.sleep(2000);
		
		logout.click();
		Thread.sleep(2000);
	}

}
