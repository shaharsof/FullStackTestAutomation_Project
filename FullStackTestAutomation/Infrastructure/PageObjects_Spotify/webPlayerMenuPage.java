package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webPlayerMenuPage 
{
	//To click at search button for searching an Artist/Album/Song
	@FindBy(how = How.XPATH, using = "//*[@aria-label='Search']")
	public WebElement searchButton;

}
