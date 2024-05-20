package Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

 //import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class JavascriptExecutor1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
       
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Screenshot
//        TakesScreenshot takescreenshot= (TakesScreenshot) driver;
//        File src = takescreenshot.getScreenshotAs(OutputType.FILE);
//        File dest = new File("C:\\Users\\siris\\screenshot.png");
//        FileUtils.copyFile(src,dest);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500;");
        
        List<WebElement>  values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for (int i =0;i<values.size();i++)
        {
        	sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        System.out.println(total);
        
       

	}

	

}
