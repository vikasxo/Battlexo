package admin.uat.battlexo.com;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import adminObjectRepository.AddModeratorButton;
import adminObjectRepository.AddModeratorPage;
import adminObjectRepository.HomePage;
import genericUtility.BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
@Listeners(genericUtility.ListnerImplementationClass.class)
public class CreateModeratorTest extends BaseClass

{
	@Test(invocationCount = 3)
	public void createModeratorPage() throws Throwable
	
	{
		WebDriverUtility wlib=new WebDriverUtility();
		JavaUtility jlib=new JavaUtility();
		driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
		HomePage homePage=new HomePage(driver);
		homePage.moderatorsModule();
		AddModeratorButton addModeratorButton=new AddModeratorButton(driver);
		Thread.sleep(2000);
		addModeratorButton.addModeratorButton();
//		Assert.assertEquals(false, true);
		AddModeratorPage addModeratorPage=new AddModeratorPage(driver);
		addModeratorPage.addModeratorDetails(jlib.getRandomName(),jlib.getRandomEmail(),jlib.getRandomPhoneNumber());
		homePage.signOut();
		homePage.logOut();
		
		
				
	}
	

}
