package project001;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com/");

		System.out.println(" Before clikcing on Multi city Radio button");

		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

		System.out.println(" After clikcing on Multi city Radio button");

		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

		int i=0;

		while(i<5)

		{

		driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

		i++;

		}

		//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

		//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

	
		//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

		//If you want to validate the object which is present in web page or code base

		int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

		if (count==0)

		{

		System.out.println("verified");

		}

		//

		}

		}
		
		
		
		