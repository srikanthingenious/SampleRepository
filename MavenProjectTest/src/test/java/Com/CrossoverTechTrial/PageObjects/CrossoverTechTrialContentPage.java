package Com.CrossoverTechTrial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CrossoverTechTrialContentPage {
	
	static String Content_xpath = ".//*[text() = 'Content']";
	static String Post_xpath = ".//*[@class='posts-list']/li[1]/a/h3";
	static String PostEdit_xpath = ".//*[@class='btn btn-minor post-edit ember-view']/i";
	static String SettingsMenuDropdown_xpath = ".//*[@class='ember-view splitbtn js-publish-splitbutton']/button[2]";
	static String DeletePost_xpath = ".//*[@class='dropdown-menu dropdown-triangle-bottom-right']/li[4]/a";
	static String DeletePost1_xpath = ".//*[@class='btn btn-red ember-view']";
	static String ContentTable_xpath = ".//*[@class='view-container']/section[1]";
	static String ContentTableCount_xpath = ".//*[@class='posts-list']/li"; 

	static String postTitle = "Post on Aug";
	
	public static CrossoverTechTrialContentPage clickContentTab(WebDriver driver){
		
		WebElement content = driver.findElement(By.xpath(Content_xpath));
		
		if(content.isDisplayed() || content.isEnabled()){
			
			content.click();
			
			String ActualContentText="Content";
			
			String ExpectedContentText=content.getText();
			
		    Assert.assertTrue(ActualContentText.contains(ExpectedContentText));
		    
		}
		
		else System.out.println("Content is not Enable");
		
		return new CrossoverTechTrialContentPage ();
		
	}
	
public static CrossoverTechTrialContentPage verifyPost(WebDriver driver) throws InterruptedException{
	
	WebElement Post = driver.findElement(By.xpath(Post_xpath));
	
	if(Post.isDisplayed() || Post.isEnabled()){
		
		    Post.click();
		    
		     Thread.sleep(2000);
		    
		       String text = "Post Title Edited";
		     
		       String verifyposttitle = Post.getText();
		      
		       Assert.assertTrue(text.contains(verifyposttitle));
		       
	}
	
	else System.out.println("No Post ");
	
	return new CrossoverTechTrialContentPage ();
	
}


public static CrossoverTechTrialContentPage clickEditIcon(WebDriver driver){
	
	WebElement Post1 = driver.findElement(By.xpath(PostEdit_xpath));
	if(Post1.isDisplayed() || Post1.isEnabled()){
		
		Post1.click();
		
		String expectedEditTitle="Content - Crossover TechTrial Blog";
		
		String title=driver.getTitle();
			
		Assert.assertTrue(expectedEditTitle.contains(title));
	}
	
	else System.out.println("No Post to Edit");
	
	return new CrossoverTechTrialContentPage ();
	
}


public static CrossoverTechTrialContentPage clickSettingsMenuDropdown(WebDriver driver){
	
	WebElement SettingsMenuDropdown = driver.findElement(By.xpath(SettingsMenuDropdown_xpath));
	
	if(SettingsMenuDropdown.isDisplayed() || SettingsMenuDropdown.isEnabled()){
		
		 SettingsMenuDropdown.click();
		
		String menu=SettingsMenuDropdown.getText();
		
		Assert.assertTrue("TOGGLE SETTINGS MENU".contains(menu));
		
	}
	
	else System.out.println("Settings Menu Dropdown is disable");
	
	return new CrossoverTechTrialContentPage ();
	
}

public static CrossoverTechTrialContentPage deletePost(WebDriver driver){
	
	WebElement DeletePost = driver.findElement(By.xpath(DeletePost_xpath));
	if(DeletePost.isDisplayed() || DeletePost.isEnabled()){
		
		DeletePost.click();
		
		String actualDeleteText="Delete Post";
		
		String expectedDeleteText=DeletePost.getText();
		
		Assert.assertTrue(actualDeleteText.contains(expectedDeleteText));
		
	}
	else System.out.println("Delete Post option is not displayed");
	return new CrossoverTechTrialContentPage ();
	
}

public static CrossoverTechTrialContentPage deletePostPopup(WebDriver driver) throws InterruptedException{
	
	WebElement DeletePostPopup = driver.findElement(By.xpath(DeletePost1_xpath));
	if(DeletePostPopup.isDisplayed() || DeletePostPopup.isEnabled()){
		
		DeletePostPopup.click();
		
		Thread.sleep(2000);
		
		String actualDeletePopupText="Content - Crossover TechTrial Blog";
		
		String expectedDeletePopupText=driver.getTitle();
		
		Assert.assertTrue(actualDeletePopupText.contains(expectedDeletePopupText));
		
	}
	
	else System.out.println("Popup is not displayed");
	
	return new CrossoverTechTrialContentPage ();
		
}

public static CrossoverTechTrialContentPage totalPostCount(WebDriver driver){
	
	
	WebElement contentTable = driver.findElement(By.xpath(ContentTable_xpath));
	
	java.util.List<WebElement> contentTableList = contentTable.findElements(By.xpath(ContentTableCount_xpath));
	
	int count = contentTableList.size();
	
	  for(int i=0;i<=count;i++){  
	        if(count == 0){ 
	        	System.out.println("You Haven't Written Any Posts Yet! ");
	            break;  
	        } 
	       
	  	}
	  return new CrossoverTechTrialContentPage ();
}

}

