package test_web_application;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass_UAT;

import uat_web_application.TwoWheeler_UAT;

public class Test_TwoWheeler_UAT extends BaseClass_UAT {

	//WebDriver driver = null;

	TwoWheeler_UAT tw;

	@BeforeSuite
	public void setup() throws Exception {
		//		driver = new ChromeDriver();
		//		driver.get("https://test.probusinsurance.com/");
		//		driver.manage().window().maximize();
		initialization();
		tw = new TwoWheeler_UAT(driver);
	}

	@Test(priority = 1)
	public void makeModal() throws Exception {
		tw.make_model();
	}
                                          
	@Test(priority = 2)
	public void policy_Type() {
		tw.required_Policy_Type();

	}

	@Test(priority = 3)
	public void policy_expire() throws Exception {

		tw.previous_Expiry_Status();
		Thread.sleep(1000);

	}

	@Test(priority = 4)
	public void previousInsurar() {

		tw.previousInsurer_value();
	}

	@Test(priority = 5)
	public void customerType() {
		tw.customer_types("Probus insurance");
	}

	@Test(priority = 6)
	public void pacoverOwner() {
		tw.pA_Owner();
	}

	@Test(priority = 7)                                 
	public void modify_Quote() {
		tw.modifyQuotes();
	}

	@Test(priority = 8)
	public void sel_quotes() {
		tw.selectQuotes();
	}                       

	@Test(priority = 9)
	public void pancard_kyc() throws Exception {
		tw.pan_card_Kyc("DYDPB0158L","vishal","bisen" ,"8888757597", "sahebrao.w@probusinsurance.com","440035");
		tw.selectdateOfBirth("2000","January", "18");
	}

	@Test(priority = 10)
	public void owner_details() throws Exception {
		tw.owner_details("H206","Gala Empire", "440035","8888757597","sahebrao.w@probusinsurance.com","MAHARASHTRA","NAGPUR");
	}

	@Test(priority = 11)
	public void vehicle_details() {
		tw.vehicle_Details("GJ-01-AC-1232","45872", "258746255");

	}

	@Test(priority = 12)
	public void other_details() throws Exception {
		tw.other_Details("Pankaj Wankhade", "S1215649821212","MAHARASHTRA","AKOLA","2457894256741");
		tw.SelectNomineeDateOfBirth("2002", "June", "01");
	}

	@Test(priority = 13)
	public void termAndCondtions() {
		tw.checkBoxes();
	}

	@Test(priority = 14)                              
	public void opt() {
		tw.enter_otp("9", "9", "9", "9", "0");
	}

}
