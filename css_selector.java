package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
              
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("goodjob");;

		//xpath = //tagName[@attribute='value'];
		//css = tagName[attribute=value];
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Hello!");
        driver.findElement(By.cssSelector("#password")).sendKeys("dots");
        	

}

}

