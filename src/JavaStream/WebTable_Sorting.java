package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_Sorting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\New Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		
		//capture all webelement into the list
		List<WebElement> elemntlist=	driver.findElements(By.xpath("//tr//td[1]"));
		List<String> originallist =elemntlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 -> sorted list
		List<String> sortedList =originallist.stream().sorted().collect(Collectors.toList());                           
	
	  //Compare Original list Vs Sorted List
		Assert.assertTrue(originallist.equals(sortedList));
	
	
	
	}

}
