package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class EditLead extends ProjectWrappers {

	public EditLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	
  public EditLead Typefname(String data){
	  
	  enterByXpath((prop.getProperty("EditLead.fname.xpath")), data);
		return this;
	  
  }
  
public ViewLead ClickUpdate(){
	
	 clickByXpath(prop.getProperty("EditLead.Update.xpath"));
	  
		return new ViewLead(driver, test);
	  
  }

	  

	
	
	}
	
	
	





















