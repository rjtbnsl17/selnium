package test;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class demo10 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver. findElement(By.xpath("//*[text()='Context Menu']")).click();
		
		WebElement element = driver.findElement(By.xpath("//*[@oncontextmenu='displayMessage()']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(element);
		driver.switchTo().alert().accept();
		
	}

}
