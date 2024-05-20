package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        
        //to get count of first column
        WebElement columndriver = footerdriver.findElement(By.xpath("//table//tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        
        //click on each link in column
        int i;
        for(i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
        	String clickonTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);
        	Thread.sleep(3000);
        }
        	Set<String> title =driver.getWindowHandles(); 
        	 Iterator<String>it = title.iterator(); 
        	 
        	 while(it.hasNext())
        	 {
        		driver.switchTo().window(it.next());
        		System.out.println(driver.getTitle());
        	 }
        	 
        	
        
   

	}

}
