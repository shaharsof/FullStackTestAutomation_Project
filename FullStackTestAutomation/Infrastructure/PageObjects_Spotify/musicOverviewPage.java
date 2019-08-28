package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class musicOverviewPage 
{
	//To click at 'open web player' button to open the player 
	@FindBy(how = How.ID, using = "seg-hp-open-player")
	public WebElement webPlayerButton;

	//To click at profile combobox
	@FindBy(how = How.CLASS_NAME, using = "user-text")
	public WebElement profileButton;

	//To click at logout button
	@FindBy(how = How.CLASS_NAME, using = "logout-link")
	public WebElement logoutButton;

}
