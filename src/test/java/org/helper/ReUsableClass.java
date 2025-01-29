package org.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUsableClass {

	
	public static WebDriver driver; 
	
	
	public static void javaScriptsendKeys(WebElement ele , String scriptValue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value','"+scriptValue+"')", ele);
	}
	
	
	public static void javaScriptClick(WebElement eleClick) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", eleClick);
	}
	
	public static  void browserOpen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void urlLoad(String urlValue) {
	driver.get(urlValue);

	}
	
	
	
	public static void textSendkeys(WebElement ele , String textValue) {
		ele.sendKeys(textValue);
	}
	
	public static  void clickButton(WebElement ele ) {
		ele.click();
	}
	
	
	
	
}
