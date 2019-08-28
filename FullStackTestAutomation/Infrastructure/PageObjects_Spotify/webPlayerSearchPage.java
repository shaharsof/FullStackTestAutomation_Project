package PageObjects_Spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webPlayerSearchPage 
{
		
		//To enter the name of the Artist/Album/Song
		@FindBy(how = How.CLASS_NAME, using = "SearchInputBox__input")
		public WebElement searchBox;
		
		
		// To Delete
		//@FindBy(how = How.CLASS_NAME, using = "mo-info-name")
		
		//Click at the requested Artist/Album/Song
		@FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-sm-4 col-md-3 col-lg-3 col-xl-2 top-artist']//a[@class='mo-info-name']")
		public WebElement resultField;

}
