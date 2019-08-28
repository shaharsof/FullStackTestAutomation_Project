package Utilities;

import org.openqa.selenium.support.PageFactory;

import PageObjects_Spotify.accountOverviewPage;
import PageObjects_Spotify.homePage;
import PageObjects_Spotify.loginPage;
import PageObjects_Spotify.menuListPage;
import PageObjects_Spotify.musicOverviewPage;
import PageObjects_Spotify.signUpPage;
import PageObjects_Spotify.webPlayerMenuPage;
import PageObjects_Spotify.webPlayerRequstedMusicPage;
import PageObjects_Spotify.webPlayerSearchPage;

public class managePages extends base 
{
	public static void init()
	{
		spotifyHome = PageFactory.initElements(driver, homePage.class);
		spotifyLogin = PageFactory.initElements(driver, loginPage.class);
		spotifyAccountOverview = PageFactory.initElements(driver, accountOverviewPage.class);
		spotifyMusicOverview = PageFactory.initElements(driver, musicOverviewPage.class);
		spotifyWebPlayerMenu = PageFactory.initElements(driver, webPlayerMenuPage.class);
		spotifyWebPlayerSearch = PageFactory.initElements(driver, webPlayerSearchPage.class);
		spotifyWebPlayerRequstedMusic = PageFactory.initElements(driver, webPlayerRequstedMusicPage.class);
		spotifyMenuList = PageFactory.initElements(driver, menuListPage.class);
		spotifySignUp = PageFactory.initElements(driver, signUpPage.class);
	}

}
