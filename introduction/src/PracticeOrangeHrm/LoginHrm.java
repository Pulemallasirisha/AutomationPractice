//package PracticeOrangeHrm;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//public class LoginHrm {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeOptions cop = new ChromeOptions();
//        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//        WebDriver driver = new ChromeDriver(cop);
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.findElement(By.className("oxd-main-menu-item")).click();
//        driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
//       // driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
////        WebElement staticDropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
////        staticDropdown.click();
////        WebElement Value = driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom'] //div[@role='option'][2]"));
////        Value.click();
////        driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Linda Anderson");
////        WebElement staticDropdown1 = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
////        staticDropdown1.click();
////        WebElement Value1 = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
////        Value1.click();
//        WebElement table=driver.findElement(By.xpath("//div[@role='table']"));
//        System.out.println( table.findElements(By.cssSelector(".oxd-table-card")).size());
//      
//   
//        
//       
//
//        
//        
//        
//        
//	}
//
//}
