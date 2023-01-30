package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import adminObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver sDriver;
	PropertyUtility plib=new PropertyUtility();
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void BS() 
	{
		System.out.println("Database Connection");
	}
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void BT() 
	{
		System.out.println("Execute script in parllel mode");
	}
//	@Parameters("BROWSER")// THis is only done for cross browser comment on @Parameter and replace "BROWSER" WITH "browser" and remove String BROWSER from the method and remove comment on plib.get
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void BC() throws Throwable
	{
		System.out.println("Launching the browser");
	String Browser = plib.getPropertyKeyValue("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		else
		{
		   driver=new ChromeDriver();
		}
		sDriver=driver;	
		
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void BM() throws Throwable
	{
		System.out.println("Login to Battlexo Web Application");
		String Url = plib.getPropertyKeyValue("url1");
	    String Username = plib.getPropertyKeyValue("username1");
	    String Password = plib.getPropertyKeyValue("password1");
	    Thread.sleep(1000);
	    driver.get(Url);
	    Thread.sleep(1000);
	    LoginPage login=new LoginPage(driver);
	    Thread.sleep(1000);
	    login.login(Username, Password);
		
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void AM() 
	{
		System.out.println("Logout from Battlexo Web Application");
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void AC() 
	{
	System.out.println("Closing the browser");	
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("parllel execution is done");
		
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("Database Connection is close");
	}

}
