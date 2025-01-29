package org.steplogics;

import java.util.List;
import java.util.Map;

import org.helper.ReUsableClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojopack.AccountCreatePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionBusiness extends ReUsableClass {

	public  AccountCreatePojo ac ;

@Given("I am on the home page of the luma application through chrome browser")
public void i_am_on_the_home_page_of_the_luma_application_through_chrome_browser() throws InterruptedException {
   browserOpen();
   urlLoad("https://magento.softwaretestingboard.com/");
   Thread.sleep(5000);
}


@When("I Enter Valid datas in Register form")
public void i_Enter_Valid_datas_in_Register_form(io.cucumber.datatable.DataTable d) {
    ac = new AccountCreatePojo();
   WebElement acClick = ac.getAccountCreateOptionClick();
   javaScriptClick(acClick);
   
   Map<String, String> allDatas = d.asMap(String.class, String.class);
   
   
   String firstNameValue  = allDatas.get("firstName");
   javaScriptsendKeys(ac.getFirstNameBox(), firstNameValue);
 
   
   String lastName  = allDatas.get("lastName");
   javaScriptsendKeys(ac.getLastNameBox(), lastName);
   
   String emailData  = allDatas.get("emailId");
   javaScriptsendKeys(ac.getEmailbox(), emailData);
   
   String passData  = allDatas.get("passValue");
   javaScriptsendKeys(ac.getPassBox(), passData);
   
   String confirmData  = allDatas.get("ConfirmPass");
   javaScriptsendKeys(ac.getConfirmPassBox(), confirmData);
   
 
   
   
}
@When("I Click the Create on Account button")
public void i_Click_the_Create_on_Account_button() {
	ac = new AccountCreatePojo();
	WebElement btn = ac.getCreabuttonClick();
	javaScriptClick(btn);
}

@Then("I should see a confirmation message Account created")
public void i_should_see_a_confirmation_message_Account_created() {
    System.out.println("Confirmation Account Created ");
}

@Then("I redirect to  the login page")
public void i_redirect_to_the_login_page() {
    driver.findElement(By.xpath("//*[text()='Sign Out')")).click();
   
}

@Then("I enter username and password click to login")
public void i_enter_username_and_password_click_to_login() {
   ac = new AccountCreatePojo();
   javaScriptClick(ac.getSignOptionClick());
   javaScriptsendKeys(ac.getEmailIdValueEnter(), "natarajan.sakthivel13@gmail.com");
   javaScriptsendKeys(ac.getPassIdValueEnter(), "Natraj@13@");
   javaScriptClick(ac.getSigInButtonClick());
   
}


}
