package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webvalidations01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
		System.out.println("Before clicking on Multicity radio button");
		System.out.println(driver.findElement(By.xpath("//a[contains(@class,'date_field_tab flL make_relative right')]")).isDisplayed());
		
		
		driver.findElement(By.xpath("//*[@id=\'trip_type\']/label[3]")).click();
		System.out.println("After clicking on Multicity radio button");
		System.out.println(driver.findElement(By.xpath("//a[contains(@class,'date_field_tab flL make_relative right')]")).isDisplayed());
	
	}
}