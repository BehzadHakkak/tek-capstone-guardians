package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText = "Account")
	public WebElement accountLink;
	
	@FindBy(id = "nameInput")
	public WebElement nameField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBttn;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMssg;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addAPaymentMethodLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthField;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expireationYearField;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeField;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodSuccessMssg;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodupdatMssg;
	
	
	@FindBy(xpath = "//div[starts-with(@class,'account__address-new-')]")
	public WebElement addAddressLink;
	
	@FindBy(id = "countryDropdown")
	public WebElement AddressCountryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement addressNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneField;
	
	@FindBy(id = "streetInput")
	public WebElement addressStreetField;
	
	@FindBy(id = "apartmentInput")
	public WebElement addressApartmentNum;
	
	@FindBy(id = "cityInput")
	public WebElement addressCityField;
	
	@FindBy(name = "state")
	public WebElement addressStateDropdown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addressAddBttn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressSuccessMssg;
	
	
	@FindBy(xpath = "//button[contains(@class, 'text-blue-800') and contains(text(), 'Edit')]")
	public WebElement editCard;
	
	@FindBy(xpath = "//button[@class='account__btn-submit' and text()='Update Your Card']")
	public WebElement updateYourCard;
	
	@FindBy(xpath = "//button[contains(@class, 'text-blue-800') and contains(text(), 'remove')]")
	public WebElement removeYourCard;
	
	@FindBy(xpath = "//button[@class='account__address-btn' and text()='Edit']")
	public WebElement edithAddress;
	
	@FindBy(xpath = "//button[@class='account__btn-submit' and @id='addressBtn' and text()='Update Your Address']")
	public WebElement updateYourAddress;
	
	@FindBy(xpath = "//button[@class='account__address-btn' and text()='Remove']")
	public WebElement addressRemoved;
	

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement updatedCard;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement updatedAddress;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/div[1]")
	public WebElement CardSelection;
	
	@FindBy(xpath ="//*[@id=\"root\"]//div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]")
	public WebElement removalcardslect;
	
	
	
}
