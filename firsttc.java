package project001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//selenium code
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        driver.navigate().to("https://mail.google.com/mail/u/0/");
        Thread.sleep(100000);
        driver.close();
        
        
        
        
	}

}
