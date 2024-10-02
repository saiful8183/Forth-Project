package browserTest;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	
	
	

	
	@Test
public void browsertest() {
	


	System.setProperty("WebDriver.gecko.driver", "/Users/saifulchowdhury/Downloads/geckodriver");
	
	
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.wikipedia.org/");
	
	
	  List<WebElement> values=driver.findElements(By.tagName("option"));
	
	System.out.println("List of dropdown are "+values.size());
	System.out.println(values.get(1).getText());	
	
	
	for(int i=0;i<values.size();i++) {
		
		
	System.out.println(values.get(i).getText());	
		
		
		
	}
	driver.close();
	}
	
	
	
	@Test
	public void browsertest2() {
		
		
		
		//System.setProperty("WebDriver.gecko.driver", "/Users/saifulchowdhury/Downloads/geckodriver");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.wikipedia.org/");
		
		
		List<WebElement> values=driver.findElements(By.tagName("option"));
		
		System.out.println("List of dropdown are "+values.size());
		System.out.println(values.get(1).getText());	
		
		
		for(int i=0;i<values.size();i++) {
			
			
			System.out.println(values.get(i).getText());	
			
			
			
		
	
	
	
		}
		driver.close();
	
	}
}


	
	
	
	
	

