package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// initalization
				public HomePage(WebDriver driver)
				{
					PageFactory.initElements(driver,this);	
				}
				//declaration
				@FindBy(xpath="//p[text()='Dashboard']")
				private WebElement DashboardModuleButton;
				
				@FindBy(xpath="//p[text()='Moderators']")
				private WebElement ModeratorsModuleButton;
				
				@FindBy(xpath="(//p[text()='Tournaments'])[1]")
				private WebElement TournamentsModuleButton;
				
				@FindBy(xpath="//p[text()='Spaces']")
				private WebElement SpacesModuleButton;
				
				@FindBy(xpath="//p[text()='Rivalry Zone']")
				private WebElement RivalaryZoneModuleButton;
				
				@FindBy(xpath="//p[text()='Wallet']")
				private WebElement WalletModuleButton;
				
				@FindBy(xpath="//span[@class='rs-dropdown-toggle rs-dropdown-toggle-custom-title']")
				private WebElement SignOut;
				
				@FindBy(xpath="//p[text()='Logout']")
				private WebElement LogOut;
				
				@FindBy(xpath="//p[text()='Profile']")
				private WebElement ProfileModuleButton;
				
				@FindBy(xpath="//p[text()='Messages']")
				private WebElement MessagesModuleButton;
				
				@FindBy(xpath="//p[text()='Policies']")
				private WebElement PoliciesModuleButton;
				
				@FindBy(xpath="(//p[text()='Advertisements'])[1]")
				private WebElement AdvertisementsModuleButton;
				
				//getters Method
				public WebElement getDashboardModuleButton() 
				{
					return DashboardModuleButton;
				}


				public WebElement getRivalaryZoneModuleButton() 
				{
					return RivalaryZoneModuleButton;
				}


				public WebElement getWalletModuleButton() 
				{
					return WalletModuleButton;
				}


				public WebElement getProfileModuleButton() 
				{
					return ProfileModuleButton;
				}


				public WebElement getMessagesModuleButton() 
				{
					return MessagesModuleButton;
				}


				public WebElement getPoliciesModuleButton() 
				{
					return PoliciesModuleButton;
				}


				public WebElement getAdvertisementsModuleButton()
				{
					return AdvertisementsModuleButton;
				}


				public WebElement getModeratorsModuleButton()
				{
					return ModeratorsModuleButton;
				}
				
				
				
				public WebElement getSignOut()
				{
					return SignOut;
				}


				public WebElement getLogOut() 
				{
					return LogOut;
				}


				public WebElement getSpacesModuleButton()
				{
					return SpacesModuleButton;
				}

				public WebElement getTournamentsModuleButton()
				{
					return TournamentsModuleButton;
				}
				
				
				//Business Logics
				/**
				 * @author vikas
				 */
				public void dashboardModule() 
				   {
					DashboardModuleButton.click();
				   }
				
				 public void moderatorsModule()
				   {
					   ModeratorsModuleButton.click();
				   }
				 
			   public void tournamentModule() 
			   {
				   TournamentsModuleButton.click();
			   }
			   
			   public void spacesModule()
			   {
				   SpacesModuleButton.click();
			   }
			   
			   public void rivalaryzoneModule()
			   {
				   RivalaryZoneModuleButton.click();
			   }
			   
			   public void walletModule()
			   {
				   WalletModuleButton.click();
			   }
			   
			   public void advertisementModule()
			   {
				   AdvertisementsModuleButton.click();
			   }
			   
			   public void profileModule()
			   {
				   ProfileModuleButton.click();
			   }
			   
			   public void messageModule()
			   {
				   MessagesModuleButton.click();
			   }
			   
			   public void policiesModule()
			   {
				   PoliciesModuleButton.click();
				   
			   }
			   
			   public void signOut()
			   {
				   SignOut.click();
			   }
			   
			   public void logOut()
			   {
				   LogOut.click();
			   }

}
