package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyLeads extends ProjectWrappers {

	public MyLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	

	public CreateLead ClickCreateLead(){
		
		clickByLink(prop.getProperty("MyLeads.CreateLead.Link"));	
		return new CreateLead(driver, test);
		
	}
	
public FindLeads ClickFindLead(){
		
		clickByLink(prop.getProperty("MyLeads.FindLead.Link"));
		return new FindLeads(driver, test);
		
	}
public MergeLead ClickMergeLead(){
	
	clickByLink(prop.getProperty("MyLeads.MergeLead.Link"));
	return new MergeLead(driver, test);
	
}
	
	
	}
	
	
	





















