package com.kony.appiumTests.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kony.appiumTests.forms.FrmDeviceFeatures;
import com.kony.appiumTests.forms.FrmHome;

public class FrmdeviceFeaturesTests extends BaseTest {
	
	public static RemoteWebDriver driver;
	FrmDeviceFeatures frmObj;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.out.println("In setup FrmDeviceFeaturesTests");
		driver = BaseTest.getDriver();
		frmObj = new FrmDeviceFeatures(driver);
		FrmHome frmhome = new FrmHome(driver);
		frmhome.navigateToDeviceFeaturesForm();
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		FrmHome frmhome = new FrmHome(driver);
		frmhome.navigateToDeviceFeaturesForm();
	}
	
	
	@AfterMethod
	public void navigateBackToUIForm() throws InterruptedException {
		if(frmObj.back_btn.isDisplayed()) {
			frmObj.back_btn.click();
		}
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void navigateBackToHomePage() throws InterruptedException {
		if(frmObj.back_btn.isDisplayed()) {
			frmObj.back_btn.click();
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void testNavigationToAccelerometerForm() {
		frmObj.navigateToAccelerometerForm();
		assertEquals(frmObj.isNavigatedToAccelerometerForm(), true);
	}
	
	@Test
	public void testNavigationToCameraForm() {
		frmObj.navigateToCameraForm();;
		assertEquals(frmObj.isNavigatedToCameraForm(), true);
	}
	
	@Test
	public void testNavigationToEmailForm() {
		frmObj.navigateToEmailForm();
		assertEquals(frmObj.isNavigatedToEmailForm(), true);
	}
	
	@Test
	public void testNavigationToAddressBookForm() {
		frmObj.navigateToAddressBookForm();;
		assertEquals(frmObj.isNavigatedToAddressBookForm(), true);
	}
	
	@Test
	public void testNavigationToDeviceInfoForm() {
		frmObj.navigateToDeviceInfoForm();
		assertEquals(frmObj.isNavigatedToDeviceInfoForm(), true);
	}
	
	@Test
	public void testNavigationToLocalStorageForm() {
		frmObj.navigateToLocalStorageForm();
		assertEquals(frmObj.isNavigatedToLocalStorageForm(), true);
	}
	
	@Test
	public void testNavigationToWebSQLForm() {
		frmObj.navigateToWebSQLForm();
		assertEquals(frmObj.isNavigatedToWebSQLForm(), true);
	}
	
	@Test
	public void testNavigationToCryptoForm() {
		frmObj.navigateToCryptoLibrariesForm();
		assertEquals(frmObj.isNavigatedToCryptoLibrariesForm(), true);
	}

	@Test
	public void testNavigationToAccelerometerForm1() {
		frmObj.navigateToAccelerometerForm();
		assertEquals(frmObj.isNavigatedToAccelerometerForm(), true);
	}

	@Test
	public void testNavigationToCameraForm1() {
		frmObj.navigateToCameraForm();;
		assertEquals(frmObj.isNavigatedToCameraForm(), true);
	}

	@Test
	public void testNavigationToEmailForm1() {
		frmObj.navigateToEmailForm();
		assertEquals(frmObj.isNavigatedToEmailForm(), true);
	}

	@Test
	public void testNavigationToAddressBookForm1() {
		frmObj.navigateToAddressBookForm();;
		assertEquals(frmObj.isNavigatedToAddressBookForm(), true);
	}

	@Test
	public void testNavigationToDeviceInfoForm1() {
		frmObj.navigateToDeviceInfoForm();
		assertEquals(frmObj.isNavigatedToDeviceInfoForm(), true);
	}

	@Test
	public void testNavigationToLocalStorageForm1() {
		frmObj.navigateToLocalStorageForm();
		assertEquals(frmObj.isNavigatedToLocalStorageForm(), true);
	}

	@Test
	public void testNavigationToWebSQLForm1() {
		frmObj.navigateToWebSQLForm();
		assertEquals(frmObj.isNavigatedToWebSQLForm(), true);
	}

	@Test
	public void testNavigationToCryptoForm1() {
		frmObj.navigateToCryptoLibrariesForm();
		assertEquals(frmObj.isNavigatedToCryptoLibrariesForm(), true);
	}

	@Test
	public void testNavigationToAccelerometerForm2() {
		frmObj.navigateToAccelerometerForm();
		assertEquals(frmObj.isNavigatedToAccelerometerForm(), true);
	}

	@Test
	public void testNavigationToCameraForm2() {
		frmObj.navigateToCameraForm();;
		assertEquals(frmObj.isNavigatedToCameraForm(), true);
	}

	@Test
	public void testNavigationToEmailForm2() {
		frmObj.navigateToEmailForm();
		assertEquals(frmObj.isNavigatedToEmailForm(), true);
	}

	@Test
	public void testNavigationToAddressBookForm2() {
		frmObj.navigateToAddressBookForm();;
		assertEquals(frmObj.isNavigatedToAddressBookForm(), true);
	}

	@Test
	public void testNavigationToDeviceInfoForm2() {
		frmObj.navigateToDeviceInfoForm();
		assertEquals(frmObj.isNavigatedToDeviceInfoForm(), true);
	}

	@Test
	public void testNavigationToLocalStorageForm2() {
		frmObj.navigateToLocalStorageForm();
		assertEquals(frmObj.isNavigatedToLocalStorageForm(), true);
	}

	@Test
	public void testNavigationToWebSQLForm2() {
		frmObj.navigateToWebSQLForm();
		assertEquals(frmObj.isNavigatedToWebSQLForm(), true);
	}

	@Test
	public void testNavigationToCryptoForm2() {
		frmObj.navigateToCryptoLibrariesForm();
		assertEquals(frmObj.isNavigatedToCryptoLibrariesForm(), true);
	}


	@Test
	public void testNavigationToAccelerometerForm3() {
		frmObj.navigateToAccelerometerForm();
		assertEquals(frmObj.isNavigatedToAccelerometerForm(), true);
	}

	@Test
	public void testNavigationToCameraForm3() {
		frmObj.navigateToCameraForm();;
		assertEquals(frmObj.isNavigatedToCameraForm(), true);
	}

	@Test
	public void testNavigationToEmailForm3() {
		frmObj.navigateToEmailForm();
		assertEquals(frmObj.isNavigatedToEmailForm(), true);
	}

	@Test
	public void testNavigationToAddressBookForm3() {
		frmObj.navigateToAddressBookForm();;
		assertEquals(frmObj.isNavigatedToAddressBookForm(), true);
	}

	@Test
	public void testNavigationToDeviceInfoForm3() {
		frmObj.navigateToDeviceInfoForm();
		assertEquals(frmObj.isNavigatedToDeviceInfoForm(), true);
	}

	@Test
	public void testNavigationToLocalStorageForm3() {
		frmObj.navigateToLocalStorageForm();
		assertEquals(frmObj.isNavigatedToLocalStorageForm(), true);
	}

	@Test
	public void testNavigationToWebSQLForm3() {
		frmObj.navigateToWebSQLForm();
		assertEquals(frmObj.isNavigatedToWebSQLForm(), true);
	}

	@Test
	public void testNavigationToCryptoForm3() {
		frmObj.navigateToCryptoLibrariesForm();
		assertEquals(frmObj.isNavigatedToCryptoLibrariesForm(), true);
	}

	@Test
	public void testNavigationToAccelerometerForm4() {
		frmObj.navigateToAccelerometerForm();
		assertEquals(frmObj.isNavigatedToAccelerometerForm(), true);
	}

	@Test
	public void testNavigationToCameraForm4() {
		frmObj.navigateToCameraForm();;
		assertEquals(frmObj.isNavigatedToCameraForm(), true);
	}

	@Test
	public void testNavigationToEmailForm4() {
		frmObj.navigateToEmailForm();
		assertEquals(frmObj.isNavigatedToEmailForm(), true);
	}

	@Test
	public void testNavigationToAddressBookForm4() {
		frmObj.navigateToAddressBookForm();;
		assertEquals(frmObj.isNavigatedToAddressBookForm(), true);
	}

	@Test
	public void testNavigationToDeviceInfoForm4() {
		frmObj.navigateToDeviceInfoForm();
		assertEquals(frmObj.isNavigatedToDeviceInfoForm(), true);
	}

	@Test
	public void testNavigationToLocalStorageForm4() {
		frmObj.navigateToLocalStorageForm();
		assertEquals(frmObj.isNavigatedToLocalStorageForm(), true);
	}

	@Test
	public void testNavigationToWebSQLForm4() {
		frmObj.navigateToWebSQLForm();
		assertEquals(frmObj.isNavigatedToWebSQLForm(), true);
	}

	@Test
	public void testNavigationToCryptoForm4() {
		frmObj.navigateToCryptoLibrariesForm();
		assertEquals(frmObj.isNavigatedToCryptoLibrariesForm(), true);
	}
}
