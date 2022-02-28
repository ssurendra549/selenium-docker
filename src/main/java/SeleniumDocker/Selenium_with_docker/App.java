package SeleniumDocker.Selenium_with_docker;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 

{
	static WebDriver driver;
	static final String APP_URL = "https://www.ibm.com";
	static final String HOST_URL = "http://localhost:4444";
	@Test
	public static void getDriver() throws InterruptedException, MalformedURLException {
		ChromeOptions opt = new ChromeOptions();
	//	WebDriverManager.chromedriver().version("98.0.4758.102").setup();
		//driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL(HOST_URL), opt);
		driver.get(APP_URL);
		System.out.println("Title is " + driver.getTitle());
		Thread.sleep(10000);
	driver.quit();
}
}
