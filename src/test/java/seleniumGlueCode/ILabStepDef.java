package seleniumGlueCode;

import accelerators.ActionsClass;
import accelerators.Base;
import cucumber.api.java.en.And;
import gherkin.lexer.Th;
import pageObjects.ILabObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utility.utils;

import cucumber.api.java.en.Given;

import java.util.concurrent.TimeUnit;

public class ILabStepDef {

    static WebDriver newdriver = Base.driver;
    static WebDriver driver1;
    public static String sNewWindow="";
    public static String uniqueName="";

    @Before
    public void setUp() throws Exception{
        try{
            ActionsClass.sTestCaseName =this.toString();
            ActionsClass.sTestCaseName = utils.getTestCaseName(ActionsClass.sTestCaseName);
        }catch (Exception e){

        }
    }

    @Given("user is on the iLab application landing page")
    public static void launchTheBrowser(){
        try{
            Base.sBrowserName=utils.getProperty("browserName");
            System.out.println("BrowserType ="+Base.sBrowserName);
            newdriver=Base.OpenBrowser(Base.sBrowserName);
            newdriver=Base.driver;
        }catch (Exception e){

        }
    }

    @When("user navigate to ILab")
    public void navigateToURL() throws InterruptedException{
        try{
            String url = utils.getProperty("Application_URL");
            newdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            newdriver.get(url);
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

    @Then("user clicks on the career button")
    public void clickCreateBtn() throws Throwable{
        try{
            Thread.sleep(2000);
            ActionsClass.clickOnElement(ILabObjects.creatILabBtn, "Create Element");

        }catch (Exception e){

        }
    }

    @Then("user clicks on the South African Link")
    public void clickToSelectCountry() throws Throwable{
        try {
            Thread.sleep(1000);
            ActionsClass.clickOnElement(ILabObjects.selectCountry, "Click South Africa");

        }catch (Exception e){

        }
    }

    @Then("user clicks on the first available Job")
    public void clickAvailableJob() throws Throwable{
        try {
            ActionsClass.clickOnElement(ILabObjects.selectJobToApply, "Select a Job");

        }catch (Exception e){

        }
    }

    @And("user click apply button")
    public void clickApplyBtn() throws Throwable{
        try {
            ActionsClass.clickOnElement(ILabObjects.clickApplyBtn, "Apply Button");
        }catch (Exception e){

        }
    }

    @Then("^user enters \"([^\"]*)\" first name$")
    public void user_enters_first_name(String sUsername) throws Throwable {
        try {

                ActionsClass.typeInTextBox(ILabObjects.typeToEnterName, sUsername, sUsername);
        }catch (Exception e){

        }
    }

    @Then("^I enter email address \"([^\"]*)\"$")
    public void i_enter_email_address(String sEmail) throws Throwable {
        try {
                ActionsClass.typeInTextBox(ILabObjects.typeToEnterEmail, sEmail, sEmail);
        }catch (Exception e){

        }

    }

    @Then("^I enter phone number \"([^\"]*)\"$")
    public void i_enter_phone_number(String phoneNumber) throws Throwable {
       try {
                ActionsClass.typeInTextBox(ILabObjects.enterPhoneNumber, phoneNumber, phoneNumber);
       }catch (Exception e){

       }
    }

    @Then("^I click send application button$")
    public void i_click_send_application_button() throws Throwable {
      try {
            Thread.sleep(1000);
            ActionsClass.clickOnElement(ILabObjects.sendApplication, "Apply button");
      }catch (Exception e){

      }
    }

    @Then("^Verify that You need to upload at least one file. is displayed$")
    public void validateUploadDis() throws Throwable{
        try {
            Thread.sleep(500);
            ActionsClass.isElementVisible(ILabObjects.validationError, "You need to upload at least one file.");

        }catch (Exception e){

        }
    }
}
