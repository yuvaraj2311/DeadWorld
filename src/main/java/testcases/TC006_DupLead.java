package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.ProjectWrappers;

public class TC006_DupLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC006_DuplicateLead";
		testDescription = "Duplicating a existing lead";
		authors = "Yuvaraj";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "TC006";		
	}
	
	@Test(dataProvider="fetchData")
	public void CLead(String uName, String pwd, String welcome,String email,String header){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickCRMSFSA()
		.clickLeads()
		.ClickFindLead()
		.ClicktabEmail()
		.TypeEmail(email)
		.ClickFindLeadbutton()
		.CaptureLeadname()
		.ClickFirstResult()
		.ClickDuplicate()
		.VerifypageHeader(header)
		.ClickCreatelead2()
		.VerifyFname(firstreslleadname);
		
		}
}















