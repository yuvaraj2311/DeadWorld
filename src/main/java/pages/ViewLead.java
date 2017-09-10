package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class ViewLead extends ProjectWrappers {

	public ViewLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	
	public ViewLead VerifyFname(String text){

		verifyTextContainsById(prop.getProperty("ViewLead.Fname.id"), text);
		return this;

	}

	public EditLead ClickEdit(){

		clickByLink(prop.getProperty("ViewLead.Edit.link"));

		return new EditLead(driver, test);

	}

	public MyLeads ClickDelete(){

		clickByLink(prop.getProperty("ViewLead.Delete.link"));

		return new MyLeads(driver, test);

	}
	public DuplicateLead ClickDuplicate(){


		clickByLink(prop.getProperty("ViewLead.Duplicate.Link"));


		return new DuplicateLead(driver, test);

	}
	
public FindLeads ClickFindLead1(){
		
		clickByLink(prop.getProperty("ViewLead.FindLead1.Link"));
		return new FindLeads(driver, test);
		
	}


}
























