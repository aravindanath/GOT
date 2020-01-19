package javaCollcetions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG.Browser;

public class ListOfLang extends Browser {

	
	
	@Test
	public void getList() {
		
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		System.out.println("Count of lang "+lang.size());
		List<String> sortLang = new ArrayList<String>();
		for(WebElement ele : lang) {
//			System.out.println(ele.getText());
			sortLang.add(ele.getText());
		}
		
		System.out.println("UN-Sorted value "+sortLang );
		Collections.sort(sortLang);
	
		System.err.println("Sorted value "+sortLang );
		
	}
}
