package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	 private POMFactory factory = new POMFactory();

	    @Given("User is on Retail website")
	    public void user_is_on_Retail_website() {
			Assert.assertTrue(factory.homePage().tekschoolLogo.isDisplayed());
			logger.info("TEKSCHOOL logo is displayed");
	    }

	    @When("User click on Sign in option")
	    public void user_click_on_sign_in_option() {
	    	click(factory.signIn().signInLink);
	        logger.info("clicked on the sign in link successfully");
	    }

	    @And("User enter email {string} and password {string}")
	    public void user_enter_email_and_password(String email, String password) {
	    	sendText(factory.signIn().emailField, email);
			sendText(factory.signIn().passwordField, password);
			logger.info("Email and Password were entered successfully");  
	    }

	    @And("User click on login button")
	    public void user_click_on_login_button() {
	    	click(factory.signIn().loginBttn);
			logger.info("SignIn button was clicked successfully");
	    }

	    @Then("User should be logged in into Account")
	    public void user_should_be_logged_in_into_account() {
//	    	Assert.assertTrue(factory.signIn().signInLink.isDisplayed());
	    	Assert.assertTrue(factory.signIn().logoutBttn.isDisplayed());
			logger.info("User is logged in successfully");
	    }
	    
	    @And("User click on Create New Account button")
	    public void user_click_on_create_new_account_button() {
	    	click(factory.signIn().newAccountBttn);
			logger.info("newAccountBttn button was clicked successfully");
	
	    }

	    @And("User fill the signUp information with below data")
	    public void user_fill_the_sign_up_information_with_below_data(io.cucumber.datatable.DataTable dataTable) {
	    	
	    	  List<Map<String, String>> signUpData = dataTable.asMaps(String.class, String.class);
	          String name = signUpData.get(0).get("name");
	          String email = signUpData.get(0).get("email");
	          String password = signUpData.get(0).get("password");
	          String confirmPassword = signUpData.get(0).get("confirmPassword");
	    	
	    	sendText(factory.signIn().nameInputField, name);
			sendText(factory.signIn().emailInputField, email);
		 	sendText(factory.signIn().passwordInputField, password);
			sendText(factory.signIn().confirmPassInputField, confirmPassword);
			logger.info("entered successfully"); 
	
	    }

	    @And("User click on SignUp button")
	    public void user_click_on_sign_up_button() {
	    	click(factory.signIn().signupBttn);
			logger.info("SignUp button was clicked successfully");
	
	    }

	    @Then("User should be logged into account page")
	    public void user_should_be_logged_into_account_page() {
	    	Assert.assertTrue(factory.signIn().logoutBttn.isDisplayed());
			logger.info("User is logged in successfully");  
	
	    }
	    
	    
	}
	





