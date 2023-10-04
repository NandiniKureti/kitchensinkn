package com.kony.appiumTests.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kony.appiumTests.forms.FrmHome;
import com.kony.appiumTests.forms.FrmUserInterface;

public class FrmuserInterfaceTests extends BaseTest{
	public static RemoteWebDriver driver;
	FrmUserInterface frmObj;
	
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("In setup FrmUserInterfaceTests");
		driver = BaseTest.getDriver();
		frmObj = new FrmUserInterface(driver);
		FrmHome frmhome = new FrmHome(driver);
		if(frmhome.txt_ui_interface.isDisplayed()) {
			frmhome.navigateToUIInterfaceForm();
		}
	}
		
	@AfterMethod
	public void navigateBackToUIForm() throws InterruptedException {
		if(frmObj.back_btn.isDisplayed()) {
			frmObj.back_btn.click();
		}
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void navigateBackToHomePage() throws InterruptedException {
		if(frmObj.back_btn.isDisplayed()) {
			frmObj.back_btn.click();
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void testNavigationToContainerWidgetsForm() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}
	
	@Test
	public void testNavigationToAdvancedwidgetsForm() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}
	
	@Test
	public void testNavigationToBasicWidgetsForm() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}
	
	@Test
	public void testNavigationToFlexLayoutForm() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm1() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm1() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm1() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm1() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm2() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm2() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm2() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm2() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm3() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm3() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm3() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm3() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm4() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm4() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm4() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm4() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm5() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm5() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm5() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm5() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm6() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm6() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm6() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm6() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm7() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm7() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm7() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm7() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm8() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm8() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm8() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm8() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

	@Test
	public void testNavigationToContainerWidgetsForm9() {
		frmObj.navigateToContainerWidgetsForm();
		assertEquals(frmObj.isNavigatedToContainerWidgetsForm(), true);
	}

	@Test
	public void testNavigationToAdvancedwidgetsForm9() throws InterruptedException {
		Thread.sleep(2000);
		frmObj.navigateToAdvancedWidgetsForm();
		assertEquals(frmObj.isNavigatedToAdvancedWidgetsForm(),true);
	}

	@Test
	public void testNavigationToBasicWidgetsForm9() {
		frmObj.navigateToBasicWidgetsForm();
		assertEquals(frmObj.isNavigatedToBasicWidgetsForm(), true);
	}

	@Test
	public void testNavigationToFlexLayoutForm9() throws InterruptedException {
		frmObj.navigateToFlexLayoutForm();
		Thread.sleep(2000);
		assertEquals(frmObj.isNavigatedToFlexLayoutForm(), true);
	}

}
