package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataMaker;


public class RetailAccountSteps extends CommonUtility {
	
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void user_Click_On_Account_Option() {
		click(factory.retailAccountPage().accountLink);
		logger.info("Account link was clicked successfully");
	}
	
//	@When("User click on the card")
//	public void UserclickOntheCard() {
//		click(factory.retailAccountPage().CardSelection);
//		logger.info("click on link was clicked successfully");
//	}
	@And("User update Name {string} and Phone {string}")
	public void user_Update_Name_And_Phone(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.retailAccountPage().nameField);
		sendText(factory.retailAccountPage().nameField, name);
		logger.info("Name was entered successfully");
		clearTextUsingSendKeys(factory.retailAccountPage().phoneField);
		sendText(factory.retailAccountPage().phoneField, phoneNumber);
		logger.info("Phone Number was entered successfully");
	}
	@And("User click on Update button")
	public void user_Click_On_Update_Button() {
		click(factory.retailAccountPage().updateBttn);
		logger.info("Update button was clicked successfully");
	}
	@Then("user profile information should be updated")
	public void user_Profile_Information_Should_Be_Updated() {
		waitTillPresence(factory.retailAccountPage().personalInfoUpdateSuccessMssg);
		String expectedMssg = "Personal Information Updated Successfully";
		String actualMssg = factory.retailAccountPage().personalInfoUpdateSuccessMssg.getText();
		Assert.assertEquals(expectedMssg, actualMssg);
		logger.info("Account information was updated successfully");
	}
	
	@And("User click on Add a payment method link")
	public void user_Click_On_Add_A_Payment_Method_Link() {
		click(factory.retailAccountPage().addAPaymentMethodLink);
		logger.info("Add Payment Method link was clicked successfully");
	}
	@And("User fill Debit or credit card information")
	public void user_Fill_Debit_Or_Credit_Card_Information(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.retailAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.retailAccountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailAccountPage().expirationMonthField, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailAccountPage().expireationYearField, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.retailAccountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
		logger.info("Payment Information was entered successfully");
		
	}
	@And("User click on Add your card button")
	public void user_Click_On_Add_Your_Card_Button() {
		click(factory.retailAccountPage().paymentSubmitBtn);
		logger.info("Payment Method Submit bttn clicked successfully");
	}
	@Then("a message should be displayed {string}")
	public void a_Message_Should_Be_Displayed(String expectedMssg) {
		
				if(expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodupdatMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodupdatMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Payment Method added")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Address Added")) {
			waitTillPresence(factory.retailAccountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().addressSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		}else if(expectedMssg.contains("Order Placed")) {
			waitTillPresence(factory.retailOrderPage().orderPlacedSuccessfullyMssg);
			Assert.assertEquals(expectedMssg, factory.retailOrderPage().orderPlacedSuccessfullyMssg.getText());
		}

	}
	
	//edit Debit card
	@When("User click on the card for Editing")
	public void User_click_On_the_Card_For_Editing() {
		click(factory.retailAccountPage().CardSelection);
		logger.info("click on link was clicked successfully");
	}
	@And("User click on Edit option of card section")
	public void User_Click_On_Edit_Option_Of_Card_Section() {
		
		click(factory.retailAccountPage().editCard);
		logger.info("Edit option of card section was clicked successfully");
	}
	@And("user edit information with below data")
	public void User_Edit_Information_With_Below_Data(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.retailAccountPage().cardNumberField);
		sendText(factory.retailAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.retailAccountPage().nameOnCardField);
		sendText(factory.retailAccountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailAccountPage().expirationMonthField, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailAccountPage().expireationYearField, paymentInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.retailAccountPage().securityCodeField);
		sendText(factory.retailAccountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
		logger.info("Payment information was updated successfully");
	}
	//update card 
	@When("user click on Update Your Card button")
	public void User_Click_On_Update_Your_Card_Button() {
		click(factory.retailAccountPage().updateYourCard);
		logger.info("Update card button clicked successfully");
	}
	
	@Then("a payment update message should be displayed{string}")
	public void a_payment_Updat_Message_Should_Be_Displayed(String expectedMssg ) {
//	this changed	
		if(expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodupdatMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodupdatMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Payment Method added")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Address Added")) {
			waitTillPresence(factory.retailAccountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().addressSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		}else if(expectedMssg.contains("Order Placed")) {
			waitTillPresence(factory.retailOrderPage().orderPlacedSuccessfullyMssg);
			Assert.assertEquals(expectedMssg, factory.retailOrderPage().orderPlacedSuccessfullyMssg.getText());
		}
	
	}
		
	
	//Remove Debit Card
	@And ("User click on the card for removing")
	public void User_click_on_the_card_for_removing() {
		click(factory.retailAccountPage().removalcardslect);
		logger.info("Remove card button clicked successfully");
	}
	@And("User click on remove option of card section")
	public void User_Click_On_Remove_Option_Of_Card_Section() {
		click(factory.retailAccountPage().removeYourCard);
		logger.info("Remove card button clicked successfully");
	}
	
	@Then("payment details should be removed")
	public void payment_Details_Should_Be_Removed() {
		Assert.assertTrue(factory.retailAccountPage().paymentSubmitBtn.isDisplayed());
		logger.info("Payment details removed successfully");
	}
	
	
	//add Address
	@When("User click on Add address option")
	public void user_Click_On_Add_Address_Option() {
		click(factory.retailAccountPage().addAddressLink);
		logger.info("Add Address Link was clicked successfully");
	}
	@When("user fill new address form with below information")
	public void user_Fill_New_Address_Form_With_Below_Information(DataTable dataTable) {
		

		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.retailAccountPage().AddressCountryDropdown, 
				DataMaker.addressGenerator(addressInfo.get(0).get("country")));
		sendText(factory.retailAccountPage().addressNameField,
				DataMaker.addressGenerator(addressInfo.get(0).get("fullName")));
		sendText(factory.retailAccountPage().addressPhoneField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("phoneNumber")));
		sendText(factory.retailAccountPage().addressStreetField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("streetAddress")));
		sendText(factory.retailAccountPage().addressApartmentNum, 
				DataMaker.addressGenerator(addressInfo.get(0).get("apt")));
		sendText(factory.retailAccountPage().addressCityField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("city")));
		selectByVisibleText(factory.retailAccountPage().addressStateDropdown, 
				DataMaker.addressGenerator(addressInfo.get(0).get("state")));
		sendText(factory.retailAccountPage().addressZipCodeField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("zipCode")));
		
		logger.info("Address form was filled out successfully");
	}
	
	@When("User click Add Your Address button")
	public void user_Click_Add_Your_Address_Button() {
		click(factory.retailAccountPage().addressAddBttn);
		logger.info("Add Address Button was clicked successfully");
	}

	@Then("an add message should be displayed {string}")
	public void Address_Added_Successfully(String expectedMssg) {
		 
		if(expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodupdatMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodupdatMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Payment Method added")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Address Added")) {
			waitTillPresence(factory.retailAccountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().addressSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		}else if(expectedMssg.contains("Order Placed")) {
			waitTillPresence(factory.retailOrderPage().orderPlacedSuccessfullyMssg);
			Assert.assertEquals(expectedMssg, factory.retailOrderPage().orderPlacedSuccessfullyMssg.getText());
		}

		
	}
	
	
//	edit address
	@And("User click on edit address option")
	public void User_Click_On_Edit_Address_Option() {
		click(factory.retailAccountPage().edithAddress);
		logger.info("Edit address link clicked successfully");
	}
	@And("User fill new address form with below information")
	public void User_Fill_New_Address_Form_With_Below_Information(DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.retailAccountPage().AddressCountryDropdown, 
				DataMaker.addressGenerator(addressInfo.get(0).get("country")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressNameField);
		sendText(factory.retailAccountPage().addressNameField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("fullName")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressPhoneField);
		sendText(factory.retailAccountPage().addressPhoneField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("phoneNumber")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressStreetField);
		sendText(factory.retailAccountPage().addressStreetField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("streetAddress")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressApartmentNum);
		sendText(factory.retailAccountPage().addressApartmentNum, 
				DataMaker.addressGenerator(addressInfo.get(0).get("apt")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressCityField);
		sendText(factory.retailAccountPage().addressCityField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("city")));
		selectByVisibleText(factory.retailAccountPage().addressStateDropdown, 
				DataMaker.addressGenerator(addressInfo.get(0).get("state")));
		clearTextUsingSendKeys(factory.retailAccountPage().addressZipCodeField);
		sendText(factory.retailAccountPage().addressZipCodeField, 
				DataMaker.addressGenerator(addressInfo.get(0).get("zipCode")));
		
		logger.info("New address form was filled out successfully");
	}
	
	@And("User click update Your Address button")
	public void User_Click_Update_Your_Address_Button() {
		click(factory.retailAccountPage().updateYourAddress);
		logger.info("Update address button clicked successfully");
	}

	@Then("an update message should be displayed {string}")
	public void Address_Updated_Successfully(String expectedMssg) {
		if(expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodupdatMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodupdatMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Payment Method added")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
			
		}else if(expectedMssg.contains("Address Added")) {
			waitTillPresence(factory.retailAccountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.retailAccountPage().addressSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		}else if(expectedMssg.contains("Order Placed")) {
			waitTillPresence(factory.retailOrderPage().orderPlacedSuccessfullyMssg);
			Assert.assertEquals(expectedMssg, factory.retailOrderPage().orderPlacedSuccessfullyMssg.getText());
		}

		
	}
	
		

	
//	address removed
	
	@And("User click on remove option of Address section")
	public void User_Click_On_Remove_Option_Of_Address_Section() {
		click(factory.retailAccountPage().addressRemoved);
		logger.info("Remove address button clicked successfully");
	}
	
	@Then("Address details should be removed")
	public void Verify_User_Address_Is_Removed() {
		Assert.assertTrue(factory.retailAccountPage().addressRemoved.isEnabled());
		logger.info("Address details is removed successfully");
	}
	
	
	}
