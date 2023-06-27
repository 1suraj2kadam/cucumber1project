package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainIconFunction {
	public WebDriver driver;

	public MainIconFunction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@aria-label='Menu'])[1]")
	WebElement Menu;
	
	@FindBy(xpath="//span[contains(text(),'Organize or find events and other things to do online and nearby.')]")
	WebElement Events;
	
	@FindBy(xpath="(//span[contains(text(),'Friends')])[1]")
	WebElement Friends;
	
	@FindBy(xpath="(//span[contains(text(),'Groups')])[1]")
	WebElement Groups;
	
	@FindBy(xpath="(//span[contains(text(),'See relevant posts from people and Pages you follow.')])[1]")
	WebElement News_Feeds;
	
	@FindBy(xpath="(//span[contains(text(),'View posts by Favorites')])[1]")
	WebElement Favorites;
	
	@FindBy(xpath="(//span[contains(text(),'Favorites')])[1]")
	WebElement verifyFavorites;
	
	
	@FindBy(xpath="(//span[contains(text(),'Pages')])[1]")
	WebElement Pages;
	
	
	public void ClickOnMenuIcon() throws Exception {
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(Menu).build().perform();
		Menu.click();
		Thread.sleep(2000);
	}
	
	public void ClickOnEvents() throws Exception {
		Events.click();
		Thread.sleep(2000);
	}
	
	public void ClickOnFriends() throws Exception {
		Friends.click();
		Thread.sleep(2000);
	}
	
	public void ClickOnGroups() throws Exception {
		Groups.click();
		Thread.sleep(2000);
	}
	
	public void ClickOnNews() throws Exception {
		News_Feeds.click();
		Thread.sleep(2000);
	}
	
	public void ClickOnFavorites() throws Exception {
		Favorites.click();
		Thread.sleep(2000);
	}
	public void verifyFavoritess() throws Exception {
		 boolean ab=verifyFavorites.isDisplayed();
		 if(ab==true) {
			 System.out.println("webelement is Displayed");
			 Assert.assertTrue(true);
		 }
		 else {
			 Assert.assertTrue(false);
		 }
		
	}
	
	
	public void ClickOnPages() throws Exception {
		Pages.click();
		Thread.sleep(2000);
	}
}
