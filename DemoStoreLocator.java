package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.DemoStoreLocatorPage;

public class DemoStoreLocator {
	
	
	  WebDriver driver;
	  SharedstepsAddToCart s;
	  DemoStoreLocatorPage d;
	  
	  public DemoStoreLocator(SharedstepsAddToCart s)
		
		 {
			 this.s=s; //this s will get place when we use pico container before using picocontainer we got error
			 
		 }
	  
	  @BeforeAll
		public static void featurestarts()
		{
			System.out.println("The feature has started execution");
		}
		
		@AfterAll
		public static void featureends()
		{
			System.out.println("The feature has completed execution");
		}
	
	
	@Given("I open the browser and enter URL of firstcry Page")
	public void i_open_the_browser_and_enter_url_of_firstcry_page() {
		
		   driver=s.getDriver();//whenever we initialized we will get chrome driver
		   
		   //by adding below line only DemoStoreLocatorPage will work
		   d=PageFactory.initElements(driver, DemoStoreLocatorPage.class);
		   
		   driver.get("https://www.firstcry.com/");
	    
	}

	@Then("I Click on login link and enter the Email id {string}")
	public void i_click_on_login_link_and_enter_the_email_id(String EmailId) throws InterruptedException {
		
		
		        //clicking LoginLink
				d.clickLoginLink();
				
				//sending keys to email id
				d.sendkeysEmailLink(EmailId);
				Thread.sleep(2000);
				
				//clicking on continue button
				d.continueButton();
				Thread.sleep(20000);
				
				//clicking on submit button
				d.submitButton();
				System.out.println("Successfully entered OTP");
	    
	}

	@Then("I click on Stores Section and click on Find Stores from DropDown Menu")
	public void i_click_on_stores_section_and_click_on_find_stores_from_drop_down_menu() throws InterruptedException {
		
		
		//when we have to do 2 or more actions at a time we have to use Actions Class
		//submenu Automation
		
		Thread.sleep(1000);
		////li[@class='navhide first-child']/child::span--->//stores and preschools
		WebElement target =driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/span/span")) ; //stores and preschools
		Thread.sleep(2000);
		WebElement target1=driver.findElement(By.xpath("(//a[@class='R12_61'])[1]/child::span")); //FindSores
		Actions stores = new Actions(driver);
		stores.moveToElement(target);
		
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		stores.click(target1);
		stores.build().perform();
	    
	}

	@Then("I Search For the  Store Locator")
	public void i_search_for_the_store_locator() throws InterruptedException {
		
		
		 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement storetype =driver.findElement(By.xpath("//select[@onchange='return ValidateStoretype();']")); //shubhendhu check this part
		 
	
		 Select dd = new Select (storetype);
		 dd.deselectByValue("FirstCry");    //shubhendhu check this part
				
				
	}

	@Then("I click on Search Icon")
	public void i_click_on_search_icon() {
	    
	}

}
