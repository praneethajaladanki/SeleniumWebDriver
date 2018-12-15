package project001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/ul[1]/li[1]/a[1]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandles());
		
		Set<String>windowids = driver.getWindowHandles();
		Iterator<String>windowint = windowids.iterator();
		String parentid = windowint.next();
		String childid = windowint.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='search-form']/input[1]")).sendKeys("Password change");
		 
		
		
	}

}
