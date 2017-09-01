package Com.CrossoverTechTrial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrossoverTechTrialLoginPage {
	
	
	static String Emailid_xpath = ".//*[@class ='email ember-view gh-input']";
	static String Password_xpath = ".//*[@class ='password ember-view gh-input']";
	static String SignIn_xpath = ".//*[@class ='login btn btn-blue btn-block ember-view']";
	
	
	public static CrossoverTechTrialLoginPage  EnterEmailid(WebDriver driver){
		
		WebElement Emailid = driver.findElement(By.xpath(Emailid_xpath));
		if(Emailid.isDisplayed() || Emailid.isEnabled()){
			Emailid.clear();
			Emailid.sendKeys("admin@test.com");
		}
		else System.out.println("Emailid Textbox is not displayed");
		return new CrossoverTechTrialLoginPage ();
		
	}
	
	public static CrossoverTechTrialLoginPage  EnterPassword(WebDriver driver){
		
		WebElement Password = driver.findElement(By.xpath(Password_xpath));
		if(Password.isDisplayed() || Password.isEnabled()){
			Password.clear();
			Password.sendKeys("1q2w3e4r");
		}
		else System.out.println("Password Textbox is not displayed");
		return new CrossoverTechTrialLoginPage ();
		
	}
	
	public static CrossoverTechTrialLoginPage  ClickOnSignIn(WebDriver driver){
		
		WebElement SignIn = driver.findElement(By.xpath(SignIn_xpath));
		if(SignIn.isDisplayed() || SignIn.isEnabled()){
			
			SignIn.click();
		}
		else System.out.println("SignIn button is not displayed");
		return new CrossoverTechTrialLoginPage ();
		
	}
	
	
	
	

}
