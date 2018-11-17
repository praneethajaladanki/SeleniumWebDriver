package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfacebook {
	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        //driver.navigate().to("https://mail.google.com/mail/u/0/");
        //Thread.sleep(100000);
        //driver.close();
        
		driver.findElement(By.id("email")).sendKeys("princesspranu@yahoo.com");
		
		driver.findElement(By.id("pass")).sendKeys("Apple000");
		
		driver.findElement(By.xpath("//*[@value ='Log In']")).click();
		//driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
	
		
		
		
		
		
	}
}
