package com.kony.appiumTests.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kony.appiumTests.forms.FrmHome;

public class FrmHomeTests extends BaseTest{

	public static RemoteWebDriver driver;
	FrmHome frmObj;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.out.println("In setup FrmHomeTests");
		driver = BaseTest.getDriver();
		frmObj = new FrmHome(driver);
	}
	
	@AfterMethod
	public void navigateBackToHome() throws InterruptedException {
		if(frmObj.back_btn.isDisplayed()) {
			frmObj.back_btn.click();
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void testNavigationToUIInterfaceForm() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}
	
	@Test
	public void testNavigationToAnimationsForm() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}
	
	@Test
	public void testNavigationToDeviceFeaturesForm() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm1() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm1() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm1() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm2() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm2() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm2() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}
	@Test
	public void testNavigationToUIInterfaceForm3() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm3() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm3() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm4() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm4() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm4() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}
	@Test
	public void testNavigationToUIInterfaceForm5() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm5() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm5() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm10() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm10() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm10() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm6() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm6() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm6() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm7() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm7() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm7() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}


	@Test
	public void testNavigationToUIInterfaceForm8() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm8() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm8() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

	@Test
	public void testNavigationToUIInterfaceForm9() {
		frmObj.navigateToUIInterfaceForm();
		assertEquals(frmObj.isNavigatedToUIInterfaceForm(), true);
	}

	@Test
	public void testNavigationToAnimationsForm9() throws InterruptedException {
		frmObj.navigateToAnimationForm();
		assertEquals(frmObj.isNavigatedToAnimationsForm(),true);
	}

	@Test
	public void testNavigationToDeviceFeaturesForm9() {
		frmObj.navigateToDeviceFeaturesForm();
		assertEquals(frmObj.isNavigatedToDeviceFeaturesForm(), true);
	}

}
