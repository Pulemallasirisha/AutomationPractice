package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String password = getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("sirisha");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.findElement(By.className("logout-btn")).click();
        driver.close();
 
	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = (driver.findElement(By.cssSelector("form p")).getText());
		// Please use temporary password 'rahulshettyacademy' to login.
		String[] passwordArray = passwordText.split("'");
		//[0] - please use temporary password
		//[1] - 'rahulshettyacademy' to login.
		
		//[0] - 'rahulshettyacademy'
		//[1] - to login.
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
