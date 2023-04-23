package practice.automation.RSHAA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Emergency_Case_Conversion {
	
	private WebDriver driver;

	@Test
	private void rashaaTest() {
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions chrome1 = new ChromeOptions(); // adding for new chrome version
		chrome1.addArguments("--remote-allow-origins=*"); // adding for new chrome version
		driver = new ChromeDriver(chrome1);

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		driver.get("http://103.203.136.254:8080/main/emergency/case-cnvrsn");

		// select admission type
		WebElement tid = driver.findElement(By.xpath("//input[@placeholder='TID']"));
		tid.click();

		/*
		 * WebElement janAdhaarIdYes = driver.findElement(By.id("have_Jan_Aadhar_1"));
		 * janAdhaarIdYes.click();
		 */
		
		WebElement janAdhaarIdNo = driver.findElement(By.xpath("//input[@id='have_Jan_Aadhar_2']"));
		janAdhaarIdNo.click();
		
//If JanAdhaar Status is 'No' then run this block
		WebElement tid1 = driver.findElement(By.id("txtTID"));
		tid1.click();
		sleep(10);
		//select gender
		WebElement genderMale = driver.findElement(By.xpath("//input[@id='no_have_Jan_Aadhar_1']"));
		genderMale.click();
		
		/*
		 * WebElement genderFemale =
		 * driver.findElement(By.xpath("//input[@id='no_have_Jan_Aadhar_2']"));
		 * WebElement genderOther =
		 * driver.findElement(By.xpath("//input[@id='no_have_Jan_Aadhar_3']"));
		 */
		
		//Registered Mob No
		WebElement registeredMobNo = driver.findElement(By.id("txtMob"));
		registeredMobNo.sendKeys("1234567890");
		registeredMobNo.click();
		
		//patient Address
		WebElement patientAddress = driver.findElement(By.xpath("//div[@class='col-md-7']/textarea[@class='form-control']"));
		patientAddress.sendKeys("Mansorovar, Jaipur");
		
		sleep(10);
		//colony/Street
		WebElement colonyStreet = driver.findElement(By.xpath("//label[contains(text(),'Colony / Street')]/parent::div/following-sibling::div/input"));
		colonyStreet.sendKeys("Mansorovar Matro Lane");
				
		//Gram Panchayat
		WebElement gramPanchayat = driver.findElement(By.xpath("//label[contains(text(),'Colony / Street')]/parent::div/following-sibling::div/input"));
		//label[contains(text(),' Gram Panchayat')]/parent::div/following-sibling::div/input
		gramPanchayat.sendKeys("Mansorovar");
				
		//Tehsil
		WebElement tehsil = driver.findElement(By.id("txtTehsil"));
		tehsil.sendKeys("mnsrv");
		
		//Residence District
		WebElement residenceDistrict = driver.findElement(By.id("ddResidenceDistrict"));
				
		//Patient Name
		WebElement patientName = driver.findElement(By.id("txtName"));
		patientName.sendKeys("Ashok Roy");
		
		//Patient Age
		WebElement patientAge = driver.findElement(By.id("txtAge"));
		patientAge.sendKeys("45");
				
		//Incident District
		WebElement incidentDistrict = driver.findElement(By.id("ddIncidenceDistrict"));
		
		
		//House Number 
		WebElement houseNumber = driver.findElement(By.xpath("//label[contains(text(), 'House Number' )]/parent::div/following-sibling::div/input"));
		houseNumber.sendKeys("98765-456");
		
		//Bolck / Ward
		WebElement blockWard = driver.findElement(By.id("txtWardNo"));
		blockWard.sendKeys("Mansorovar");
		
		//Village
		WebElement village = driver.findElement(By.id("txtVillage"));
		village.sendKeys("Mansorovar");
		
		//Residence State 
		WebElement residenceState = driver.findElement(By.id("ddResidenceState"));
				
		//Pin Code
		WebElement pinCode = driver.findElement(By.id("txtPin"));
		pinCode.sendKeys("723398");
		
				//Verify using --->Biometric
		WebElement verifyUsingBiometric = driver.findElement(By.xpath("//label[contains(text(),' Biometric ')]"));
		//verifyUsingBiometric.click();
		
			//execute this block	
				//Aadhaar Id
				WebElement aadhaarId = driver.findElement(By.id("txtPin"));
				aadhaarId.sendKeys("908734567800");
				
				//Upload Instant Approval Document
				WebElement approvalDocument = driver.findElement(By.xpath("//label[contains(text(),' Upload Instant Approval Document ')]/parent::div/input"));
				//approvalDocument.click();
				sleep(10);
				approvalDocument.sendKeys("C:\\Users\\ZW932WB\\OneDrive - EY\\Documents\\Automation-Upload Instant Approval Document.pdf");
				
				
				//Click Upload Button
				WebElement uploadbutton = driver.findElement(By.xpath("//div[3]/div[@class='col-sm-12 d-flex mb-3']/div[@class='col-sm-1']/button[contains(text(),'Upload')]"));
				uploadbutton.click();
		         
				
				
				/*
				 * //Verify using --->MOIC WebElement verifyUsingMOC = driver.findElement(By.
				 * xpath("//div[@class='col-sm-6']/label[contains(text(),' MOIC ')]"));
				 * verifyUsingMOC.click();
				 */
				


		
		
		
		
		

				/*
				 * WebElement searchBtn =
				 * driver.findElement(By.xpath("//button[@class='color_001 text_color_001 btn']"
				 * )); searchBtn.click();
				 * 
				 * WebElement identityType = driver.findElement(By.id("ddlIdentityType"));
				 * identityType.click(); WebElement uniqueIdentifierNumber =
				 * driver.findElement(By.id("txtuid")); uniqueIdentifierNumber.click();
				 * WebElement searchBeneficiaryBtn = driver.findElement(By.id("txtuid"));
				 * searchBeneficiaryBtn.click();
				 */

		sleep(3000);
		driver.close();


}
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
