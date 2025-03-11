import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\SA40168218\\eclipse-workspace\\sai\\myntra.properties");
		Properties property = new Properties();
		try {
			FileInputStream fis = new FileInputStream(file);
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.get(property.getProperty("url"));
		driver.findElement(By.xpath(property.getProperty("usernameLocation"))).sendKeys(property.getProperty("username"));
		driver.findElement(By.xpath(property.getProperty("pswdLocation"))).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath(property.getProperty("submitLocation"))).click();
		
	}
}
