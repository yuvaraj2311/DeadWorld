package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class DuplicateLead extends ProjectWrappers {

	public DuplicateLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	
  public DuplicateLead VerifypageHeader(String text){
	  
	  verifyTextById(prop.getProperty("DuplicateLead.pageHeader.id"), text);
		return this;
	  
  }
  public ViewLead ClickCreatelead2(){

		clickByXpath(prop.getProperty("DuplicateLead.Createlead2.xpath"));
		return new ViewLead(driver, test);

	
	}
	
}
	
	





















