package stepspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import pages.BackgroundPage;
import pages.TestBase;

public class BackgroundStepDefinition extends TestBase {
	BackgroundPage backgroundPage;
	//this Before is diff from the Junit one, it's cucumber specific
	
	@Before
	public void methodName()
	{
		initDriver();
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}
	
	@Given("I want to find the Set SkyBlue Background button")
	public void I_want_to_find_the_Set_SkyBlue_Background_button() {
		driver.get("https://techfios.com/test/101/");
	}
	@When("I click on the blue button")
	public void I_click_on_the_blue_button() {
	driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();	
	}
	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		
		  boolean isBlueElementEnabled = driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isEnabled();
		  Assert.assertTrue(isBlueElementEnabled);
		 
		
		  
	}
	
	//Scenario: Sky White Background
	//Given I want to find the Set SkyWhite Background button
	//When I click on the button
	//Then the background color will change to sky blue
	
	@Given("I want to find the Set SkyWhite Background button")
	public void I_want_to_find_the_Set_SkyWhite_Background_button() {
		driver.get("https://techfios.com/test/101/");
	}
	@When("I click on the white button")
	public void I_click_on_the_white_button() {
	driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();	
	}
	
	@Then("the background color will change to sky white")
	public void the_background_color_will_change_to_sky_white() {
		
		 boolean isWhiteElementEnabled = driver.findElement(By.xpath(
		 "//*[@id=\"extra\"]/button[1]")).isEnabled();
		 Assert.assertTrue(isWhiteElementEnabled);
		 
		
	}
	
//	//cucumber specific After annotation here as well
//	@After
//	public void tearDown() {
//		//closes current tab
//		driver.close();
//		//closes window
//		driver.quit();
//		
//	}


	
		

}
