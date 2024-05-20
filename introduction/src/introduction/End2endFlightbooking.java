package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class End2endFlightbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
     	   System.out.println("is disaabled");
     	   Assert.assertTrue(true);
        }
        else
        {
     	   Assert.assertTrue(false);
        }
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        
        int i;
        for(i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        //driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        //driver.findElement(By.cssSelector("input[type='submit']")).click();
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
       // driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        driver.findElement(By.cssSelector("input[value='Search']")).click();
       

	}

}
