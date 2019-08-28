package Tests;


import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import Extensions.verify;
import Utilities.commonOps;
import WorkFlows.spotify_web_login;
import WorkFlows.spotify_web_search;
import WorkFlows.spotify_web_signup;

public class spotify extends commonOps
{
	@Test
	public void test01_searchArtist() throws IOException, ParserConfigurationException, SAXException, FindFailed
	{
		spotify_web_login.go("shaharsof@gmail.com", "Coltrain75");
		spotify_web_search.go("Nick Drake");
		verify.textInElement(spotifyWebPlayerRequstedMusic.resultName, "Nick Drake");
		verify.image("./ImageRepository/SpotifyLogo.PNG");
	}

	@Test
	public void test02_userLogin() throws IOException, ParserConfigurationException, SAXException
	{
		spotify_web_login.go("shaharsof@gmail.com", "Coltrain75");
		verify.textInElement(spotifyAccountOverview.headlineText, "Hello!");
	}

	@Test
	public void test03_userSignUp() throws IOException, ParserConfigurationException, SAXException
	{
		spotify_web_signup.go("shahar");
		verify.textInElement(spotifySignUp.wrongEmailText, "The email address you supplied is invalid.");
	}
}
