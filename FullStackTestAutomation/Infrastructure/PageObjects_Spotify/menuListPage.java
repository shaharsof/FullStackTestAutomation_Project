package PageObjects_Spotify;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class menuListPage 
{
	    //List of objects in menu
		@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right nav-main']/li")
		public List<WebElement> menuList;

}
