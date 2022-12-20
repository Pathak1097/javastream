package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Pagination {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\New Sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.xpath("//tr//th[1]")).click();
				
		//capture all webelement into the list
	  List<WebElement> elemntlist =driver.findElements(By.xpath("//tr//td[1]"));
	  
	  //scan the price of Beans from table
	  List<String> price;
	  do
	  {
		  List<WebElement> rowlist =driver.findElements(By.xpath("//tr//td[1]"));
		  
	  price = rowlist.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceveggie(s)).collect(Collectors.toList());
	
	price.forEach(a->System.out.println("price of Rice is =>"+a));
	
	if(price.size()<1)
	{
	  driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	}
	  }while(price.size()<1);
	
	}

	private static String getPriceveggie(WebElement s) {
		String value =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
