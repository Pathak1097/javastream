package JavaStream;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class StreamShorts {

	@Test
	public void sorts()
	{
		String [] name = {"Azbhijit","Don","Alekha","Adem","Ram"};
		
		//convert the Array into ArrayList
		
		List<String> names = Arrays.asList(name);
		
		//print names which first letter start with A with Upper cases and sorted
		
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println("sorted and mapped names => "+s));
	
		// sort all the data
	names.stream().sorted().forEach(s->System.out.println("All sorted names => "+s));
	
	
	
	
	}
}
