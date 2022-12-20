package JavaStream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollect {
	@Test
	public void collects()
	{
		// collect as List
		List<String> ls =Stream.of("Abhijit","Don","Alekha","Adem","Ram").filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toList());
	

		System.out.println(ls.get(0));
	
	// collect as Set
		Set<String> ls2=Stream.of("Abhijit","Don","Alekha","Adem","Ram").filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toSet());

		
	
	
	
	}

}
