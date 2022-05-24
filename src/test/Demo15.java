package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.livspace.com/in");
		
		
		String path = "(//*[@class ='swiper-next arrow arrow-pos-right']//*[@class = 'icon-arrow-right-icon arrow-icon flex absolute left-50 top-50'])[1]";
		
 WebElement element = 	driver.findElement(By.xpath(path));


	

	String text = "(//*[@class = 'wrapper-class']/h1[@class = 'text-white md:text-center text-shadow mb-2 h1-hero'])[3]";
	
	String findString =" shape the future of home interiors, together";
	
	String s1 = 	driver.findElement(By.xpath(text)).getText();
		System.out.println(s1);
	   
		
		  if(!((driver.findElement(By.xpath(text)).getText()).contains(findString))) {
		  
		  element.click();
		  
		  }
		 
		
		 
	
	}
}
