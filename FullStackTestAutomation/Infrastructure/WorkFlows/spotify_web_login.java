package WorkFlows;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Extensions.click;
import Extensions.update;
import Utilities.commonOps;

public class spotify_web_login extends commonOps
{
	public static void go(String userName, String password) throws IOException, ParserConfigurationException, SAXException
	{
		//Click at Login button
		click.go(spotifyHome.loginLink);
		
		//Enter user name/email for login
		update.text(spotifyLogin.loginUserName, userName);
		
		//Enter Password
		update.text(spotifyLogin.loginPassword, password);
		
		//Click at Remember me checkbox
		click.go(spotifyLogin.rememberMeCheckBox);
		
		//Click at login button
		click.go(spotifyLogin.loginButton);
	}

}
