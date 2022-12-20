package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Search {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\New Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("ri");
		
		List<WebElement> prodlist =driver.findElements(By.xpath("//tr//td[1]"));
		
		List<String> filterlist =prodlist.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
	
		filterlist.forEach(a->System.out.println("Price of rice is => "+a));
	
	
	}

	private static String getPrice(WebElement s) {
		String value =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
