package OutsidePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calenders {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siris\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\siris\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cop);
        
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//        //current date;
//        int day =30;
//        driver.findElement(By.id("first_date_picker")).click();
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
        
        //when past ,present,future dates are present
//        driver.findElement(By.id("second_date_picker")).click();
//        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not (contains(@class ,'ui-datepicker-other-month '))]/a[text()='1']")).click();
//        
//        
//        driver.findElement(By.id("third_date_picker")).click();
//        
        
		String targetDate = "25/Feb/2029" ;
		Calendar calendar = Calendar. getInstance();
		
		try {
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		targetDateFormat.setLenient(false);
			try {
				Date formatedtargetDate = targetDateFormat.parse(targetDate);
				//Calendar calender = " ";
				calendar.setTime(formatedtargetDate);
			}catch(Exception e) {
				throw new Exception("invalid date is provided ,please check the input date");
			}
				
				int targetMonth = calendar.get(Calendar.MONTH);
				int targetYear = calendar.get(Calendar.YEAR);
				int targetday = calendar.get(Calendar.DAY_OF_MONTH);
		        driver.findElement(By.id("first_date_picker")).click();
		        
		        //Dec 29
		        String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		        calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				int currentMonth = calendar.get(Calendar.MONTH);
				int currentYear = calendar.get(Calendar.YEAR);
				
				while(currentMonth < targetMonth || currentYear < targetYear )
				{
					driver.findElement(By.className("ui-datepicker-next")).click();
					currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				    calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				    currentMonth = calendar.get(Calendar.MONTH);
					currentYear = calendar.get(Calendar.YEAR);
				}
				
//				while(currentMonth > targetMonth || currentYear > targetYear )
//				{
//					driver.findElement(By.cssSelector("a[data-handler='prev']")).click();
//					currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
//				    calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
//				    currentMonth = calendar.get(Calendar.MONTH);
//					currentYear = calendar.get(Calendar.YEAR);
//				}
				if(currentMonth == targetMonth && currentYear == targetYear )
					driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+targetday+"]")).click();
				else
					throw new Exception("unable to select the date because of current and arget dates mismatch");
				
				//System.out.println(formatedtargetDate);
			
		}catch(java.text.ParseException e1) {
//		System.out.println(formatedtargetDate);
			e1.printStackTrace();
		}

	}

}
