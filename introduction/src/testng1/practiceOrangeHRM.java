package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceOrangeHRM {
	WebDriver driver1;
	@Parameters("browserName")
	@BeforeTest
	public void InitialiseBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver1 = new ChromeDriver();
			break;
		default:
			System.out.println("Browsername is invalid");
			break;
		}
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Parameters("sleepTime")
	@AfterTest
	public void TearDown(Long sleepTime) throws Exception {
		System.out.println(sleepTime);
		Thread.sleep(sleepTime);
		driver1.quit();
	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String url) {
		driver1.get(url);
	}
	
	@Parameters({"username", "password"})
	@Test
	public void EnterLoginDetails(String userName, String password) {
		driver1.findElement(By.name("username")).sendKeys(userName);
        driver1.findElement(By.name("password")).sendKeys(password);
        driver1.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver1.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		boolean actualValue = driver1.findElement(By.xpath("(//h6[normalize-space()='Personal Details'])[1]")).isDisplayed();
		Assert.assertTrue(actualValue);
	}
	
	

}
