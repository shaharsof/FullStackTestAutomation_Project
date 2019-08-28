package WorkFlows;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Extensions.click;
import Extensions.update;
import Utilities.commonOps;

public class spotify_web_signup extends commonOps
{
	public static void go(String email) throws IOException, ParserConfigurationException, SAXException
	{
		//Click at sign up button
		click.go(spotifyHome.signUpLink);

		//Enter email for sign up
		update.text(spotifySignUp.emailTextBox, email);
		
		//Enter at confirm Email Text Box
		click.go(spotifySignUp.confirmEmailTextBox);

	}

}
