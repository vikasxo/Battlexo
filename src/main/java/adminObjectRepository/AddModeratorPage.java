package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddModeratorPage
{
	// initalization
		public AddModeratorPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);	
		}
		//declaration
		@FindBy(xpath="//input[@placeholder='Enter Moderator Name']")
		private WebElement ModeratorNameTextField;
		
		@FindBy(xpath="//input[@placeholder='Enter Moderator Email']")
		private WebElement ModeratorEmailTextField;
		
		@FindBy(xpath="//input[@placeholder='Enter Moderator Phone Number']")
		private WebElement ModeratorPhoneNumberTextField;
		
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement AddModuleButton;

	    //getters Methods
		public WebElement getModeratorNameTextField()
		{
			return ModeratorNameTextField;
		}


		public WebElement getModeratorEmailTextField()
		{
			return ModeratorEmailTextField;
		}


		public WebElement getModeratorPhoneNumberTextField()
		{
			return ModeratorPhoneNumberTextField;
		}


		public WebElement getAddModuleButton() 
		{
			return AddModuleButton;
		}
		
		// Business Logics
		/**
		 *@author Vikas
		 */
		
		public void addModeratorDetails(String ModeratorName,String ModeratorEmail,String ModeratorPhoneNumber)
		{
			ModeratorNameTextField.sendKeys(ModeratorName);
			ModeratorEmailTextField.sendKeys(ModeratorEmail);
			ModeratorPhoneNumberTextField.sendKeys(ModeratorPhoneNumber);
			AddModuleButton.click();
			
		}
		
		public void addModerator()
		{
			AddModuleButton.click();
		}

}
