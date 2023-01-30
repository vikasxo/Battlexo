package adminObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSpaceButton
{
	// Initialization
			public AddSpaceButton(WebDriver driver)
			{
				PageFactory.initElements(driver,this);	
			}
	//declartion
			@FindBy(xpath="//button[@class='rs-btn rs-btn-primary btn']")
			private WebElement AddSpaceButton;
		
   //getters method
			public WebElement getAddSpaceButton() 
			{
				return AddSpaceButton;
			}
			// Business Logics
						/**
						 *@author Vikas
						 */
			public void addSpaceButton()
			{
				AddSpaceButton.click();
				
				
			}
			
		

}
