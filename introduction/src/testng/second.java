package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class second {
	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String Expectedtitle = "HYR Tutorials - Google Search";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle,Expectedtitle );
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void TestFacebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		Thread.sleep(5000);
		
		//Title assertion 
//		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Log in to Facebook";
//		Assert.assertEquals(ActualTitle,ExpectedTitle, "Title is mismatched" );
//		driver.navigate().back();
//		
//		//url assertion
//		String ActualUrl = driver.getCurrentUrl();
//		String ExpectedUrl = "https://www.facebook.com/";
//		Assert.assertEquals(ActualUrl,ExpectedUrl, " url is mismatched" );
//		
//		//Text assertion
//		String ActualText = driver.findElement(By.name("email")).getAttribute("value");
//		String ExpectedText=" " ;
//		Assert.assertEquals(ActualText,ExpectedText, "text is mismatched");
//		
//		// border assertion
//		String Actualborder = driver.findElement(By.name("email")).getCssValue("border");
//		String ExpectedBorder="1px solid rgb(221, 223, 226)" ;
//		Assert.assertEquals(Actualborder,ExpectedBorder, "username border is mismatched");
//		
//		//Error Assertion
//		
//		String ExpectedError = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
//		String ActualError= driver.findElement(By.xpath("div[@id='email_container']/div[2]")).getText();;
//		Assert.assertEquals(ActualError,ExpectedError, "error message is mis matched");
//		
//		
//		driver.quit();
		
		SoftAssert softAssert = new SoftAssert();
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		Assert.assertNotEquals(actualUrl, expectedUrl, "URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
		
		//Border Assertion
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(221, 223, 226)";
		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");
		
		//ErrorMessage Assertion
		String actualErrorMessage = driver.findElement(By.xpath("div[@id='email_container']/div[2]")).getText();
		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");
		
		driver.quit();
		softAssert.assertAll();
		
	}
}

