package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdowns {
	
public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
              
		Select s = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s.selectByValue("INR");
		s.selectByIndex(3);
		
		driver.quit();
       
        	

}


}
