package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.ProjectWrappers;

public class TC005_DeleteLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC005_DeleteLead";
		testDescription = "Deleting a existing lead";
		authors = "Yuvaraj";
		category = "Sanity";
		browserName = "chrome";
		dataSheetName = "TC005";		
	}
	
	@Test(dataProvider="fetchData")
	public void CLead(String uName, String pwd, String welcome,String Enphone,String error1){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickCRMSFSA()
		.clickLeads()
		.ClickFindLead()
		.Clicktabphone()
		.Typephonenumber(Enphone)
		.ClickFindLeadbutton()
		.CaptureLeadid()
		.ClickFirstResult()
		.ClickDelete()
		.ClickFindLead()
		.TypeLeadId(firstreslead)
		.ClickFindLeadbutton()
		.VerifyErrorMsg(error1);
		
		}
}















