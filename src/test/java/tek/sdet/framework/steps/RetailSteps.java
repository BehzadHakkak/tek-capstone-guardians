package tek.sdet.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
public class RetailSteps extends CommonUtility {

    private POMFactory factory = new POMFactory();
    
    @Given("login as tek user to retail app with username {string} and password {string}")
    public void login_As_Tek_User_To_Retail_App_With_Username_And_Password(String userNameValue, String passwordValue)
    		throws InterruptedException {
    }
    
    
    @Then("assert application title {string}")
    public void assert_Application_Title(String expectedTitle) {
    }
}


