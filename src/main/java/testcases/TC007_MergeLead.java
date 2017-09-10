package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.ProjectWrappers;

public class TC007_MergeLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testDescription = "Merging leads";
		authors = "Yuvaraj";
		category = "Sanity";
		browserName = "chrome";
		dataSheetName = "TC007";		
	}
	
	@Test(dataProvider="fetchData")
	public void CLead(String uName, String pwd, String welcome,String Leadid,String Leadid1,String Leadid2, String error3){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickCRMSFSA()
		.clickLeads()
		.ClickMergeLead()
		.Clickfromlead()
		.SwitchtoLastWindow()
		.TypeLeadId1(Leadid)
		.ClickFindLeadbutton1()
		.ClickFirstResult1()
		.Clicktolead()
		.SwitchtoLastWindow1()
		.TypeLeadId1(Leadid1)
		.ClickFindLeadbutton1()
		.ClickFirstResult1()
		.ClickMerge()
		.ClickFindLead1()
		.TypeLeadId(Leadid2)
		.ClickFindLeadbutton()
		.VerifyErrorMsg(error3);
	
		
		}
}















