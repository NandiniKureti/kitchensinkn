package com.kony.appiumTests.forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FrmUserInterface extends BaseConfig{
	
	public RemoteWebDriver driver;

	@iOSFindBy(id = "Container Widgets")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Container Widgets')]")
	public WebElement container_widgets;

	@iOSFindBy(id = "Basic Widgets")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Basic Widgets')]")
	public WebElement basic_widgets;

	@iOSFindBy(id = "Advanced Widgets")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Advanced Widgets')]")
	public WebElement advanced_widgets;

	@iOSFindBy(id = "Flex Layout")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Flex Layout')]")
	public WebElement flex_layout;
	
	@iOSFindBy(id = "Scroll Container")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Scroll Container')]")
	public WebElement scrollCtnInContainerForm;
	
	@iOSFindBy(id = "CheckBoxGroup")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'CheckBoxGroup')]")
	public WebElement checkBoxGroupInBasicForm;
	
	@iOSFindBy(id = "Picker view")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Picker view')]")
	public WebElement pickerViewInAdvancedForm;
	
	@iOSFindBy(id = "First Name : Mark")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'First Name : Mark')]")
	public WebElement firstNameInFlexForm;
	
	@iOSFindBy(id = "Back")
	@AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[1]")
	public WebElement back_btn;

	public FrmUserInterface(RemoteWebDriver driver) {
		super(driver);
	}
	
	public void navigateToContainerWidgetsForm() {
		this.container_widgets.click();
	}

	public void navigateToAdvancedWidgetsForm() {
		this.advanced_widgets.click();
	}

	public void navigateToBasicWidgetsForm() {
		this.basic_widgets.click();
	}

	public void navigateToFlexLayoutForm() {
		this.flex_layout.click();
	}

	public boolean isNavigatedToContainerWidgetsForm() {
		return this.scrollCtnInContainerForm.isDisplayed();
	}

	public boolean isNavigatedToAdvancedWidgetsForm() {
		return this.pickerViewInAdvancedForm.isDisplayed();
	}

	public boolean isNavigatedToBasicWidgetsForm() {
		return this.checkBoxGroupInBasicForm.isDisplayed();
	}
	
	public boolean isNavigatedToFlexLayoutForm() {
		return this.firstNameInFlexForm.isDisplayed();
	}
}
