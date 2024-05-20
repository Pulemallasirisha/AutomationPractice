//package PracticeOrangeHrm;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class AddEmployee {
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
//        driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
//        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//        driver.findElement(By.name("firstName")).sendKeys("Sirisha");
//        driver.findElement(By.cssSelector("input[placeholder='Middle Name']")).sendKeys("Goud");
//        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pulemalla");
//        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1208");
//        //driver.findElement(By.cssSelector("span.oxd-switch-input.oxd-switch-input--active.--label-right")).click();
//       // driver.findElement(By.xpath("//input[@fdprocessedid='biwbje']")).sendKeys("Sirisha Pulemalla");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        
//	}
//
//}
