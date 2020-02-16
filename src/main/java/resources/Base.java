package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public Properties prop;

	public WebDriver InitialiseBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\\\Users\\\\hkasc\\\\Casetrack\\\\src\\\\main\\\\java\\\\resources\\\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}

}
