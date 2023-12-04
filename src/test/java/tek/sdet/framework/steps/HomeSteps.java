package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(factory.homePage().tekschoolLogo.isDisplayed());
		logger.info("TEKSCHOOL logo is displayed");
	}

	@When("User click on All section")
	public void user_click_on_all_section() {
		click(factory.homePage().allBTN);
		logger.info("clicked on the ALL BTN successfully");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void below_Options_ArePresent_In_Shop_By_Department_Sidebar(DataTable dataTable) {

		List<List<String>> shopByDepartment = dataTable.asLists(String.class);
		for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(
					"//div[@class='sidebar__content']//span[text()='" + shopByDepartment.get(0).get(i) + "']"))));
			logger.info("Option " + shopByDepartment.get(0).get(i) + " is displayed");
		}
	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments = factory.homePage().sidebarContents;
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getText().equalsIgnoreCase(department)) {
				departments.get(i).click();
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void below_Options_Are_Present_In_Department(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> options = factory.homePage().sidebarContents;

		for (int i = 0; i < departmentOptions.get(0).size(); i++) {
			for (WebElement elements : options) {
				if (elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					logger.info("The option " + elements.getText() + " is present");
				}
			}
		}

	}

	@And("User on Electronics")
	public void user_on_electronics() {
		click(factory.homePage().Electronics);
		logger.info("User on Electronics");
	}

	@And("User on Computers")
	public void user_on_computers() {
		click(factory.homePage().Computers);
		logger.info("User on Computers");
	}

	@And("User on Smart Home")
	public void user_on_smart_home() {
		click(factory.homePage().SmartHome);
		logger.info("User on Smart Home");
	}

	@When("User on Sports")
	public void user_on_sports() {
		click(factory.homePage().Sports);
		logger.info("User on Sports");
	}

	@When("User on Automotive")
	public void user_on_automotive() {
		click(factory.homePage().Automative);
		logger.info("User on Automative");
	}

}
