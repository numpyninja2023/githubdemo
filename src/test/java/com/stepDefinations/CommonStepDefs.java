package com.stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.ArraysPage;
import com.pageObjects.DS_IntroPage;
import com.pageObjects.LinkedListPage;
import com.pageObjects.StackPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefs extends BaseClass {
	
	
	 WebDriver driver = Helper.getDriver();
	
	@When("user clicks on Try here")
	public void user_clicks_on_try_here() throws InterruptedException {
		 ds_IntroPage = new DS_IntroPage(driver);
		 //listPage = new LinkedListPage(driver);
		ds_IntroPage.clickTryHereLink();	
		
	}
	 	
	@Given("The user is at home page with title {string}")
	public void the_user_is_at_home_page_with_title(String title) {
		listPage = new LinkedListPage(driver);	
		stackPage = new StackPage(driver);
		System.out.println("title of page :"+driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());
		
	}
	
	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
		 ds_IntroPage = new DS_IntroPage(driver);
		ds_IntroPage.clickRunBtn();
	}
	
	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
		listPage = new LinkedListPage(driver);	
		//stackPage = new StackPage(driver);
		arrayPage = new ArraysPage(driver);
		ds_IntroPage = new DS_IntroPage(driver);
		
		Assert.assertEquals(Helper.getTitle(), title);

}
}