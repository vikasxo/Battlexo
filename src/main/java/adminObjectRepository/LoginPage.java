package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	// initalization
			public LoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);	
			}
			//declaration
			@FindBy(xpath="//input[@placeholder='Enter Username']")
			private WebElement UserNameTextField;
			
			@FindBy(xpath="//input[@placeholder='Enter Password']")
			private WebElement UserPasswordTextField;
			
			@FindBy(xpath="//button[@class='login-btn']")
			private WebElement LoginButton;
			
			
			
	        //getters Methods
			public WebElement getUserNameTextField() 
			{
				return UserNameTextField;
			}

			public WebElement getUserPasswordTextField() 
			{
				return UserPasswordTextField;
			}

			public WebElement getLoginButton() 
			{
				return LoginButton;
			}
			
			
			//Business Logics
			/**
			 * 
			 * @param userName
			 * @param password
			 * @author vikas
			 */
			
			public void login(String userName,String password) 
			{
				UserNameTextField.sendKeys(userName);
				UserPasswordTextField.sendKeys(password);
				LoginButton.click();
			}

}
