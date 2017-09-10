package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeads1 extends ProjectWrappers {

	public FindLeads1(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		}
	
public MergeLead ClickFirstResult1(){
	
clickByXpathNoSnap(prop.getProperty("FindLeads.FirstResult1.Xpath"));
switchToParentWindow();
	return new MergeLead(driver, test);
	}

public FindLeads1 SwitchtoLastWindow(){
	switchToLastWindow();
	return new FindLeads1(driver, test);		
}



public FindLeads1 SwitchtoLastWindow1(){
	switchToLastWindow();
	return new FindLeads1(driver, test);


}

public FindLeads1 ClickFindLeadbutton1(){
	
	clickByXpath((prop.getProperty("FindLeads.FindLeadbutton1.Xpath")));
	return this;
}

public FindLeads1 TypeLeadId1(String data){
	enterByName((prop.getProperty("FindLeads.LeadId1.Name")), data);
	return this;
	
	
	}
}