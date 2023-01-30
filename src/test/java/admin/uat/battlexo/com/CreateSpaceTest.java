package admin.uat.battlexo.com;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import adminObjectRepository.AddSpaceButton;
import adminObjectRepository.AddSpacePage;
import adminObjectRepository.HomePage;
import genericUtility.BaseClass;
import genericUtility.ImageUpload;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.ListnerImplementationClass.class)
public class CreateSpaceTest extends BaseClass 

{
	@Test(invocationCount =500)
	public void createSpacePage() throws Throwable
	
	{
		WebDriverUtility wlib=new WebDriverUtility();
		JavaUtility jlib=new JavaUtility();
		driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
		HomePage homePage=new HomePage(driver);
		Thread.sleep(2000);
		homePage.spacesModule();
		AddSpaceButton addSpaceButton=new AddSpaceButton(driver);
		Thread.sleep(1000);
//		Assert.assertEquals(false, true);
		addSpaceButton.addSpaceButton();
		AddSpacePage addSpacePage=new AddSpacePage(driver);
		addSpacePage.addIconButton();
		Thread.sleep(2000);
		ImageUpload imageUpload=new ImageUpload();
		Thread.sleep(2000);
		addSpacePage.addBannerButton();
		imageUpload.AddIconImage();
		Thread.sleep(2000);
		imageUpload.AddBannerImage();
		Thread.sleep(2000);
		addSpacePage.addSpaceDetails(jlib.getRandomName(),jlib.getRandomName());
		addSpacePage.createSpace();
		homePage.signOut();
		homePage.logOut();
		
				
		
	}
	
	

}
