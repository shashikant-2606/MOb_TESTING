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
	
	
	@Parameters("browser")
  @BeforeTest
  public void setup(String browser) 
  {
	  switch(browser)
	  
	  {
	  case "chrome":
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
	
	break;
	
	  case "Edge":
		  DesiredCapabilities caps1= new DesiredCapabilities();
		  caps1.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  
		 //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		  
		  caps1.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		  
		  caps1.setCapability(MobileCapabilityType.BROWSER_NAME, "edge");
		  
		  
		  //Establishing the connection with appium server
		  
		  URL url1 = null;
		try 
		{
			url1= new URL("http://127.0.0.1:4723/wd/hub/");
		}
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new AndroidDriver(url1, caps1);
		
		System.out.println("Edge");
		
		break;
		
	  case "Safari":
		  DesiredCapabilities caps2= new DesiredCapabilities();
		  caps2.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  
		 //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		  
		  caps2.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		  
		  caps2.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		  
		  
		  //Establishing the connection with appium server
		  
		  URL url2 = null;
		try 
		{
			url1= new URL("http://127.0.0.1:4723/wd/hub/");
		}
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new AndroidDriver(url2, caps2);
		
		System.out.println("safari");
		
		break;
		
	  case "firefox":
		  DesiredCapabilities caps3= new DesiredCapabilities();
		  caps3.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  
		 //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		  
		  caps3.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		  
		  caps3.setCapability(MobileCapabilityType.BROWSER_NAME, "edge");
		  
		  
		  //Establishing the connection with appium server
		  
		  URL url3 = null;
		try 
		{
			url1= new URL("http://127.0.0.1:4723/wd/hub/");
		}
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new AndroidDriver(url3, caps3);
		
		System.out.println("firefox");
		
		break;
		
		default:
			System.out.println("no browser present");
      
  }
  }
}
