package project001;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class acts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        WebElement move1 = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        
        Actions act = new Actions(driver);
       //Moves to a specific element
        act.moveToElement(move1).contextClick().build().perform();
        
		//Enters keyword in Capital letters and selects the search word
        act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
     
		
      
	}

}
