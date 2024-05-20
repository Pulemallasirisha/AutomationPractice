package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calenders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='Date of travel']")).click();
     
        List<WebElement> dates = driver.findElements(By.xpath("//span[@aria-label='December 31, 2023']"));
        int count = driver.findElements(By.xpath("//span[@aria-label='December 31, 2023']")).size();
        for(int i=0; i<count;i++)
        {
        	String text = driver.findElements(By.xpath("//span[@aria-label='December 31, 2023']")).get(i).getText();
        	if(text.equalsIgnoreCase("31"))
        	{
        		driver.findElements(By.xpath("//span[@aria-label='December 31, 2023']")).get(i).click();
        		break;
        		
        	}
        }
        

	}

}
