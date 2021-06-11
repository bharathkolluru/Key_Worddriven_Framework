package testCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Operations.ReadObject;
import Operations.Uioperation;

public class Exicute_Test_Local {
	WebDriver dr = new ChromeDriver();
	ReadObject object = new ReadObject();
	Uioperation operation = new Uioperation(dr);
	@Test(priority=2)
	public void TC_001() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "url");
		operation.perform(allObjects,"SETTEXT", "username", "name", "admin");
		operation.perform(allObjects,"SETTEXT", "password", "name", "admin123");
		operation.perform(allObjects,"CLICK", "loginButton", "name", "");
		operation.perform(allObjects,"CLICK", "welcomeLink", "partiallink", "");
		Thread.sleep(3000);
		operation.perform(allObjects,"CLICK", "logoutLink", "link", "");

	}

}
