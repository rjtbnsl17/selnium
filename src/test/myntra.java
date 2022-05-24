package test;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class myntra {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String[] numStrings = new String[500];
		int[] arr = new int[100];
		List<WebElement> result = new ArrayList<>();
		List<WebElement> prices = new ArrayList<>();
		List<WebElement> percentage = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();

		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		Actions action = new Actions(driver);

		WebElement men = driver.findElement(By.xpath("(//*[text()='Men'])[1]"));

		action.moveToElement(men).perform();

		WebElement tshirts = driver.findElement(By.xpath("//*[@href='/men-tshirts']"));

		tshirts.click();

		WebElement searchbox = driver.findElement(By.xpath("(//div[@class='filter-search-filterSearchBox']/span)[1]"));

		searchbox.click();
		WebElement placeholder = driver.findElement(By.xpath("//*[@placeholder='Search for Brand']"));

		placeholder.sendKeys("van heusen");
		

		// WebDriverWait wait = new WebDriverWait(driver, 15);

		// WebElement venHeusen = driver.findElement(
		// By.xpath("//*[@class='vertical-filters-label
		// common-customCheckbox']/input[@value='Van Heusen']"));

		// wait.until(ExpectedConditions.elementToBeClickable(venHeusen));
		// venHeusen.click();

		List<WebElement> venH = driver.findElements(By.xpath("//ul[@class='brand-list']/li"));
		for (int i = 0; i < venH.size(); i++) {

			if (venH.get(i).getText().equalsIgnoreCase("Van Heusen(114)")) {
				venH.get(i).click();
				break;

			}

		}
		try {
			result = driver.findElements(By.xpath("//li[@class='product-base']/a"));
			for (int i = 0; i < result.size(); i++) {

				System.out.println(result.get(i).getAttribute("href"));
				
				

			}
		} catch (Exception e) {
			result = driver.findElements(By.xpath("//li[@class='product-base']/a"));
			for (int i = 0; i < result.size(); i++) {

				System.out.println(result.get(i).getAttribute("href"));

			}
		}

		try {
			prices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

			for (int i = 0; i < prices.size(); i++) {

				// System.out.println(prices.get(i).getText());
				System.out.println(result.get(i).getAttribute("href") + prices.get(i).getText());
				
				

			}

		} catch (Exception e) {
			prices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

			for (int i = 0; i < prices.size(); i++) {

				// System.out.println(prices.get(i).getText());
				System.out.println(result.get(i).getAttribute("href") + prices.get(i).getText());

			}
		}

		try {
			prices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

			for (int i = 0; i < prices.size(); i++) {

				// System.out.println(prices.get(i).getText());
				
				
			//	System.err.println(result.get(i).getAttribute("href") + prices.get(i).getText());

			}

		} catch (Exception e) {
			prices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

			for (int i = 0; i < prices.size(); i++) {

				// System.out.println(prices.get(i).getText());
		//		System.err.println(result.get(i).getAttribute("href") + prices.get(i).getText());

			}
		}

		try {
			percentage = driver.findElements(By.xpath("//span[@class='product-discountPercentage']"));

			for (int i = 0; i < percentage.size(); i++) {

				numStrings[i] = percentage.get(i).getText();

				numStrings[i] = numStrings[i].replaceAll("[^0-9]", "");

				// System.out.println(numStrings[i]);
				arr[i] = Integer.parseInt(numStrings[i]);
				System.out.println(result.get(i).getAttribute("href") + prices.get(i).getText() + arr[i]);
				//System.out.println(arr[i]);
				
				
				

			}

		} catch (Exception e) {
			percentage = driver.findElements(By.xpath("//span[@class='product-discountPercentage']"));

			for (int i = 0; i < percentage.size(); i++) {

				numStrings[i] = percentage.get(i).getText();

				numStrings[i] = numStrings[i].replaceAll("[^0-9]", "");

				// System.out.println(numStrings[i]);
				arr[i] = Integer.parseInt(numStrings[i]);
				System.out.println(result.get(i).getAttribute("href") + prices.get(i).getText() + arr[i]);
				//System.out.println(arr[i]);

			}

		}

		List<Integer> sortPrice = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			
			sortPrice.add(arr[i]);

		}
		
for(int i=0;i<arr.length;i++) {
	
	map.put(result.get(i).getAttribute("href"), arr[i]);
	
}

//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->rever);
		 
		 

	}

}
