package com.project;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Baseclass.Base_Class;
import com.configuration.helper.File_Reader_Manager;
import com.helper.Page_Object_Manager;

public class Automationpractice_Runner_Class extends Base_Class {
	
	public static WebDriver driver = browser_Configuration("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automationpractice_Runner_Class.class);
	
	public static void main(String[] args) throws Throwable {
		
			PropertyConfigurator.configure("log4j.properties");
			
			implicitWait(10, TimeUnit.SECONDS);
			
			String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url();

			getUrl(url);
			
			log.info("Url Launch");
			
			clickOnElement(pom.get_Instance_Hp().getSignin_Btn());
			
			String mailId = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Email();
			
//			String mailId = particular_Cell_Data("C:\\Users\\aravind\\eclipse-workspace\\Maven\\Test Case- Automation Practice.xlsx", 2, 5);
			
			inputValueElement(pom.get_Instance_Lg().getMail_Id(), mailId);
			
			String password = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Password();
	
			inputValueElement(pom.get_Instance_Lg().getPassword(), password);
			
			clickOnElement(pom.get_Instance_Lg().getSignin_Button());
			
			log.info("User Signin done");
			
			clickOnElement(pom.get_Instance_Myacct().getLogo());
			
			actions(pom.get_Instance_Hp().getFaded_Tshirt(), "moveToElement");
			
			actions(pom.get_Instance_Hp().getFaded_Tshirt(), "click");
			
			frameOperation("parentFrame",null,null,null);
			
			actions(pom.get_Instance_Pg1().getQuantity(), "click");
			
			dropdown(pom.get_Instance_Pg1().getSize_Increase(), "byIndex", "2");
			
			actions(pom.get_Instance_Pg1().getColor_ToSelect(), "click");
			
			actions(pom.get_Instance_Pg1().getSubmit(), "click");
			
			explicitWait(pom.get_Instance_Ptc1().getPtc1(), 30);
			
			actions(pom.get_Instance_Ptc2().getPtc2(), "click");
			
			String landmark = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Landmark();
			
			inputValueElement(pom.get_Instance_Ptc3().getMessage(), landmark);
	
			actions(pom.get_Instance_Ptc3().getPct3(), "click");
			
			actions(pom.get_Instance_Ptc4().getTos(), "click");
			
			actions(pom.get_Instance_Ptc4().getPtc4(), "click");
			
			actions(pom.get_Instance_Ptc5().getPbw(), "click");
			
			actions(pom.get_Instance_Os().getCmo(), "click");
			
			takesScreenshot("C:\\Users\\aravind\\eclipse-workspace\\Maven\\Screenshot\\AutomationPractice_Final.png");
			
			actions(pom.get_Instance_Oc().getLogout(), "click");
			
			log.info("Product Purchased");
			
			close();

	}

}
