package StepDefinations;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import PageObjects.MainIconFunction;
import PageObjects.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

 
public class Steps extends BaseClass {
	
	@Before("@regression")
	public void setup() {
		readconfig=new ReadConfig();
		String browser=readconfig.get_Browser();
		
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	       break;
	        
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();
	        break;
	        
	    default:
	    	driver=null;
	    	break;
		}
		
	}
	
	
/*	@BeforeStep
	public void BeforeStepDemo() {
		System.out.println("this is before step");
	}*/
	
/*	@AfterStep 
	public void AfterStepDemo() {
		System.out.println("this is After step");
	}*/
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		try {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	} catch (Exception e) {
	        // generic exception handling
	        e.printStackTrace();
	}
		
		driver.manage().window().maximize();
		 lg=new loginPage(driver);
		 mf=new MainIconFunction(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User Enter Valid Username as {string} and valid password as {string}")
	public void user_enter_valid_username_as_and_valid_password_as(String Email, String Passw) throws Exception {
		lg.EnterEmail(Email);
		lg.EnterPassword(Passw);
		
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
		lg.ClickOnLogin();
		
	}

	@Then("validate Title of home page should be {string}")
	public void validate_title_of_home_page_should_be(String Ex_Title) {
		String Act_Title=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(Ex_Title,Act_Title);
	}

	@When("Click on logOut link")
	public void click_on_log_out_link() throws Exception {
		lg.LogOutAccount();
	}
	@Then("validate Title should be {string}")
	public void validate_title_should_be(String ExpectedTitle) {
		String ActualTitle=driver.getTitle();
		System.out.println(driver.getTitle());
		if(ExpectedTitle.equals(ActualTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@Then("close the browser")
	public void close_the_browser() throws Exception {
		Thread.sleep(2000);
		driver.close();
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	
	@When("User click on menu icon")
	public void user_click_on_menu_icon() throws Exception {
		mf.ClickOnMenuIcon();
	    
	}

	@When("user click on Events")
	public void user_click_on_events() throws Exception {
		mf.ClickOnEvents();
		System.out.println(driver.getTitle());
	}

	@Then("validate title of page should be {string}")
	public void validate_title_of_page_should_be(String exp_title_event) {
	String act_title=driver.getTitle();
	Assert.assertEquals(exp_title_event,act_title);
	}

	@When("User navigate on previeous page")
	public void user_navigate_on_previeous_page() {
		driver.navigate().back();
		driver.navigate().refresh();
	}

	@When("User click on Friends")
	public void user_click_on_friends() throws Exception {
	    mf.ClickOnFriends();
	    System.out.println(driver.getTitle());
	}

	@When("User click on Groups")
	public void user_click_on_groups() throws Exception {
	   mf.ClickOnGroups();
	   System.out.println(driver.getTitle());
	}

	@When("User click on News Feeds")
	public void user_click_on_news_feeds() throws Exception {
	   mf.ClickOnNews();
	   System.out.println(driver.getTitle());
	}

	@When("User click on Favorites")
	public void user_click_on_favorites() throws Exception {
	    mf.ClickOnFavorites();
	    System.out.println(driver.getTitle());
	}

	@Then("validate the WebElement favorite is displayed")
	public void validate_the_web_element_favorite_is_displayed() throws Exception {
	mf.verifyFavoritess();
	
	}

	@When("user refresh the page")
	public void user_refresh_the_page() {
	  driver.navigate().refresh();
	}

	@When("user click on Pages")
	public void user_click_on_pages() throws Exception {
	   mf.ClickOnPages();
	   System.out.println(driver.getTitle());
	}

	@After
	public void teardown(Scenario sc) throws IOException {
		if(sc.isFailed()==true ) {
			System.out.println("this scenario is failed");
			TakesScreenshot src=(TakesScreenshot)driver;
			File source=src.getScreenshotAs(OutputType.FILE);
			File target=new File(".//target//shot//failed01.png");
			FileHandler.copy(source, target);
		}
		
		driver.quit();
	}

}
