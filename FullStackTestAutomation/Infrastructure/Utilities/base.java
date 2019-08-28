package Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObjects_Spotify.accountOverviewPage;
import PageObjects_Spotify.homePage;
import PageObjects_Spotify.loginPage;
import PageObjects_Spotify.menuListPage;
import PageObjects_Spotify.musicOverviewPage;
import PageObjects_Spotify.signUpPage;
import PageObjects_Spotify.webPlayerMenuPage;
import PageObjects_Spotify.webPlayerRequstedMusicPage;
import PageObjects_Spotify.webPlayerSearchPage;

public class base 
{
	public static WebDriver driver;
	public static Screen screen;
	public static homePage spotifyHome;
	public static loginPage spotifyLogin;
	public static accountOverviewPage spotifyAccountOverview;
	public static musicOverviewPage spotifyMusicOverview;
	public static webPlayerMenuPage spotifyWebPlayerMenu;
	public static webPlayerSearchPage spotifyWebPlayerSearch;
	public static webPlayerRequstedMusicPage spotifyWebPlayerRequstedMusic;
	public static menuListPage spotifyMenuList;
	public static signUpPage spotifySignUp;

	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
	
}	
