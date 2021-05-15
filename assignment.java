package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); //to setup the driver path
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); //to open the URL
		driver.manage().window().maximize(); //to maximize the window
		driver.findElementById("username").sendKeys("DemoSalesManager");//to interact and interact with the Webelement in a single line
		WebElement PASSWORD = driver.findElementById("password"); //To locate the Webelement
		PASSWORD.sendKeys ("crmsfa"); 
		Thread.sleep(3000);
		WebElement LOGIN = driver.findElementByClassName("decorativeSubmit");
		LOGIN.click(); //To click on a web element
		System.out.println ("The title is: " + driver.getTitle());//to get the title of the webpage
		
		if (driver.getTitle().contains("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("The title is present");
		}
		else {
				System.out.println("The title is not present");
			}
		driver.findElementByLinkText("CRM/SFA").click();//to find the anchor tag and click on the hyperlink
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Assignment");
		driver.findElementById("createLeadForm_firstName").sendKeys("Walkie");
		driver.findElementById("createLeadForm_lastName").sendKeys("talkie");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("LCLName");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("LastlclName");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_departmentName").sendKeys("EEE");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000000");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("202");
		driver.findElementById("createLeadForm_sicCode").sendKeys("1234");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TST");
		driver.findElementById("createLeadForm_description").sendKeys("Descriptive Lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("first note for the team");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8055187039");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("007");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("21");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test.123@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Madhu");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftop.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Sriram");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Dexter");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Add1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Add2");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("007");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("01");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown1 =  new Select (Source);
		dropDown1.selectByValue("LEAD_COLDCALL");	
		WebElement MarkCamp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown =  new Select (MarkCamp);
		dropDown.selectByValue("CATRQ_AUTOMOBILE");	
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");//Create object for the parent
		Select dropDown2 =  new Select (Industry); //Create select class and pass the parent element
		dropDown2.selectByValue("IND_HEALTH_CARE"); //selectByIndex or SelectByVisibleText can be used
		WebElement CCY = driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown3 =  new Select (CCY);
		dropDown3.selectByValue("AZM");
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown4 =  new Select (Ownership);
		dropDown4.selectByValue("OWN_PARTNERSHIP");
		WebElement State = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropDown5 =  new Select (State);
		dropDown5.selectByValue("AE");
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown6 =  new Select (Country);
		dropDown6.selectByValue("USA");
		driver.findElementById("createLeadForm_birthDate").sendKeys("21/05/21");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.close();
	}
//	
}
