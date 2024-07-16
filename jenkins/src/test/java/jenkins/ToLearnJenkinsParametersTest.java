package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnJenkinsParametersTest 
{
	public static WebDriver driver;
	@Test
	public void receiveParameter() {
		String browserName = System.getProperty("browser");
		Reporter.log(browserName,true);
		if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();	
		Reporter.log("chrome browser launched successfully ",true);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched successfully ",true);
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			Reporter.log("edge browser launched successfully ",true);
		}
}
}
