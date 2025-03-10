import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingFlipkart {
	WebDriver wbDriver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		wbDriver = new ChromeDriver();
		wbDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wbDriver.manage().window().maximize();
	}
	
	@Test
	public void openingFlipkart() {
		wbDriver.get("https://flipkart.com/");
	}
}
