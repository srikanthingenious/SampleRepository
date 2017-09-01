package Com.CrossoverTech.BusinessScripts;

import Com.CrossoverTechTrial.PageObjects.CrossoverTechTrialContentPage;
import Com.CrossoverTechTrial.Reusables.Configurations.Configurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CrossoverTechDeleteTestcases extends Configurator {
	
	@Test(priority = 2)
	public void DeletePostscriptExecution() throws Exception {
		
		
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickContentTab(driver);
			Reporter.log("Clicked on ContentTab");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.totalPostCount(driver);
			Reporter.log("Clicked on Content Tabel");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickEditIcon(driver);
			Reporter.log("Edit post");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickSettingsMenuDropdown(driver);
			Reporter.log("Click on Settings Menu Dropdown");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.deletePost(driver);
			Reporter.log("Click on DeletePost in Settings Menu Dropdown");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.deletePostPopup(driver);
			Reporter.log("Click on Delete in DeletePostPopup");
			
		
	}
}

