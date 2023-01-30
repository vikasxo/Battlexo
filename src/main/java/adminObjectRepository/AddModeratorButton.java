package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddModeratorButton 
{
	// Initialization
		public AddModeratorButton(WebDriver driver)
		{
			PageFactory.initElements(driver,this);	
		}
		//declaration
		@FindBy(xpath="//button[@class='rs-btn rs-btn-primary']")
		private WebElement AddModeratorButton;
		
		//getters Methods
		public WebElement getAddModeratorButton() 
		{
			return AddModeratorButton;
		}
		
		// Business Logics
			/**
			 *@author Vikas
			 */
			
			
			public void addModeratorButton()
			{
				AddModeratorButton.click();
			}

}
