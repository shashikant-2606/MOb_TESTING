package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class NewTest 
{
	 AndroidDriver driver;
	
  @BeforeTest
  public void setup(String browser) 
  {
		  DesiredCapabilities caps= new DesiredCapabilities();
	      caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	  
	 //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	  
	      caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  
	      caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	  
	  
	  //Establishing the connection with appium server
	  
	  URL url = null;
	try 
	{
		url = new URL("http://127.0.0.1:4723/wd/hub/");
	}
	catch (MalformedURLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver=new AndroidDriver(url, caps);
	System.out.println("chrome");
	
	
      
  
  }
}
