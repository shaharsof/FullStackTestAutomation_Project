package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage 
{
	@FindBy(how = How.ID, using = "login-username")
	public WebElement loginUserName;
	
	@FindBy(how = How.ID, using = "login-password")
	public WebElement loginPassword;
	
	@FindBy(how = How.CLASS_NAME, using = "control-indicator")
	public WebElement rememberMeCheckBox;
	
	@FindBy(how = How.ID, using = "login-button")
	public WebElement loginButton;
	

}
