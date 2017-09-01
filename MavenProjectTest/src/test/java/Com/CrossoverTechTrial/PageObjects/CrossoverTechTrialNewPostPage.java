package Com.CrossoverTechTrial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CrossoverTechTrialNewPostPage {
	
	static String Post_xpath = ".//*[@class='gh-nav-list gh-nav-main']/li[1]";
	static String PostTitle_xpath = ".//*[@id='entry-title' or @class='ember-view gh-input']";
	static String Description_xpath = ".//*[@class='entry-markdown js-entry-markdown active']//section/textarea";
	static String Publish_xpath = ".//*[@class='dropdown-menu dropdown-triangle-bottom-right']/li[1]/a";
	static String PublishNow_xpath = ".//*[@class='view-actions']//section/button[1]";
	static String verifypost_xpath=".//*[@class='posts-list']//h3";
	static String Title = "Post on Aug";
	static String NewImage = "\n ![](/content/images/2017/08/11.jpg)\n";
	
	
	
	public static CrossoverTechTrialNewPostPage clickNewPostOption(WebDriver driver){
		
		WebElement Post = driver.findElement(By.xpath(Post_xpath));
		
		
		if(Post.isDisplayed() || Post.isEnabled()){
			
		    Post.click();
		
		    String Actual = "Editor - Crossover TechTrial Blog";
	        
	        String Expected=driver.getTitle();
	        
	        Assert.assertTrue(Actual.equalsIgnoreCase(Expected));
	        
		}
		else System.out.println("Post button is not displayed");
		
		return new CrossoverTechTrialNewPostPage ();
		
	}

public static CrossoverTechTrialNewPostPage enterPostTitle(WebDriver driver) throws InterruptedException{
		
		WebElement PostTitle = driver.findElement(By.xpath(PostTitle_xpath));
		
		if(PostTitle.isDisplayed() || PostTitle.isEnabled()){
			
			PostTitle.click();
			
			PostTitle.sendKeys(Title);
		
			Assert.assertTrue("Editor - Crossover TechTrial Blog".contains(driver.getTitle()));
			
		}
		
		else System.out.println("PostTitle is not Enable");
		
		return new CrossoverTechTrialNewPostPage ();
		
	}

public static CrossoverTechTrialNewPostPage enterImageDescription(WebDriver driver) {

	WebElement Description = driver.findElement(By.xpath(Description_xpath));
	
	if(Description.isDisplayed() || Description.isEnabled()){
		
		Description.sendKeys(NewImage);
		
	}
	else System.out.println("PostimageDescription textbox is not Enable");
	
	return new CrossoverTechTrialNewPostPage ();
	
}

public static CrossoverTechTrialNewPostPage enterPostDescription(WebDriver driver){
	
	WebElement Description1 = driver.findElement(By.xpath(Description_xpath));
	if(Description1.isDisplayed() || Description1.isEnabled()){
		
			Description1.sendKeys("Post on Aug description\n");
		
		
	}
	else System.out.println("PostTitleDescription textbox is not Enable");
	return new CrossoverTechTrialNewPostPage ();
	
}

public static CrossoverTechTrialContentPage selectPublishOption(WebDriver driver){
	
	WebElement Publish = driver.findElement(By.xpath(Publish_xpath));
	
	if(Publish.isDisplayed() || Publish.isEnabled()){
		
		Publish.click();
		
		Assert.assertEquals("Publish Now", Publish.getText());
	
		
	}
	else System.out.println("No Post to Publish");
	
	return new CrossoverTechTrialContentPage ();
	
}

public static CrossoverTechTrialContentPage clickPublishNowOption(WebDriver driver){
	
	WebElement Publish1 = driver.findElement(By.xpath(PublishNow_xpath));
	if(Publish1.isDisplayed() || Publish1.isEnabled()){
		
		Publish1.click();
		
		String title=driver.getTitle();
		
		String Afterpublishtitle = "Editor - Crossover TechTrial Blog";
        
        String Expectedtitle=driver.getTitle();
        
        Assert.assertTrue(Expectedtitle.equalsIgnoreCase(Afterpublishtitle));
		
	}
	else System.out.println("No Post to Publish");
	
	return new CrossoverTechTrialContentPage ();
	
}

public static CrossoverTechTrialContentPage verifyPostTitle(WebDriver driver){
	
	WebElement verifypost = driver.findElement(By.xpath(verifypost_xpath));
	
	if(verifypost.isDisplayed() || verifypost.isEnabled()){
		
		String verifyposttitle = verifypost.getText();
		
	    Assert.assertTrue(verifyposttitle.contains(Title));
	}
	
	else System.out.println("No Post to Publish");
	
	return new CrossoverTechTrialContentPage ();
	
}
	
}
