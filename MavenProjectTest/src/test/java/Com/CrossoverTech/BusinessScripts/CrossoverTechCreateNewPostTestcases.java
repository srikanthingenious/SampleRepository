package Com.CrossoverTech.BusinessScripts;

import Com.CrossoverTechTrial.PageObjects.CrossoverTechTrialContentPage;
import Com.CrossoverTechTrial.PageObjects.CrossoverTechTrialNewPostPage;
import Com.CrossoverTechTrial.Reusables.Configurations.Configurator;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CrossoverTechCreateNewPostTestcases extends Configurator {
	
	@Test(priority = 0)
	public void CreateNewPostscriptExecution() throws Exception {
		
		
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.clickNewPostOption(driver);
			Reporter.log("Clicked on Post");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterPostTitle(driver);
			Reporter.log("Enter post title");
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterPostDescription(driver);
			Reporter.log("Post Description given");
				
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterImageDescription(driver);
			Reporter.log(" Image Added to post");

			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickSettingsMenuDropdown(driver); 
			Reporter.log("Settings Menu Dropdown clicked");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.selectPublishOption(driver);
			Reporter.log("Click on Publish");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.clickPublishNowOption(driver);
			Reporter.log("Click on Publish Now");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickContentTab(driver);
			Reporter.log("Click on Content Tab");
			
			
	}
}