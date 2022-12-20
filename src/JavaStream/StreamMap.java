package JavaStream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamMap {
	@Test
	public void mapping()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekha");
		names.add("Adem");
		names.add("Ram");
		
		
		
		// map (Modify the data ) is used to manipulate the data
		
		//print all names in ascending order
		names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(" In upperCases => " +s));
		
		// print names in upperCase but length should be more than 4 char
		names.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println("By Filtering the data => "+s));
		
		//Filter is used to filter as per your conditions
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println("By Filtering the data End with A char => "+s));
	}

}
