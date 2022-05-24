package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class demo20 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/");
		
		
		driver.findElement(By.xpath("//*[text() ='Date pickers']")).click();
		
		driver.findElement(By.xpath("(//*[text() ='Bootstrap Date Picker'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@placeholder ='Start date']"));
		
	element.click();
	
	
	
	
	
	
		
		driver.findElement(By.xpath("//*[@placeholder ='End date']")).click();
		
		
	}

}
