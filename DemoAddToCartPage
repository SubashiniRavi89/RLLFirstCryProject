package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoAddToCartPage {
	
	
	@FindBy(xpath="//li[@class='logreg']/child::span[1]")
	static WebElement LoginLink;
	
	@FindBy(xpath="//input[@id='lemail']")
	static WebElement EmailLink;
	
	
	@FindBy(xpath="//div[@class='B14_white comm-btn btn-login-continue btn-login-cont-otp']")
	static WebElement ContinueBTN;
	
	@FindBy(xpath="//div[@class='B14_white comm-btn btn-login-continue']")
	static WebElement SubmitBTN;
	
	@FindBy(xpath="/html/body/div[1]/div[8]/div/div/div[2]/div[5]/div/div/ul[1]/li[2]/a")
	static WebElement CasualShoes;
	
	@FindBy(xpath="(//div[@class='list_img wifi'])[1]")
	static WebElement ProductLink;
	
	@FindBy(xpath="(//span[@class='size-option pos-rel2stat R14_42'])[1]")
	static WebElement SelectSize;
	
	@FindBy(xpath="(//span[@class='M16_white'])[4]")
	static WebElement AddToCartBTN;
	
	
	public void clickLoginLink()
	{
		LoginLink.click();
	}
	
	public void sendkeysEmailLink(String EmailId)
	{
		EmailLink.sendKeys(EmailId);
	}
	
	public void continueButton()
	{
		ContinueBTN.click();
	}
	
	public void submitButton()
	{
		SubmitBTN.click();
	}
	
	public void clickshoes()
	{
		CasualShoes.click();
	}
	
	public void clickproduct()
	{
		ProductLink.click();
	}
	
	public void selectshoesize()
	{
		SelectSize.click();
	}
	
	public void addtocart()
	{
		AddToCartBTN.click();
	}
	
	
}
