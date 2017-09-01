package Com.CrossoverTechTrial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrossoverTechTrialEditContentPage {
	
	static String ImageDelete_xpath = ".//*[@class='image-cancel icon-trash']";
	static String NewImageuploader_xpath = ".//*[@class='ember-view gh-image-uploader']";
	static String Editdescription_xpath = ".//*[@id='entry-markdown-content']/textarea";
	static String EditTitle_xpath = ".//*[@class='ember-view gh-input']";

	static String EditImage = "\n ![](/content/images/2017/08/images.jpg)";
	
	
public static CrossoverTechTrialEditContentPage editTitle(WebDriver driver) throws InterruptedException{
        
        WebElement EditTitle = driver.findElement(By.xpath(EditTitle_xpath ));
        
        if(EditTitle.isDisplayed() || EditTitle.isEnabled()){
            
        	Thread.sleep(2000);
        	
        	EditTitle.clear();          
                  
            EditTitle.sendKeys("Post Title Edited");
            
        }
        
        else System.out.println("Content Title is not update");
        
        return new CrossoverTechTrialEditContentPage ();
}

public static CrossoverTechTrialEditContentPage editImage(WebDriver driver) throws Exception{
	
	WebElement Editdescription = driver.findElement(By.xpath(Editdescription_xpath));
	if(Editdescription.isDisplayed() || Editdescription.isEnabled()){
		
		Thread.sleep(2000);
		
		Editdescription.sendKeys(EditImage);
		
		
	}
	else System.out.println("Unable to edit post");
	
	return new CrossoverTechTrialEditContentPage ();
	
}

public static CrossoverTechTrialEditContentPage editDescription(WebDriver driver) {
	
	WebElement Editdescription = driver.findElement(By.xpath(Editdescription_xpath));
	if(Editdescription.isDisplayed() || Editdescription.isEnabled()){
		
		Editdescription.clear();
		
		Editdescription.sendKeys("\n Description Edited");
		
	}
	
	else System.out.println("Unable to edit post");
	
	return new CrossoverTechTrialEditContentPage ();
	
}
	

}

