package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;;
	@Test(dataProvider = "LoginTestData")
	  public void TestLogin(String username , String password) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      ChromeOptions cop = new ChromeOptions();
	      cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	      driver = new ChromeDriver(cop);
	      driver.manage().window().maximize();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      Thread.sleep(5000);
	      driver.findElement(By.name("username")).sendKeys(username);
	      driver.findElement(By.name("password")).sendKeys(password);
	      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	   
	      
	      
	      
	  }
	
	
	@DataProvider(name = "LoginTestData")
	public Object[][] LoginData() {
		Object [][] data= new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] ="Admin";
		data[1][1] ="admin12";
		return data;
	}
	

}
