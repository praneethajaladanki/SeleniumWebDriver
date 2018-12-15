package project001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1. Give the count of links on page
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530465\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://www.qaclickacademy.com/practice.php");
		        
		        driver.manage().window().maximize();
		        System.out.println(driver.findElement(By.tagName("a")).getSize());
		        
		        
		  //2. Count of links on footer on page
		      WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		      System.out.println(footerdriver.findElements(By.tagName("a")).size());
		      
		  //3. Count of links on footer of the first column
		      
		      WebElement columndriver = driver.findElement(By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[1]/ul"));
		      System.out.println(columndriver.findElements(By.tagName("a")).size());
	
		  //4. Click on each link in the column and check of they are opening
		        
		      for(int i=0; i<columndriver.findElements(By.tagName("a")).size();i++) {
		    	 
		    	  
		    	  String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
		    	  
		    	 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		    	 
		    	 
		      }
		    	 Set<String>windowids = driver.getWindowHandles();
		    	 Iterator<String>windowint = windowids.iterator();
		    	 
		    	 while(windowint.hasNext()) {
			 			driver.switchTo().window(windowint.next());
			 			 			
			 			System.out.println(driver.getTitle());
		    }
		      
	}
}
		        
		        
	

