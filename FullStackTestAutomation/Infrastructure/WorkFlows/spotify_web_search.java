package WorkFlows;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Extensions.click;
import Extensions.update;
import Utilities.commonOps;

public class spotify_web_search extends commonOps
{
	public static void go(String searchValue) throws IOException, ParserConfigurationException, SAXException
	{
		
		//Click at Login button
//		click.go(spotifyHome.loginLink);
		//Enter user name/email
//		update.text(spotifyLogin.loginUserName, userName);
		//Enter Password
//		update.text(spotifyLogin.loginPassword, password);
		//Click at Remember me checkbox
//		click.go(spotifyLogin.rememberMeCheckBox);
		//Click at login button
//		click.go(spotifyLogin.loginButton);
		
		//Click at Spotify Logo
		click.go(spotifyAccountOverview.spotifyLogoButton);
		
		//Click at web player button
		click.go(spotifyMusicOverview.webPlayerButton);
		
		//Click at search button
		click.go(spotifyWebPlayerMenu.searchButton);
		
		//The function will get the search web element and the value to search Artist/Album/Song
		update.text(spotifyWebPlayerSearch.searchBox, searchValue);
		
		//Click at the result field Artist/Album/Song
		click.go(spotifyWebPlayerSearch.resultField);
		
	}
	

}
