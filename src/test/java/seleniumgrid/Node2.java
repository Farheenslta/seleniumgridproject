package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2
{
	@Test(priority=2)
	public void method2() throws Exception
	{
		//At Node2
		URL u2=new URL("http://192.168.0.11:6666/wd/hub");
		DesiredCapabilities dc2=DesiredCapabilities.chrome();
		//DesiredCapabilities dc2=new DesiredCapabilities();
		//dc2.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		RemoteWebDriver driver2=new RemoteWebDriver(u2, dc2);
		driver2.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver2.close();
	}
}
