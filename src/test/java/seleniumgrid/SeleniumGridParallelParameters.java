package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridParallelParameters
{
	@Test(priority=1)
	@Parameters ({"nodeurl","siteurl"})
	public void method1(String x, String y) throws Exception
	{
		URL u=new URL(x);
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		//DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		RemoteWebDriver driver=new RemoteWebDriver(u, dc);
		driver.get(y);
		Thread.sleep(5000);
		driver.close();
	}
}
