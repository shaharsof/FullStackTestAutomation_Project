package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signUpPage 
{
	// email text box
	@FindBy(how = How.ID, using = "register-email")
	public WebElement emailTextBox;

	// confirm email text box
	@FindBy(how = How.ID, using = "register-confirm-email")
	public WebElement confirmEmailTextBox;

	//assert to wrong email message
	@FindBy(how = How.XPATH, using = "//label[@class='has-error']")
	public WebElement wrongEmailText;




}
