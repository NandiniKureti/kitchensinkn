package com.kony.appiumTests.tests;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
	public static String platformName;
	public static AndroidDriver<WebElement> androiddriver;
	public static IOSDriver<WebElement> iosdriver;
	public static RemoteWebDriver driver;

	@BeforeSuite
	public void beforeSuite() throws Exception {

		System.out.println("initializing is starting..........");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("noReset", true);
		
		  /*capabilities.setCapability("deviceName", "4d0066d74f5a3101");
		  capabilities.setCapability("platformVersion", "6.0.1");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("appPackage", "com.kony.KitchenSinkMVC");
		  capabilities.setCapability("appActivity",
		  "com.kony.KitchenSinkMVC.KitchenSinkMVC");*/
		 
        if(System.getenv("DEVICEFARM_DEVICE_PLATFORM_NAME") != null) {
			if ("Android".equalsIgnoreCase(System.getenv("DEVICEFARM_DEVICE_PLATFORM_NAME"))) {
				androiddriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				driver = androiddriver;
				System.out.println("Driver is initialized succesfuly for Android platform.....");
			} else {
				capabilities.setCapability("automationName", "XCUITest");
				iosdriver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				driver = iosdriver;
				System.out.println("Driver is initialized succesfuly for iOS platform.....");
			}
		}
		if (driver == null) {
			if (iosdriver == null) {
				iosdriver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			}

			System.out.println("Getting platform name from capabilities.........."
					+ iosdriver.getCapabilities().getPlatform().toString());
			/**
			 * getPlatform() is used to know the platform on which the app is running
			 */
			platformName = iosdriver.getCapabilities().getPlatform().toString();

			if ("MAC".equalsIgnoreCase(platformName)) {
				System.out.println("Inside platform MAC............");
				driver = iosdriver;
			} else {
				if (driver != null) {
					driver.quit();
					driver = null;
				}
				if (androiddriver != null) {
					androiddriver.quit();
					androiddriver = null;
				}
				if (iosdriver != null) {
					iosdriver.quit();
					iosdriver = null;
				}

				System.out.println("Inside platform ANDROID............");
				androiddriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				driver = androiddriver;
			}
		}
	}

	@AfterSuite
	public void tearDownAppium() {
		if (driver != null)
			driver.quit();
		if (androiddriver != null)
			androiddriver.quit();
		if (iosdriver != null)
			iosdriver.quit();
	}

	public static RemoteWebDriver getDriver() {
		return driver;
	}
}
