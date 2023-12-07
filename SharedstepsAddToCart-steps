package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedstepsAddToCart {
	
	
	WebDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@After
	public void teardown() throws IOException
	{
		
		driver.quit();
	}

}
