package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName,true);
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		closeAllBrowsers();		
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData(){
		return DataInputProvider.getAllSheetData(dataSheetName);		
	}	
	
	
}






