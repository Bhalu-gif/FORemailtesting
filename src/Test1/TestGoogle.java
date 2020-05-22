package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogle
{
    WebDriver driver;
	@Test()
	public void Tester()
	{
	  System.setProperty("webdriver.chrome.driver","F:\\version\\chromedriver_win32 (1)\\chromedriver.exe");
 	  driver = new ChromeDriver();
 	  driver.get("https://www.amazon.in/");
 	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
 	  driver.manage().window().maximize();
}
}