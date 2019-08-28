package Extensions;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.commonOps;

public class click extends commonOps
{
	public static void go(WebElement elem) throws IOException, ParserConfigurationException, SAXException
	{
		try
		{
			//Can Implement ExplicitlyWait here
			elem.click();
			test.log(LogStatus.PASS, "Element Clicked Successfully");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Failed to Click on Element, See details: " + e + "See Screenshot: " + test.addScreenCapture(takeSS()));
			fail("Failed to Click on Element");
			
		}
		
	}
	
}
