package KPGRC;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Navigation;
import resources.Base;

public class SongDownload extends Base{
	@BeforeTest
	public void Download() throws IOException
	{
	
	 driver=InitialiseBrowser();
	 driver.manage().window().maximize();
	 
	}
	@Test
	public void StepsToDownload()
	{
	 driver.get(prop.getProperty("url"));
	 Navigation nv=new Navigation(driver);
	 nv.Selectsong().click();
	 nv.Downloading().click();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
