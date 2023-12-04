package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@When("User changes the category to {string}")
	public void user_changes_the_category_to(String category) {
		selectByVisibleText(factory.retailOrderPage().allDepartmentDropdown, category);
		logger.info("Category was selected successfully from dropdown");
	}

	@And("User searches for an item {string}")
	public void user_searches_for_an_item(String kasaOutdoorSmartPlug) {
		sendText(factory.retailOrderPage().searchInputField, kasaOutdoorSmartPlug);
		logger.info("Item name was entered successfully");
	}

	@And("User clicks on Search icon")
	public void user_clicks_on_search_icon() {
		click(factory.retailOrderPage().searchBttn);
		logger.info("Search button was clicked successfully");
	}

	@And("User clicks on item")
	public void user_clicks_on_item() {
		click(factory.retailOrderPage().itemkasaoutdoorsmartplug);
		logger.info("item was clicked successfully");
	}


	@And("User selects quantity {string}")
	public void user_selects_quantity(String Qty)  {
		selectByVisibleText(factory.retailOrderPage().qtyDropdown, Qty);
		logger.info("item quantity was selected succcessfully");
		
	}
	
	@And("User clicks add to Cart button")
	public void user_clicks_add_to_cart_button() {
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("Add item to the cart button was clicked successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void the_cart_icon_quantity_should_change_to(String ItemInCartQty) {
		Assert.assertEquals(ItemInCartQty, factory.retailOrderPage().cartItemQty.getText());
		logger.info("Item qty in the cart was validated successfully");
	}

//	Second scenario
	@When("User changes the category for second to {string}")
	public void user_changes_the_category_for_second_to(String electronics) {
		selectByVisibleText(factory.retailOrderPage().allDepartmentDropdown, electronics);
		logger.info("Category changed to electronics successfully");
	}

	@And("User searches for an item for second {string}")
	public void user_searches_for_an_item_for_second(String apexLegends) {
		sendText(factory.retailOrderPage().searchInputField, apexLegends);
		logger.info("Item name was entered successfully");
	}
	
	
	@And("User clicks on item for second")
	public void user_clicks_on_item_for_second() {
		click(factory.retailOrderPage().apexLegendsItem);
		logger.info("Item Apex Legends was clicked successfully");
	}
	
	@And("User selects quantity for second {string}")
	public void user_selects_quantity_for_second(String secondQty)  {
		selectByVisibleText(factory.retailOrderPage().qtyDropdown, secondQty);
		logger.info("Apex Legends qty was changed successfully");
		
	}
	
	@And("User clicks add to Cart button for second")
	public void user_clicks_add_to_cart_button_for_second() throws InterruptedException  {
	
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("Add item to the cart button was clicked successfully");
		Thread.sleep(2000);
	}

	@Then("the cart icon quantity should change to {string} for second")
	public void the_cart_icon_quantity_should_change_to_for_second(String ItemInCartQty)  {
		Assert.assertEquals(ItemInCartQty, factory.retailOrderPage().cartItemQty.getText());
		logger.info("Item qty in the cart was validated successfully");
		
	}
	
	@And("User clicks on Cart option")
	public void user_clicks_on_cart_option()  {
		click(factory.retailOrderPage().cartBttn);
		logger.info("Cart Button was clicked successfully");
		
	}

	@And("User clicks on Proceed to Checkout button")
	public void user_clicks_on_proceed_to_checkout_button()  {
		click(factory.retailOrderPage().proceedToCheckoutBttn);
		logger.info("Proceed to check out button was clicked successfully");
		
	}

	@And("User clicks on Place Your Order")
	public void user_clicks_on_place_your_order() throws InterruptedException  {
		click(factory.retailOrderPage().placeOrderBttn);
		logger.info("Place your order button was clicked successfully");
		Thread.sleep(2000);
	}

	@Then("a message should be displayed for order {string}")
	public void a_message_should_be_displayed_order_placed_Successfully(String SuccessMssg)  {
		Assert.assertEquals(SuccessMssg, factory.retailOrderPage().orderPlacedSuccessfullyMssg.getText());
		logger.info("Order Placed Thanks");
		
	}
	
//	next scenario

	@When("User clicks on Orders section for cancelation")
	public void user_clicks_on_orders_section_for_cancelation() {
		click(factory.retailOrderPage().OrderLink);
		logger.info("Order link was clicked successfully");
	}

	@And("User clicks on first order in list for cancelation")
	public void user_clicks_on_first_order_in_list_for_cancelation() {
		List<WebElement> listOfOrder = factory.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailOrderPage().listOfOrders.get(i));
			}
		}
		logger.info("First order in the list of clicked");
	}
	@And("User clicks on Cancel The Order button for cancelation")
	public void user_clicks_on_cancel_the_order_button_for_cancelation() {
		List<WebElement> cancelBttns = factory.retailOrderPage().cancelOrderBttn;
		click(cancelBttns.get(0));
		logger.info("Order Cancel button was clicked");
//		cancel all orders
//		for(int i = 0; i < cancelBttns.size(); i++) {
//			click(cancelBttns.get(i));
	}

	@And("User selects the cancelation Reason {string}")
	public void user_selects_the_cancelation_reason_bought_wrong_item(String cancelationReason) {
		selectByVisibleText(factory.retailOrderPage().reasonForCancelation, cancelationReason);
		logger.info("Cancelation reason was selected");
	}

	@And("User clicks on Cancel Order button")
	public void user_clicks_on_cancel_order_button() {
		click(factory.retailOrderPage().OrderSubmitBttn);
		logger.info("Cancel Submit Button was clicked successfully");
	}

	@Then("a cancellation message should be displayed {string}")
	public void a_cancellation_message_should_be_displayed_your_order_has_been_cancelled(String CancelationSuccessMssg) {
		Assert.assertEquals(CancelationSuccessMssg, factory.retailOrderPage().orderCancelledSuccessMssg.getText());
		logger.info("Cancelation success message was verified successfully");
	}
	
//	Next scenairio
//	the falowings need updated pom.

	@When("User clicks on Orders section for Return")
	public void user_clicks_on_orders_section_for_return() {
		click(factory.retailOrderPage().OrderLink);
		logger.info("Order link was clicked successfully");
	}

	@And("User clicks on first order in list for Return")
	public void user_clicks_on_first_order_in_list_for_return() {
		List<WebElement> listOfOrder = factory.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailOrderPage().listOfOrders.get(i));
			}
		}
		logger.info("First order in the list of clicked");
	}

	@And("User clicks on Return Items button for Return")
	public void user_clicks_on_return_items_button_for_return(){
		List<WebElement> cancelBttns = factory.retailOrderPage().returnOrderBttn;
		click(cancelBttns.get(0));
		
		logger.info("Return  Button was clicked successfully");
	}
	@When("Slect The Item if not Slected")
	public void Slect_The_Item_if_not_Slected() {
		
		boolean xyz =isElementSelected(factory.retailOrderPage().ItemSlection);
		if(xyz== false) {
			click(factory.retailOrderPage().ItemSlection);
			
		}
        
		logger.info("Item was slected");
	}

	@And("User selects the Return Reason {string}")
	public void user_selects_the_return_reason_item_damaged(String ReturnReason) {
		selectByVisibleText(factory.retailOrderPage().reasonForCancelation, ReturnReason);
		logger.info("Return reason was selected");
	}

	@And("User selects the drop-off service {string}")
	public void user_selects_the_drop_off_service_fed_ex(String dropOff) {
		selectByVisibleText(factory.retailOrderPage().DropoffReason, dropOff);
		logger.info("Dropp-off was selected");
	}

	
	@And("User clicks on Return Order button")
	public void user_clicks_on_return_order_button() {
		click(factory.retailOrderPage().OrderSubmitBttn);
		logger.info("Cancel Submit Button was clicked successfully");
	}
	
	

	@Then("a Return message should be displayed {string}")
	public void a_return_message_should_be_displayed(String ReturnMssgReport) {
		Assert.assertEquals(ReturnMssgReport, factory.retailOrderPage().OrderReturnSuccessMssg.getText());
		logger.info("Return success message was verified successfully");
	}
//	next scenario

	@When("User clicks on Orders section for review")
	public void user_clicks_on_orders_section_for_review() {
		
		click(factory.retailOrderPage().OrderLink);
		logger.info("Order link was clicked successfully");
		
	}

	@And("User clicks on first order in list for review")
	public void user_clicks_on_first_order_in_list_for_review(){
		
			List<WebElement> listOfOrder = factory.retailOrderPage().listOfOrders;
			for(int i = 0; i < listOfOrder.size(); i++) {
				if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
					
				}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
					click(factory.retailOrderPage().listOfOrders.get(i));
				}
			}		
			logger.info("First order in the list of clicked");
		}

	@And("User clicks on Review button for review")
	public void user_clicks_on_review_button_for_review() {
		click(factory.retailOrderPage().reviweBtn);
		logger.info("User cliked on review Battun");
	
		logger.info("User clicked on Review button for review");
	}

	@And("User writes Review headline {string} and {string}")
	public void user_writes_review_headline_headline_value_and_review_text(String headline, String reviewText){
		sendText(factory.retailOrderPage().Headline, headline);
		
		sendText(factory.retailOrderPage().reviwText, reviewText);
		
		logger.info("User wrote Review headline and review text");
	}

	@And("User clicks Add your Review button")
	public void user_clicks_add_your_review_button() throws InterruptedException {
		click(factory.retailOrderPage().AddReviweBtn);
		Thread.sleep(2000);
		logger.info("User cliked on Add review Battun");
	}

	@Then("a review message should be displayed {string}")
	public void a_review_message_should_be_displayed_your_review_was_added_successfully(String MSSG) {
		Assert.assertEquals(MSSG, factory.retailOrderPage().ReviweMssg.getText());
		logger.info("a message contains 'Your review was added successfully' displayed");
		
	}
}