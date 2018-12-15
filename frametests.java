package project001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frametests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        //To find how many frames are there in the webpage
        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        
       //driver.findElement(By.id("draggable")).click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        
        Actions act123 = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        
        act123.dragAndDrop(source, target).build().perform();
        
        System.out.println("Drag and drop performed");
        
        //How to come out of the frame and come back to the default content
        
        driver.switchTo().defaultContent();
	}

}
