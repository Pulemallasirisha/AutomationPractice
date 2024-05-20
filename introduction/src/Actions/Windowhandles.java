package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String>it = window.iterator();
        String parentId=it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(  driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
 //       driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at");
        
        
       String emailId =  driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
       driver.switchTo().window(parentId);

       driver.findElement(By.name("username")).sendKeys(emailId );
       
       

	}

}
