package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dyndropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
              
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")).click();
		//driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']/option[10]")).click();
		//*[@id="ctl00_mainContent_ddl_originStation1"]/option[10]
		
		//driver.quit();
        
        
        driver.findElement(By.xpath("//*[@id='familyandfriend']/label")).click();
        

	}

}
