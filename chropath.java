package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chropath {

	
	
	
public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        //driver.navigate().to("https://mail.google.com/mail/u/0/");
        //Thread.sleep(100000);
        //driver.close();
        
		//driver.findElement(By.cssSelector("body.hp.vasq:nth-child(2) div.ctr-p:nth-child(1) div.jhp.big:nth-child(7) form.tsf.nj:nth-child(5) div.A8SBwf:nth-child(1) div.RNNXgb:nth-child(2) div.SDkEP div.a4bIc > input.gLFyf.gsfi:nth-child(3)")).sendKeys("Hello!");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("goodjob");;
}

}
