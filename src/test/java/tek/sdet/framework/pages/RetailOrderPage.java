package tek.sdet.framework.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;



public class RetailOrderPage extends BaseSetup {
	


		
		public RetailOrderPage() {
			PageFactory.initElements(getDriver(), this);
		}
		
		@FindBy(id = "search")
		public WebElement allDepartmentDropdown;
		
		@FindBy(id = "searchInput")
		public WebElement searchInputField;
		
		@FindBy(id = "searchBtn")
		public WebElement searchBttn;
		
		@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
		public WebElement itemkasaoutdoorsmartplug;
		
		@FindBy(xpath = "//select[starts-with(@class,'product')]")
		public WebElement qtyDropdown;
		
		@FindBy(id = "addToCartBtn")
		public WebElement addToCartBttn;
		
		@FindBy(xpath = "//span[@id='cartQuantity']")
		public WebElement cartItemQty;
		
		@FindBy(id = "cartBtn")
		public WebElement cartBttn;
		
		@FindBy(id = "proceedBtn")
		public WebElement proceedToCheckoutBttn;
		
		@FindBy(id = "placeOrderBtn")
		public WebElement placeOrderBttn;
		
		@FindBy(xpath = "//div[text()='Order Placed Successfully']")
		public WebElement orderPlacedSuccessfullyMssg;
		
		@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends')]")
		public WebElement apexLegendsItem;
		
		//Cancel order
		@FindBy(id = "orderLink")
		public WebElement OrderLink;
		
		@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
		public List<WebElement> listOfOrders;
		
		@FindBy(xpath = "//button[text()='Cancel The Order']")
		public List<WebElement> cancelOrderBttn;
		
		@FindBy(xpath = "//button[text()='Return Items']")
		public List<WebElement> returnOrderBttn;
		
		@FindBy(id = "reasonInput")
		public WebElement reasonForCancelation;
		
		@FindBy(id = "dropOffInput")
		public WebElement DropoffReason;
		
		@FindBy(id = "orderSubmitBtn")
		public WebElement OrderSubmitBttn;
		
		@FindBy(id = "orderSubmitBtn")
		public WebElement ReturnSubmitBttn;
		
		@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
		public WebElement orderCancelledSuccessMssg;
		
		@FindBy(xpath = "//p[text()='Return was successfull']")
		public WebElement OrderReturnSuccessMssg;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/div[2]/div[1]/p[2]/input")
		public WebElement ItemSlection;
		@FindBy(xpath = "//button[@class='order__item-btn' and @id='reviewBtn']")
		public WebElement reviweBtn;
		@FindBy(xpath = "//input[@id='headlineInput']")
		public WebElement Headline;
		@FindBy(xpath = "//textarea[@id='descriptionInput']")
		public WebElement reviwText;
		@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
		public WebElement AddReviweBtn;
		
		@FindBy(xpath = "//div[text()='Your review was added successfully']")
		public WebElement ReviweMssg;
		
		
		
		
		
		
		
		

	}


