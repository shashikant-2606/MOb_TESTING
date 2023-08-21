package test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class NewTest {
  @Test
  public void f() 
  {
	  DesiredCapabilities caps= new DesiredCapabilities();
	  
	  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	  
	 //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	  
	  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  
	  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	  
	  TestWatcher watcher = Factory.createWatcher();
	  
	  
	  
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
	EnhancedAndroidDriver driver;
	  driver = Factory.createAndroidDriver(url, caps);
      
      driver.get("https://www.villeos.com/");
  }
}
