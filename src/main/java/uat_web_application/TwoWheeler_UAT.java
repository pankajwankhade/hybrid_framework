package uat_web_application;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass_UAT;

public class TwoWheeler_UAT extends BaseClass_UAT {

	//WebDriver driver;

	WebDriverWait wait ;

	@FindBy(xpath = "//*[@ng-click='DontKnowTWRegistrationNumber()']")
	WebElement click_Here;

	@FindBy(xpath = "//*[text()=' Ahmedabad']")
	WebElement  ahmedabad;

	@FindBy(xpath = "//*[text()=' GJ-01 Ahmedabad']")
	WebElement  gj_01_Ahmedabad;

	@FindBy(xpath = "//*[text()='BAJAJ']")
	WebElement bajaj;

	@FindBy(id = "Model_value")
	WebElement model_value;

	@FindBy(xpath = "//*[text()='DISCOVER 150']")
	WebElement discover_150;

	@FindBy(xpath = "//*[@class='custom_btn btn-primary nextbtnstep clk4step ripplelink']")
	WebElement next;

	@FindBy(xpath = "//*[text()='DISC BRAKE (150 CC) - PETROL']")
	WebElement variant;

	@FindBy(xpath="//*[text()='2020']")
	WebElement year;

	@FindBy(className = "md-checkbox")
	List <WebElement> required_Policy_Types;

	@FindBy(className = "md-radio")
	List <WebElement> policyExpirys;

	@FindBy(id="PreviousInsurer_value")
	WebElement previousInsurer;
	
	@FindBy(id = "TPPreviousInsurer")
    WebElement tpPreviousInsurer;
	
	@FindBy(xpath = "//*[text()='BAJAJ ALLIANZ GENERAL INSURANCE CO. LTD.']")
	WebElement bajajInsurance;

	@FindBy(xpath = "//*[@class='custom_btn btn-primary nextbtnstep clk7step ripplelink']")
	WebElement next_7;

	@FindBy(xpath = "//*[@class='md-radio']//label[@class='custom-control-label']")
	List <WebElement> customer_Types;

	@FindBy(name = "txtOrganizationName")
	WebElement organizationName;
	
	@FindBy(xpath = "//*[@for='idExistingPACover1']")
	WebElement paCover1;
    
	@FindBy(xpath = "//*[@ng-model='btnWithoutPA']")
	WebElement btnWithoutPA;
	
	@FindBy(xpath = "//*[text()='Information is accurate']")
	WebElement information_is_accurate;
	
	@FindBy(xpath = "//*[text()='₹ 2,621']") //cp + NE 1,292/tp + NE 1,089/OD 407
	WebElement quotes;    //cp+br 1,402 cp + <90 1,292/ cp + <90 1,339
	
	@FindBy(xpath = "//*[@ng-click='closeModel(true)']")
	WebElement confirm;                                      
	
	@FindBy(xpath = "//span[text()='Modify Quote']")                         
	WebElement modify_Quote;
	
	@FindBy(id = "accordiongroup-9-5832-tab")
	WebElement discount;
	
	
	@FindBy(xpath="//input[@placeholder='Pancard Number']")
	WebElement pancard_number;

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement first_Name;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement last_Name;                               

	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement mobile_Number;                           

	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;

	@FindBy(xpath="//input[@placeholder='Pincode']")
	WebElement pincode;
	
	@FindBy(name = "Gender")
	WebElement gender;

	@FindBy(xpath="//input[@placeholder='Date Of Birth']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	WebElement dateOfBirthNominee;
	
	@FindBy(xpath = "//strong[@class='ng-binding']")
	WebElement monthYear;

	@FindBy(xpath="//button[@class='btn btn-default btn-sm pull-left uib-left']")
	WebElement previousDate;

	@FindBy(xpath="//*[text()='Okay']")
	WebElement kycSuccess;

	@FindBy(xpath="//*[@class='custom_btn btn-primary nextbtnstep donestep ripplelink']")
	WebElement proceed;
    
	@FindBy(name = "ddlSalutation")
	WebElement salutation;

	@FindBy(name = "ddlMaritalStatus")
	WebElement maritalStatus;


	@FindBy(name = "ddlOccupation")
	WebElement occupation;

	@FindBy(xpath="//input[@placeholder='Address 1']")
	WebElement address_1;

	@FindBy(xpath="//input[@placeholder='Address 2']")
	WebElement address_2;
	
	@FindBy(id = "State_value")
	WebElement state;
	
	@FindBy(id = "City_value")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='MAHARASHTRA']")
	WebElement maharashtra;
	
	@FindBy(xpath = "//*[text()='NAGPUR']")
	WebElement nagpur;

	@FindBy(xpath = "//*[@class='custom_btn btn-primary nextbtnstep ripplelink clk2step continu-owner-btn']")
	WebElement Continue_Vehicle_details;

	@FindBy(xpath = "//*[@class='custom_btn btn-primary nextbtnstep ripplelink clk2step continu-owner-btn']")
	WebElement Continue_other_details;

	@FindBy(name = "txtNomineeFullName")
	WebElement nomineeFullName;

	@FindBy(name="ddlNomineeRelation")
	WebElement relations;

	@FindBy(id = "PreviousPolicyNumber")
	WebElement previousPolicyNumber;
	
	@FindBy(name = "TPPreviousPolicyNumber")
	WebElement tpPreviousPolicyNumber;
	
	@FindBy(id = "PreviousInsurerState_value")
	WebElement previousInsurerState_value;
	
//  @FindBy(xpath = "//*[text()='MAHARASHTRA']")
//	WebElement maharashtra_state;
	
	@FindBy(id = "PreviousInsurerCity_value")
	WebElement previousInsurerCity_value;
	
	@FindBy(xpath = "//*[text()='AKOLA']")
	WebElement akola;

	@FindBy(name="txtNomineeGender")//txtNomineeGender
	WebElement nomineeGender;
	
	//@FindAll(value = { @FindBy(xpath = "//input[@type='checkbox']") })
	//List<WebElement> checkboxes;
	
	@FindBy(xpath = "//*[@for='IHearBy']")
	WebElement checkBox;

	@FindBy(xpath = "//*[@class='custom_btn btn-primary nextbtnstep ripplelink clk2step continu-owner-btn']")
	WebElement review;

	@FindBy(xpath = "//div[@class='namestpwpin ng-binding']")
	List<WebElement> registration_year;

	@FindBy(xpath = "//*[text()='Click here to get OTP :']")

	WebElement generate_OTP;

	@FindBy(name="OTP1")
	WebElement otp_1;

	@FindBy(name="OTP2")
	WebElement otp_2;

	@FindBy(name="OTP3")
	WebElement otp_3;

	@FindBy(name="OTP4")
	WebElement otp_4;

	@FindBy(name="OTP5")
	WebElement otp_5;

	@FindBy(xpath = "//button[@class='custom_btn btn-primary nextbtnstep ripplelink clk2step pay-policy-btn mx-auto']")
	WebElement pay_now;
	
	@FindBy(xpath="//*[@placeholder='Vehicle number']")
	WebElement vehicle_number;
	
	@FindBy(xpath="//*[@placeholder='Engine number']")
	WebElement engine_number;
	
	@FindBy(xpath="//*[@placeholder='Chassis number']")
	WebElement chassis_number;
	
	@FindBy(name = "optionsRadiosYes")
	WebElement hypothecationYes;
	
	@FindBy(name = "optionsPUCRadiosYes")
	WebElement  pus_yes;
	
	@FindBy(id = "ddlBank_value")
    WebElement financer_Name;
	
	@FindBy(name = "ddlBankCity")
	WebElement bankCity;
	
	@FindBy(xpath = "//*[@placeholder='PUC Number']")
	WebElement puc_Number;
	
//  @FindBy(className = "uib-datepicker-popup dropdown-menu ng-scope")
//	WebElement currentDate;
          
	@FindBy(xpath = "//*[text()='Skip Login']")
	WebElement skip_login;
	
	
	public TwoWheeler_UAT(WebDriver driver) {
	//	this.driver= driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));                      
	}

	public void make_model() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(click_Here)).click();
		wait.until(ExpectedConditions.visibilityOf(ahmedabad)).click();
		wait.until(ExpectedConditions.visibilityOf(gj_01_Ahmedabad)).click();
		wait.until(ExpectedConditions.visibilityOf(bajaj)).click();

		wait.until(ExpectedConditions.visibilityOf(model_value)).click();
		wait.until(ExpectedConditions.visibilityOf(model_value)).sendKeys("DISCOVER 150");
		Thread.sleep(500);
		selectElementfromInputDropdown(driver,discover_150);
		wait.until(ExpectedConditions.visibilityOf(next)).click();
		wait.until(ExpectedConditions.visibilityOf(variant)).click();

		wait.until(ExpectedConditions.visibilityOf(year)).click();

	}

	public void required_Policy_Type() {
		int index = 1;
		for (WebElement required_Policy_Type : required_Policy_Types) {
			if(index==1) {
				required_Policy_Type.click();
			}
			index++;
		}
	}

	public void previous_Expiry_Status() {
		int index= 1;
		for (WebElement policyExpiry : policyExpirys) {
			if(index==1) {
				policyExpiry.click();
			}
			index++;
		}
	}

	public void previousInsurer_value() {
		previousInsurer.click();
		selectElementfromInputDropdown(driver, wait.until(ExpectedConditions.visibilityOf(bajajInsurance)));
		wait.until(ExpectedConditions.visibilityOf(next_7)).click();
	}

	public void customer_types(String name) {
		int index=1;
		for (WebElement customerType: customer_Types) {
			if(index==1) {
				customerType.click();

				sendtext(organizationName, name );
			}
			index++;
		}
		
	}
	
	public void pA_Owner() {
		  
	//	wait.until(ExpectedConditions.visibilityOf(paCover1)).click();
		
	//	wait.until(ExpectedConditions.visibilityOf(btnWithoutPA)).click();
		try {
			
		//	selectFromDropDown(wait.until(ExpectedConditions.visibilityOf(tpPreviousInsurer)));
			wait.until(ExpectedConditions.visibilityOf(information_is_accurate)).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	public void modifyQuotes() {
     //	wait.until(ExpectedConditions.visibilityOf(modify_Quote)).click();
	}
	
	public void selectQuotes() {
		
		wait.until(ExpectedConditions.visibilityOf(quotes)).click();
	//	wait.until(ExpectedConditions.visibilityOf(discount)).click();
		try {
			
		wait.until(ExpectedConditions.visibilityOf(confirm)).click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void pan_card_Kyc(String panNum,String fname,String lname,String mob,String emailId,String pin_code) throws Exception {
		Thread.sleep(500);
		sendtext(pancard_number,panNum);
		sendtext(first_Name,fname );
		sendtext(last_Name,lname);
		sendtext(mobile_Number, generateRandomMobileNumber());
		sendtext(email, emailId);
		sendtext(pincode,pin_code);
		selectFromDropDown(gender);
	}
	
	public void selectdateOfBirth(String bYear,String bmonth,String date  ) {

		wait.until(ExpectedConditions.visibilityOf(dateOfBirth)).click();
		wait.until(ExpectedConditions.visibilityOf(monthYear)).click();	

		while(true) {                            
			wait.until(ExpectedConditions.visibilityOf(previousDate)).click();
			String fulltext = monthYear.getText();

			if(fulltext.equals(bYear)) {
				driver.findElement(By.xpath("//span[text()='"+bmonth+"']")).click();
				driver.findElement(By.xpath("//span[text()='"+date+"']")).click();
				proceed.click();
				wait.until(ExpectedConditions.visibilityOf(kycSuccess)).click(); 			  
				break;
			}
		}

	}
	
	public void owner_details(String address_one,String address_two, String pin_code, 
			String mobile_no, String email_id, String stateName, String cityName ) throws Exception {

		selectFromDropDown(salutation);
		selectFromDropDown(maritalStatus);
		selectFromDropDown(occupation);
		selectFromDropDown(gender);
		sendtext(address_1, address_one);
		sendtext(address_2, address_two);
		sendtext(pincode, pin_code);
		sendtext(mobile_Number, generateRandomMobileNumber());
		sendtext(email, email_id);
		sendtext(state, stateName);
		selectElementfromInputDropdown(driver,wait.until(ExpectedConditions.visibilityOf(maharashtra)));
		Thread.sleep(1000);
		sendtext(city, cityName);
		selectElementfromInputDropdown(driver,wait.until(ExpectedConditions.visibilityOf(nagpur)));
		wait.until(ExpectedConditions.visibilityOf(Continue_Vehicle_details)).click();

	}
	
	public void vehicle_Details(String vehicle_no,String engine_no, String chassis_no) {
		
		sendtext(vehicle_number, generateRandomVehicleNumber());
		sendtext(engine_number, engine_no);
		sendtext(chassis_number, chassis_no);
		
		wait.until(ExpectedConditions.visibilityOf(Continue_other_details)).click();
	}
	
	public void other_Details(String nominee_Name, String Previous_Policy_Number,String previousInsurerState,String previousInsurercity, String previous_PolicyNumber ) {
		selectFromDropDown(wait.until(ExpectedConditions.visibilityOf(relations)));
		selectFromDropDown(wait.until(ExpectedConditions.visibilityOf(nomineeGender)));
		sendtext(nomineeFullName, generateRandomName());
		sendtext(previousPolicyNumber, Previous_Policy_Number);
		sendtext(previousInsurerState_value, previousInsurerState);
		selectElementfromInputDropdown(driver, wait.until(ExpectedConditions.visibilityOf(maharashtra)));
		sendtext(previousInsurerCity_value, previousInsurercity);
		selectElementfromInputDropdown(driver, wait.until(ExpectedConditions.visibilityOf(akola)));
		try {
			sendtext(tpPreviousPolicyNumber, previous_PolicyNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 

	public void SelectNomineeDateOfBirth(String bYear,String bmonth,String date) {

		wait.until(ExpectedConditions.visibilityOf(dateOfBirthNominee)).click();
		wait.until(ExpectedConditions.visibilityOf(monthYear)).click();	

		while(true) {                            
			wait.until(ExpectedConditions.visibilityOf(previousDate)).click();
			String fulltext = monthYear.getText();

			if(fulltext.equals(bYear)) {
				driver.findElement(By.xpath("//span[text()='"+bmonth+"']")).click();
				driver.findElement(By.xpath("//span[text()='"+date+"']")).click();
				break;
			}
		}
	}

	public void checkBoxes() {
       wait.until(ExpectedConditions.visibilityOf(checkBox)).click();
       
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", review);
		
		//	wait.until(ExpectedConditions.visibilityOf(generate_OTP)).click();
       wait.until(ExpectedConditions.visibilityOf(skip_login)).click();
	}
	
	public void skip_Login() {
	}

	public void enter_otp(String otp1, String otp2, String otp3, String otp4, String otp5) {

		sendtext(otp_1, otp1);
		sendtext(otp_2, otp2);
		sendtext(otp_3, otp3);
		sendtext(otp_4, otp4);
		sendtext(otp_5, otp5);

		wait.until(ExpectedConditions.visibilityOf(pay_now)).click();
	}
	
	
}
