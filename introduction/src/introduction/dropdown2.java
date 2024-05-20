package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
       
       
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
       {
    	   System.out.println("is enabled");
    	   Assert.assertTrue(true);
       }
       else
       {
    	   Assert.assertTrue(false);
       }
        	
        
        
        
        
        
        
        //count of checkboxes
        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        //driver.findElement(By.className())
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
      //  driver.findElement(By.id("hrefIncAdt")).click();
        //using for loop
        int i;
        for(i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        //while loop
//        int i = 1;
//        while(i<5)
//        {
//        	driver.findElement(By.id("hrefIncAdt")).click();
//        	i++;
//        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
