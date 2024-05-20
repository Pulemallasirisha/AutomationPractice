package Actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.manage().window().maximize();
      //get all urls
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        //System.out.println(driver.findElements(By.tagName("a")).size());
      List<WebElement> links =  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
      //SoftAssert a = new SoftAssert();
        for(WebElement link:links)
        {
        	String url = link.getAttribute("href");
        	HttpURLConnection connection =(HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int rescode =connection.getResponseCode();
            System.out.println(rescode);
           // a.assertTrue(rescode>404,"the link with text" +link.getText()+ "is broken" +rescode );
            if(rescode>404)
            {
            	System.out.println("the link with text" +link.getText()+ "is broken" +rescode);
            	Assert.assertTrue(false);
            }
        	
        }
        //a.assertAll();
        
        
       
	}

}
