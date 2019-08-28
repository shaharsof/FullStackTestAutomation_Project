package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage 
{
	//Login link
	@FindBy(how = How.ID, using = "header-login-link")
	public WebElement loginLink;

	//Login link
	@FindBy(how = How.ID, using = "nav-link-sign-up")
	public WebElement signUpLink;

}
