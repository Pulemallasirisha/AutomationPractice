package Assignmentsrahulshetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UIdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Sirisha Goud");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sirishagoudpulemalla@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Siri@1208");
        driver.findElement(By.id("exampleCheck1")).click();
        
        List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

        String option = "Female";

        for (int i = 0; i < allOptions.size(); i++) {

        	if (allOptions.get(i).getText().contains(option)) {

        		allOptions.get(i).click();

        		System.out.println("clicked");

        		break;
        	}

     }
        
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("12-06-1998");
        driver.findElement(By.cssSelector("input.btn.btn-success")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")));

	}

}
