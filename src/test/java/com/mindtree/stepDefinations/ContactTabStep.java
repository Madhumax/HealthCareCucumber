package com.mindtree.stepDefinations;

import org.junit.runner.RunWith;

import com.mindtree.pageObjects.ContactPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reUsableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ContactTabStep extends WebDriverHelper{

    @Given("^user chooses the browsedr$")
    public void user_chooses_the_browsedr() throws Throwable {
       driver=baseFile();
       driver.manage().window().maximize();
       
    }

    @Then("^Clicked on contact tab$")
    public void clicked_on_contact_tab() throws Throwable {
        LandingPage lp=new LandingPage(driver);
        lp.getContact().click();
        Thread.sleep(3000);
    }

    @And("^navigated to url$")
    public void navigated_to_url() throws Throwable {
    	driver.get(prop.getProperty("url"));
    }

    @And("^entered the details (.+) (.+) (.+) and then submit$")
    public void entered_the_details_and_then_submit(String name, String email, String message) throws Throwable {
        ContactPage cp=new ContactPage(driver);
        cp.getName().sendKeys(name);
        cp.getEmail().sendKeys(email);
        cp.getMessage().sendKeys(message);
        cp.getSubmit().click();
        Thread.sleep(3000);
    }

    @And("^validating the text \"([^\"]*)\"$")
    public void validating_the_text_something(String strArg1) throws Throwable {
        if(strArg1.equalsIgnoreCase("Thanks for contacting us"))
        {
        	System.out.println("good");
        	driver.close();
        }
        else
        {
        	System.out.println("not good");
        	driver.close();
        }
    }

}