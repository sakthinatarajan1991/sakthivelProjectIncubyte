package org.pojopack;

import org.helper.ReUsableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatePojo extends ReUsableClass {

	public AccountCreatePojo() {
		PageFactory.initElements(driver,this );
	}
	
	
	@FindBy(xpath = "(//a[text()='Create an Account'])[2]")
	private WebElement accountCreateOptionClick;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameBox;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameBox;
	
	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement emailbox;
	
	@FindBy(xpath = "//input[@title='Password']")
	private WebElement passBox;
	
	@FindBy(xpath = "//input[@name='password_confirmation']")
	private WebElement confirmPassBox;

	@FindBy(xpath = "//button[@class='action submit primary']")
	private WebElement creabuttonClick;

	
	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	private WebElement signOptionClick;

	@FindBy(xpath = "//input[@title='Email']")
	private WebElement emailIdValueEnter;

	@FindBy(xpath = "//input[@title='Password']")
	private WebElement passIdValueEnter;
	
	@FindBy(xpath = "//button[@class='action login primary']")
	private WebElement sigInButtonClick;
	
	
	
	
	
	
	
	
	public WebElement getSignOptionClick() {
		return signOptionClick;
	}

	public WebElement getSigInButtonClick() {
		return sigInButtonClick;
	}

	public WebElement getEmailIdValueEnter() {
		return emailIdValueEnter;
	}

	public WebElement getPassIdValueEnter() {
		return passIdValueEnter;
	}

	

	public WebElement getAccountCreateOptionClick() {
		return accountCreateOptionClick;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getLastNameBox() {
		return lastNameBox;
	}

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getConfirmPassBox() {
		return confirmPassBox;
	}

	public WebElement getCreabuttonClick() {
		return creabuttonClick;
	}
	
	
	
	
}
