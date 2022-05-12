package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	/*
	Problem Statement
	1. Open Amazon.in
	2. Fetch all links in the Amazon.in homepage.
	3. Fetch the text from the links and remove the empty links.
	4. Remove duplicates.
	5. Sort the text in the alphabetical order.
	6. Print only the text starting with character C and D	
	*/
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		
		driver.findElements(By.xpath("//a"))
		.stream()
		.map(e->e.getText())
		.filter(s->!s.isEmpty())
		.distinct()
		.sorted()
		.filter(s->s.startsWith("C") || s.startsWith("D"))
		//.forEach(s->System.out.println(s));
		.forEach(System.out::println);
	
		/*
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		List<String> text = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			String temp = list.get(i).getText();
			
		if(!temp.isEmpty()) {
			text.add(temp);
		}
	}
		
  List<String> AfterDupRemove = new ArrayList<>(new HashSet<String>(text));
  Collections.sort(AfterDupRemove);
  
	for(int i=0;i<AfterDupRemove.size();i++) {
		if(AfterDupRemove.get(i).startsWith("D") || AfterDupRemove.get(i).startsWith("C") ) {
		System.out.println(AfterDupRemove.get(i));
		}
	} */
	
		

}
	
}
