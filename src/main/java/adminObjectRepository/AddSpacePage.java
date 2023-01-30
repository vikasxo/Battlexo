package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSpacePage
{
	// initalization
			public AddSpacePage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);	
			}
	//declaration
			@FindBy(xpath="//input[@placeholder='Enter Name']")
			private WebElement SpaceNameTextField;
			
			@FindBy(xpath="//textarea[@placeholder='Write a description']")
			private WebElement DescriptionTextField;
			
			@FindBy(xpath="(//div[@class='uploader'])[1]")
			private WebElement AddIconButton;
			
			@FindBy(xpath="(//div[@class='uploader'])[2]")
			private WebElement AddBannerButton;

			
			@FindBy(xpath="//button[@class='rs-btn rs-btn-primary']")
			private WebElement CreateSpaceButton;

			//getters method
			
			public WebElement getCreateSpaceButton()
			{
				return CreateSpaceButton;
			}
			public WebElement getAddBannerButton() 
			{
				return AddBannerButton;
			}
			public WebElement getAddIconButton()
			{
				return AddIconButton;
			}
			public WebElement getSpaceNameTextField() 
			{
				return SpaceNameTextField;
			}

			public WebElement getDescriptionTextField() 
			{
				return DescriptionTextField;
			}
			
			// Business Logics
			/**
			 *@author Vikas
			 */
			
			public void addSpaceDetails(String SpaceName,String Description)
			{
				SpaceNameTextField.sendKeys(SpaceName);
				DescriptionTextField.sendKeys(Description);
				
			}
			
			public void addIconButton()
			{
				AddIconButton.click();
			}
			public void addBannerButton()
			{
				AddBannerButton.click();
			}
			
			
			public void createSpace()
			{
				CreateSpaceButton.click();
			}
			
			
			
			

}
