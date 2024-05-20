package OutsidePractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Actions a = new Actions(driver);
//    	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click();
        
//        System.out.println(driver.findElements(By.tagName("a")).size());
//        
//        WebElement footerdriver = driver.findElement(By.id("navFooter"));
//        System.out.println(footerdriver.findElements(By.tagName("a")).size());
//        
//        WebElement columndriver = footerdriver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[3]"));
//        System.out.println(columndriver.findElements(By.tagName("a")).size());
//        
//        int i;
//        for(i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
//        {
//        	String clickonTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);
//        	Thread.sleep(3000);
//        }
//        	Set<String> title =driver.getWindowHandles(); 
//        	 Iterator<String>it = title.iterator(); 
//        	 
//        	 while(it.hasNext())
//        	 {
//        		driver.switchTo().window(it.next());
//        		System.out.println(driver.getTitle());
//        	 }
        	 
        
        	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]")).click();
        	 driver.findElement(By.id("ap_email")).sendKeys(" ");
        	 driver.findElement(By.id("continue")).click();
        	 System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText());
        	 
        	 driver.findElement(By.id("ap_email")).sendKeys("9550829610");
        	 driver.findElement(By.id("continue")).click();
        	 driver.findElement(By.id("ap_password")).sendKeys("Siri@1203");
        	 driver.findElement(By.id("signInSubmit")).click();
        	// System.out.println(driver.findElement(By.xpath("(//div[@class='a-box-inner a-alert-container'])[1]")).getText());
        	 driver.findElement(By.cssSelector("a[id='auth-fpp-link-bottom']")).click();
        	 driver.findElement(By.cssSelector("input[tabindex='3']")).click();
        	 
        	 //otp
//        	 driver.findElement(By.id("cvf-input-code")).sendKeys("936639");
//        	 driver.findElement(By.xpath("//input[@aria-labelledby='cvf-submit-otp-button-announce']")).click();
//        	 driver.findElement(By.id("ap_fpp_password")).sendKeys("Siri@1203");
//        	 driver.findElement(By.id("ap_fpp_password_check")).sendKeys("Siri@1203");
//        	 driver.findElement(By.cssSelector("input[fdprocessedid='4io4v']")).click();
	}

}
