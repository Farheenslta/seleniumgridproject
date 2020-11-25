package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid 
{
	public static void main(String[] args) throws Exception
	{
		//At Node1
		URL u1=new URL("http://192.168.0.11:5555/wd/hub");
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		//DesiredCapabilities dc1=New DesiredCapabilities();
		//dc1.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		RemoteWebDriver driver1=new RemoteWebDriver(u1, dc1);
		driver1.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver1.close();
		
		//At Node2
		URL u2=new URL("http://192.168.0.11:6666/wd/hub");
		DesiredCapabilities dc2=DesiredCapabilities.chrome();
		//DesiredCapabilities dc2=new DesiredCapabilities();
		//dc2.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		RemoteWebDriver driver2=new RemoteWebDriver(u2, dc2);
		driver2.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver2.close();
		
		//At Node3
		URL u3=new URL("http://192.168.0.11:7777/wd/hub");
		DesiredCapabilities dc3=DesiredCapabilities.chrome();
		//DesiredCapabilities dc3=new DesiredCapabilities();
		//dc3.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		RemoteWebDriver driver3=new RemoteWebDriver(u3, dc3);
		driver3.get("http://www.flipkart.com");
		Thread.sleep(5000);
		driver3.close();
	}
}
