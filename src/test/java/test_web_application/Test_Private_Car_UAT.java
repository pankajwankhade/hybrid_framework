package test_web_application;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass_UAT;

import uat_web_application.Private_Car_UAT;

public class Test_Private_Car_UAT extends BaseClass_UAT {

	Private_Car_UAT pc;

	@BeforeSuite
	public void setup() throws Exception {
		//		driver = new ChromeDriver();
		//		driver.get("https://test.probusinsurance.com/");
		//		driver.manage().window().maximize();
		initialization();
		pc = new Private_Car_UAT(driver);	
	}

	@Test(priority = 1)
	public void dont_Know_Vehicle() throws Exception {
		pc.dont_know_vehicle();
	}

	@Test(priority = 2)
	public void policy_Type() {
		pc.required_Policy_Type();
	}

	@Test(priority = 3)
	public void expiry_Status() {
		pc.previous_Expiry_Status(); 
	}
	@Test(priority = 4)
	public void previous_insurer() {
		pc.previousInsurer_value();
	}
	@Test(priority = 5)
	public void pa_cover() {
		pc.pA_Owner();
	}
	
	@Test(priority = 6)
	public void sel_quotes(){
		pc.selectQuotes();
	}
	
	@Test(priority = 7)
	public void pancard_kyc() throws Exception {
		pc.pan_card_Kyc("DYDPB0158L","vishal","bisen","sahebrao.w@probusinsurance.com","440035");
		pc.selectdateOfBirth("2000","January", "18");
	}

	@Test(priority = 8)
	public void owner_details() throws Exception {
		pc.owner_details("H206","Gala Empire","440035","sahebrao.w@probusinsurance.com","MAHARASHTRA","NAGPUR");
	}

	@Test(priority = 9)
	public void vehicle_details() {
		pc.vehicle_Details("25215455884523564");

	}

	@Test(priority = 10)
	public void other_details() throws Exception {
		pc.other_Details("MAHARASHTRA","AKOLA");
		pc.SelectNomineeDateOfBirth("2002", "June", "01");
	}

	@Test(priority = 11)
	public void termAndCondtions() {
		pc.checkBoxes();
	}

	@Test(priority = 12)                              
	public void opt() {
		pc.enter_otp("9", "9", "9", "9", "0");
	}

}
