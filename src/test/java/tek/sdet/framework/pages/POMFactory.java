package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	private RetailSignInPage signIn;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signIn = new RetailSignInPage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();
		

	}
	 public  RetailHomePage homePage() {
	        return this.homePage;
	    }
	 public RetailSignInPage signIn() {
	        return this.signIn;
	    }
	 public RetailAccountPage retailAccountPage() {
	        return this.retailAccountPage;
	    }
	 public RetailOrderPage retailOrderPage() {
	        return this.retailOrderPage;
	    }
	 
}
