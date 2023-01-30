package adminObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTournamentPage 
{
	// initalization
				public AddTournamentPage(WebDriver driver)
				{
					PageFactory.initElements(driver,this);	
				}
		//declaration
				@FindBy(xpath="(//div[@class='uploader-container'])[2]")
				private WebElement AddTournamentBanner;
				
				@FindBy(xpath="//a[@name='gameId']")
				private WebElement SelectGame;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectGameMenuItem;
				
				@FindBy(xpath="//span[text()='Select Tournament Format']")
				private WebElement SelectTournamentFormat;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectTournamentMenuItem;
				
				@FindBy(xpath="//input[@placeholder='Enter Tournament Title']")
				private WebElement TournamentTitleTextField;
				
				@FindBy(xpath="//span[text()='Select Registration End Date']")
				private WebElement RegistrationEndDate;
				
				@FindBy(xpath="(//span[@class='rs-calendar-table-cell-day'])[31]")
				private WebElement SelectRegistrationEndDate;
				
				@FindBy(xpath="//a[@name='startDate']")
				private WebElement TournamentStartDate;
				
				
				@FindBy(xpath="(//span[@class='rs-calendar-table-cell-day'])[33]")
				private WebElement SelectTournamentStartDate;
				
				
				@FindBy(xpath="//input[@name='teamMaxSize']")
				private WebElement MaximumNumberOfTeamMembers;
				
				@FindBy(xpath="//span[text()='Select Tournament End Date']")
				private WebElement TournamentEndDate;
				
				@FindBy(xpath="(//span[@class='rs-calendar-table-cell-day'])[40]")
				private WebElement SelectTournamentEndDate;
				
				@FindBy(xpath="//input[@name='teamMinSize']")
				private WebElement MinimumNumberOfTeamMembers;
				
				@FindBy(xpath="//input[@name='maxTeams']")
				private WebElement EnterMaximumNumberOfTeams;
				
				@FindBy(xpath="//input[@name='minTeams']")
				private WebElement EnterMinimumNumberOfTeams;
				
				@FindBy(xpath="//a[@name='visibility']")
				private WebElement TournamentVisibility;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectTournamentVisibility;
				
				@FindBy(xpath="//a[@name='spaceId']")
				private WebElement HostedBy;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectHost;
				
				@FindBy(xpath="//span[text()='Select Moderator Count']")
				private WebElement ModeratorCount;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectModeratorCount;
				
				@FindBy(xpath="//a[@name='tournamentType']")
				private WebElement TournamentType;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectTournamentType;
				
				@FindBy(xpath="//textarea[@name='description']")
				private WebElement TournamentDiscription;
				
				@FindBy(xpath="//input[@placeholder='Enter Rule']")
				private WebElement EnterRule;
				
				@FindBy(xpath="//a[@name='tournamentConfig[0].placeHolder']")
				private WebElement GameParameter;
				
				@FindBy(xpath="//a[@class='rs-picker-select-menu-item rs-picker-select-menu-item-active rs-picker-select-menu-item-focus rs-picker-select-menu-item-disabled']")
				private WebElement SelectGameParameter;
				
				@FindBy(xpath="//input[@placeholder='Enter Parameter Points']")
				private WebElement EnterParameterPoints;
				
				@FindBy(xpath="//a[@name='playoffsConfig[0].roundType']")
				private WebElement RoundType;
				
				@FindBy(xpath="(//a[@class='rs-picker-select-menu-item'])[1]")
				private WebElement SelectRoundType;
				
				@FindBy(xpath="//button[@type='submit']")
				private WebElement CreateTournament;
				
				
				
				//getters methods
               public WebElement getSelectGame() {
					return SelectGame;
				}

				public WebElement getSelectTournamentFormat() {
					return SelectTournamentFormat;
				}

				public WebElement getCreateTournament() {
					return CreateTournament;
				}

		
				public WebElement getAddTournamentBanner() {
					return AddTournamentBanner;
				}

				public WebElement getSelectGameDropDown() {
					return SelectGame;
				}

				public WebElement getSelectGameMenuItem() {
					return SelectGameMenuItem;
				}

				public WebElement getSelectTournamentFormatDropDown() {
					return SelectTournamentFormat;
				}

				public WebElement getSelectTournamentMenuItem() {
					return SelectTournamentMenuItem;
				}

				public WebElement getTournamentTitleTextField() {
					return TournamentTitleTextField;
				}

				public WebElement getRegistrationEndDate() {
					return RegistrationEndDate;
				}

				public WebElement getSelectRegistrationEndDate() {
					return SelectRegistrationEndDate;
				}

				public WebElement getTournamentStartDate() {
					return TournamentStartDate;
				}

				public WebElement getSelectTournamentStartDate() {
					return SelectTournamentStartDate;
				}

				public WebElement getMaximumNumberOfTeamMembers() {
					return MaximumNumberOfTeamMembers;
				}

				public WebElement getTournamentEndDate() {
					return TournamentEndDate;
				}

				public WebElement getSelectTournamentEndDate() {
					return SelectTournamentEndDate;
				}

				public WebElement getMinimumNumberOfTeamMembers() {
					return MinimumNumberOfTeamMembers;
				}

				public WebElement getEnterMaximumNumberOfTeams() {
					return EnterMaximumNumberOfTeams;
				}

				public WebElement getEnterMinimumNumberOfTeams() {
					return EnterMinimumNumberOfTeams;
				}

				public WebElement getTournamentVisibility() {
					return TournamentVisibility;
				}

				public WebElement getSelectTournamentVisibility() {
					return SelectTournamentVisibility;
				}

				public WebElement getHostedBy() {
					return HostedBy;
				}

				public WebElement getSelectHost() {
					return SelectHost;
				}

				public WebElement getModeratorCount() {
					return ModeratorCount;
				}

				public WebElement getSelectModeratorCount() {
					return SelectModeratorCount;
				}

				public WebElement getTournamentType() {
					return TournamentType;
				}

				public WebElement getSelectTournamentType() {
					return SelectTournamentType;
				}

				public WebElement getTournamentDiscription() {
					return TournamentDiscription;
				}

				public WebElement getEnterRule() {
					return EnterRule;
				}

				public WebElement getGameParameter() {
					return GameParameter;
				}

				public WebElement getSelectGameParameter() {
					return SelectGameParameter;
				}

				public WebElement getEnterParameterPoints() {
					return EnterParameterPoints;
				}

				public WebElement getRoundType() {
					return RoundType;
				}

				public WebElement getSelectRoundType() {
					return SelectRoundType;
				}
				
				// Business Logics
				/**
				 *@author Vikas
				 * @throws InterruptedException 
				 */
				
				public void addFirstHalfTournamentDetails(String TournamentTitle,String MaxTeamMembers,String MinTeamMembers,String MaxNumberTeams,String MinNumberTeams) throws InterruptedException
				{
				 SelectGame.click();
				 Thread.sleep(2000);
				 SelectGameMenuItem.click();
				 Thread.sleep(2000);
				 SelectTournamentFormat.click();
				 Thread.sleep(2000);
				 SelectTournamentMenuItem.click();
				 Thread.sleep(2000);
				 TournamentTitleTextField.sendKeys(TournamentTitle);
				 Thread.sleep(2000);
				 RegistrationEndDate.click();
				 Thread.sleep(2000);
				 SelectRegistrationEndDate.click();
				 Thread.sleep(2000);
				 TournamentStartDate.click();
				 Thread.sleep(2000);
				 SelectTournamentStartDate.click();
				 Thread.sleep(2000);
				 MaximumNumberOfTeamMembers.sendKeys(MaxTeamMembers);
				 Thread.sleep(2000);
				 TournamentEndDate.click();
				 Thread.sleep(2000);
				 SelectTournamentEndDate.click();
				 Thread.sleep(2000);
				 MinimumNumberOfTeamMembers.sendKeys(MinTeamMembers);
				 Thread.sleep(2000);
				 EnterMaximumNumberOfTeams.sendKeys(MaxNumberTeams);
				 Thread.sleep(2000);
				 EnterMinimumNumberOfTeams.sendKeys(MinNumberTeams);
				 Thread.sleep(2000);
				 }
				public void addSecondHalfTournamentDetails(String TourDiscription,String Rule,String ParameterPoints) throws InterruptedException
				{
					Thread.sleep(2000);
					TournamentVisibility.click();
					Thread.sleep(2000);
					SelectTournamentVisibility.click();
					HostedBy.click();
					Thread.sleep(2000);
					SelectHost.click();
					Thread.sleep(2000);
					ModeratorCount.click();
					Thread.sleep(2000);
					SelectModeratorCount.click();
					Thread.sleep(2000);
					TournamentType.click();
					Thread.sleep(2000);
					SelectTournamentType.click();
					Thread.sleep(2000);
					TournamentDiscription.sendKeys(TourDiscription);
					Thread.sleep(2000);
					EnterRule.sendKeys(Rule);
					Thread.sleep(2000);
					GameParameter.click();
					Thread.sleep(2000);
					SelectGameParameter.click();
					Thread.sleep(2000);
					EnterParameterPoints.sendKeys(ParameterPoints);
					Thread.sleep(2000);
					RoundType.click();
					Thread.sleep(2000);
					SelectRoundType.click();
					Thread.sleep(2000);
					CreateTournament.click();
			
				}
				
				public void addTournamentBanner()
				{
					AddTournamentBanner.click();
					HostedBy.click();
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
