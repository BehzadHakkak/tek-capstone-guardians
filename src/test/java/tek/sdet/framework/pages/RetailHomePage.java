package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
    
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id ="signinBtn")
    public WebElement signIn; 
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	
	@FindBy(xpath = "//button[@id='hamburgerBtn']")
	public WebElement allBTN;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]")
	public List<WebElement> sidebarContents;

	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sidebarAllContents;
	
	@FindBy(xpath = "//div[@class='sidebar__content']//span[text()= 'Electronics']")
	public WebElement Electronics;
	
	@FindBy(xpath = "//div[@class='sidebar__content']//span[text()= 'Computers']")
	public WebElement Computers;
	
	@FindBy(xpath = "//div[@class='sidebar__content']//span[text()= 'Smart Home']")
	public WebElement SmartHome;
	
	@FindBy(xpath = "//div[@class='sidebar__content']//span[text()= 'Sports']")
	public WebElement Sports;
	
	@FindBy(xpath = "//div[@class='sidebar__content']//span[text()= 'Automative']")
	public WebElement Automative;
}
