package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wrappers.ProjectWrappers;

public class TC004_EditLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC004_EditLead";
		testDescription = "Editing a existing lead";
		authors = "Yuvaraj";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC004";		
	}
	
	@Test(dataProvider="fetchData")
	public void CLead(String uName, String pwd, String welcome,String EntFname, String editfname, String Vfname){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickCRMSFSA()
		.clickLeads()
		.ClickFindLead()
		.TypeFname(EntFname)
		.ClickFindLeadbutton()
		.ClickFirstResult()
		.ClickEdit()
		.Typefname(editfname)
		.ClickUpdate()
		.VerifyFname(Vfname);
		}
}















