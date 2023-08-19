package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class NewTest {
  @Test
  public void f() 
  {
	  DesiredCapabilities caps= new DesiredCapabilities();
	  
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "MZIBVKPRAMCMK7GM");
	  
	  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	  
	  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  
	  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	  
	  
	  
	  //Establishing the connection with appium server
	  
	  URL url = null;
	try 
	{
		url = new URL("http://localhost:4723/wd/hub");
	}
	catch (MalformedURLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
      WebDriver  driver= new RemoteWebDriver(url,caps);
      
      driver.get("https://www.villeos.com/");
  }
}
