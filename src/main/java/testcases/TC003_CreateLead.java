package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.ProjectWrappers;

public class TC003_CreateLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC003_CreateLead";
		testDescription = "Creating a New lead";
		authors = "Yuvaraj";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC003";		
	}
	
	@Test(dataProvider="fetchData")
	public void CLead(String uName, String pwd, String welcome, String Cmpanyname, String Fname, String Lname){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickCRMSFSA()
		.clickLeads()
		.ClickCreateLead()
		.TypeCmpyName(Cmpanyname)
		.TypeFname(Fname)
		.TypeLname(Lname)
		.ClickCreatelead1();
		
	}
}















