package test;

import java.util.HashMap;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstClass {

	@Test
	public void newmethod() {
		String wordString = "My name is rajat Bansal My name is Rajat Bansal";
	 wordString =	wordString.toLowerCase();
		String[] name = wordString.split(" ");

		HashMap<String, Integer> map1 = new HashMap<>();

		
		for(int i=0; i<name.length;i++) {
	
			
		Integer value = map1.get(name[i]);
		
		if(value==null) {
			map1.put(name[i], 1);
		
		}else {
			map1.put(name[i], map1.get(name[i])+1);
		}
		
		
		}
		System.out.println("occurence of words :" +map1 );

	}

}
