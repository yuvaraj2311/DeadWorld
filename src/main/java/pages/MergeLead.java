package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MergeLead extends ProjectWrappers {

	public MergeLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	
	public FindLeads1 Clickfromlead(){

		clickByXpathNoSnap(prop.getProperty("MergeLead.fromlead.xpathnosnap"));
		return new FindLeads1(driver, test);
	}

	public FindLeads1 Clicktolead(){

		clickByXpathNoSnap(prop.getProperty("MergeLead.tolead.xpathnosnap"));
		return new FindLeads1(driver, test);

	}
	public ViewLead ClickMerge(){

		clickByLinkNoSnap(prop.getProperty("MergeLead.merge.linknosnap"));
		acceptAlert();
		return new ViewLead(driver, test);

	}

}























