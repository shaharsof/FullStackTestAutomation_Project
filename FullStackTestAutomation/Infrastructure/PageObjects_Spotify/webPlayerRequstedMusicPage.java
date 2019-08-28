package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webPlayerRequstedMusicPage 
{

			//The result name of the Artist/Album/Song
			@FindBy(how = How.CLASS_NAME, using = "large")
			public WebElement resultName;
}
