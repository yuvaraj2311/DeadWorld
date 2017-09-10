package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class CreateLead extends ProjectWrappers {

	public CreateLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	
	public CreateLead TypeCmpyName(String data){

		enterById(prop.getProperty("CreateLead.CmpyName.Id"), data);
		return this;

	}

	public CreateLead TypeFname(String data){

		enterById(prop.getProperty("CreateLead.Fname.Id"), data);
		return this;

	}

	public CreateLead TypeLname(String data){

		enterById(prop.getProperty("CreateLead.Lname.Id"), data);
		return this;

	}

	public ViewLead ClickCreatelead1(){

		clickByXpath(prop.getProperty("CreateLead.Createlead1.xpath"));
		return new ViewLead(driver, test);

	}


}
























