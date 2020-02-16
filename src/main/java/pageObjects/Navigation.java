package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	
	public WebDriver driver;
	
	public Navigation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By song=By.linkText("Ninne Pelladatha");
	By download=By.linkText("Download");
	
	
	public WebElement Selectsong()
	{
		return driver.findElement(song);
	}
	public WebElement Downloading()
	{
		return driver.findElement(download);
	}

}
