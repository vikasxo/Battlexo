package admin.uat.battlexo.com;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import adminObjectRepository.AddTournamentPage;
import adminObjectRepository.CreateTournamentPage;
import adminObjectRepository.HomePage;
import genericUtility.BaseClass;
import genericUtility.ImageUpload;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.ListnerImplementationClass.class)

public class CreateTournamentTest extends BaseClass 
{
	@Test()
	public void createTournamentPage() throws Throwable
	
	{
		WebDriverUtility wlib=new WebDriverUtility();
		JavaUtility jlib=new JavaUtility();
		driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
		HomePage homePage=new HomePage(driver);
		homePage.tournamentModule();
		CreateTournamentPage createTournamentPage=new CreateTournamentPage(driver);
		Thread.sleep(2000);
		createTournamentPage.createTournamentModule();
		AddTournamentPage addTournamentPage=new AddTournamentPage(driver);
		addTournamentPage.addTournamentBanner();
		Thread.sleep(2000);
		ImageUpload imageUpload=new ImageUpload();
		Thread.sleep(2000);
		imageUpload.AddTournamentBanner();
		Thread.sleep(2000);
		addTournamentPage.addFirstHalfTournamentDetails(jlib.getRandomTournamentTitleName(), jlib.getRandomNumber(),jlib.getRandomNumber(),jlib.getRandomNumber(),jlib.getRandomNumber());
        JavascriptExecutor js=(JavascriptExecutor)driver;	
        js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		addTournamentPage.addSecondHalfTournamentDetails(jlib.getRandomName(),jlib.getRandomNumber(),jlib.getRandomName());
//		driver.close();
		

}
}
