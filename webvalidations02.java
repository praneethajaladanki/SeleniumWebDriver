package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webvalidations02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
		//System.out.println("Before clicking on Multicity radio button");
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'holidays offers')]")).getText());
		
		
		
	}

}
