package Assignmentsrahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckboxExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        
        driver.findElement(By.id("checkBoxOption2")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
