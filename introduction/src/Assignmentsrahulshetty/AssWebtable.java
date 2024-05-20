package Assignmentsrahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        //number of rows
        int rows= driver.findElements(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody/tr")).size();
        System.out.println(rows);
        
        //number of columns
        int Columns= driver.findElements(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody/tr/th")).size();
        System.out.println(Columns);
        
        //print the values of second row data 
        System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[3]")).getText());
        
//        for(int i=2;i<rows;i++)
//        {
//        	for(int j=1;j<Columns;j++)
//        	{
//        		System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[3]")).getText());
//        	}
//        }

	}

}
