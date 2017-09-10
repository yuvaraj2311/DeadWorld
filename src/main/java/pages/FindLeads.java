package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeads extends ProjectWrappers {

	public FindLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	

	public FindLeads TypeFname(String data){
		
		enterByXpath((prop.getProperty("FindLeads.Fname.Xpath")), data);
		return this;
		
	}
public FindLeads ClickFindLeadbutton(){
		
		clickByXpath((prop.getProperty("FindLeads.FindLeadbutton.Xpath")));
		return this;
		
	}
public ViewLead ClickFirstResult(){
	clickByXpath(prop.getProperty("FindLeads.FirstResult.Xpath"));
	return new ViewLead(driver, test);
	
}

public FindLeads TypeLeadId(String data){
	enterByName((prop.getProperty("FindLeads.LeadId.Name")), data);
	return this;
	
	
	}
public FindLeads VerifyErrorMsg(String text){
	
	verifyTextContainsByXpath(prop.getProperty("FindLeads.ErrorMsg.ContainsByXpath"), text);
	
	return this;
	
}
	
	public FindLeads Clicktabphone(){
		
		clickByXpath(prop.getProperty("FindLeads.phone.xpath"));
		return this;
}
	
	public FindLeads Typephonenumber(String data){
		
		enterByName((prop.getProperty("FindLeads.Enterphone.Name")), data);
		return this;
	
}	
	
	public FindLeads CaptureLeadid(){
	
firstreslead = getTextByXpath(prop.getProperty("FindLeads.captureLeadid.xpath"));
		
		return this;
		
		}
	
public FindLeads ClicktabEmail(){
	
	clickByLink(prop.getProperty("FindLeads.tabEmail.link"));
		return this;
}

public FindLeads TypeEmail(String data){
	
	enterByName((prop.getProperty("FindLeads.email.Name")), data);
	return this;
}

public FindLeads CaptureLeadname(){
	
	firstreslleadname = getTextByXpath(prop.getProperty("FindLeads.captureleadname.xpath"));
		
		return this;
		
		}



}
















