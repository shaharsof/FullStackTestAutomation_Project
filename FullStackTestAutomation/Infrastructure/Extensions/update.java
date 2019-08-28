package Extensions;

import static org.testng.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.commonOps;

public class update extends commonOps
{
	public static void text(WebElement elem, String value) throws IOException, ParserConfigurationException, SAXException
	{
		try
		{
			//Can Implement ExplicitlyWait here
			elem.sendKeys(value);
			test.log(LogStatus.PASS, "Text Field Updated Successfully");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Failed to Update Text Field, See details: " + e + "See Screenshot: " + test.addScreenCapture(takeSS()));
			fail("Failed to Update Text Field");
		}
	}

}
