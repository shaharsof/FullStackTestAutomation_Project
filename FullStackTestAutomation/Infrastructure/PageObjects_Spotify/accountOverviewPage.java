package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountOverviewPage 
{
	//For the login Test Case (assert to Hello! text)
	@FindBy(how = How.XPATH, using = "//h2[@class='h1']")
	public WebElement headlineText;
	
	//To click at spotify logo to navigate to music overview page
	@FindBy(how = How.CLASS_NAME, using = "navbar-brand")
	public WebElement spotifyLogoButton;
	
	
}