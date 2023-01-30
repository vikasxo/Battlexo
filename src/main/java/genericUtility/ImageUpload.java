package genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ImageUpload
{
	public void AddIconImage() throws AWTException
	{
		Robot rb1=new Robot();
		StringSelection str=new StringSelection("C:\\Users\\bhara\\Downloads\\download (1).jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
	     rb1.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb1.keyRelease(KeyEvent.VK_CONTROL);
	    rb1.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb1.keyPress(KeyEvent.VK_ENTER);
	    rb1.keyRelease(KeyEvent.VK_ENTER);
	}
	public void AddBannerImage() throws AWTException
	{
		Robot rb2=new Robot();
		StringSelection str1=new StringSelection("C:\\Users\\bhara\\Downloads\\download (2).jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1,null);
		rb2.keyPress(KeyEvent.VK_CONTROL);
	     rb2.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb2.keyRelease(KeyEvent.VK_CONTROL);
	    rb2.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb2.keyPress(KeyEvent.VK_ENTER);
	    rb2.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void AddTournamentBanner() throws AWTException
	{
		Robot rb2=new Robot();
		StringSelection str1=new StringSelection("C:\\Users\\bhara\\Downloads\\download (2).jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1,null);
		rb2.keyPress(KeyEvent.VK_CONTROL);
	     rb2.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb2.keyRelease(KeyEvent.VK_CONTROL);
	    rb2.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb2.keyPress(KeyEvent.VK_ENTER);
	    rb2.keyRelease(KeyEvent.VK_ENTER);
	}
			

}
