package adminObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTournamentPage
{
	// initalization
	public CreateTournamentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	//declaration
	@FindBy(xpath="//button[@class='rs-btn rs-btn-primary']")
	private WebElement CreateTournamentModuleButton;
	
	//getters Method
	public WebElement getCreateTournamentModuleButton() 
	{
		return CreateTournamentModuleButton;
	}
	
	
	//Business Logics
	/**
	 * @author Vikas
	 */
	public void createTournamentModule()
	{
		CreateTournamentModuleButton.click();
	}

}
