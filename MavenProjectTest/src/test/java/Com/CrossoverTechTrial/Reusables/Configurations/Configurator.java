package Com.CrossoverTechTrial.Reusables.Configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Com.CrossTechTrial.Reusables.Supporters.Property;
import Com.CrossoverTechTrial.Constants.CrossoverTechTrialConstants;
import Com.CrossoverTechTrial.PageObjects.CrossoverTechTrialLoginPage;

public class Configurator {

public static WebDriver driver;
	
    @BeforeTest
    @Parameters("browser")
    
   // We Can choose the below browsers as optional firefox/chrome/ie in setup method.
    
    public void setup(@Optional("chrome")String browser) throws Exception{
        if(browser.equalsIgnoreCase("firefox")){
        	
        	       	        	
        	System.setProperty("webdriver.gecko.driver","src\\test\\java\\Com\\CrossoverTechTrial\\Reusables\\Supporters\\Utilities\\geckodriver.exe");
            driver = new FirefoxDriver();
                        
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        else if(browser.equalsIgnoreCase("chrome")){      
                  	
            System.setProperty("webdriver.chrome.driver","src\\test\\java\\Com\\CrossoverTechTrial\\Reusables\\Supporters\\Utilities\\chromedriver.exe");
                     
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
           
        }
       else if(browser.equalsIgnoreCase("ie")){
    	  
            System.setProperty("webdriver.ie.driver","src\\test\\java\\Com\\CrossoverTechTrial\\Reusables\\Supporters\\Utilities\\IEDriverServer.exe");
           
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        else{
 
            throw new Exception("Browser is not support and not correct");
        }
        
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        Property property = new Property(CrossoverTechTrialConstants.configFile);
		driver.get(property.getProperty("url"));
		Reporter.log("Url Entered");
		
		Thread.sleep(2000);
		CrossoverTechTrialLoginPage.EnterEmailid(driver);
		Reporter.log("Email entered");
		
		Thread.sleep(2000);
		CrossoverTechTrialLoginPage.EnterPassword(driver);
		Reporter.log("Password entered");
		
		Thread.sleep(2000);
		CrossoverTechTrialLoginPage.ClickOnSignIn(driver);
		Reporter.log("Clicked on SignIn Button");
		
    }
   
    
/*@AfterTest
    public void destroy() {
		driver.quit();

	}*/
    
	
}
