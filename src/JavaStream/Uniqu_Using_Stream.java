package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Uniqu_Using_Stream {
	
	@Test
	public void demo()
	{
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7,1);
		
		//print Unique Element
		
		values.stream().distinct().forEach(s->System.out.println("Unique Element in Arrays => "+s));
		
		System.out.println("=============================================================");
		// print unique and sorte it 
		values.stream().distinct().sorted().forEach(s->System.out.println("Unique & Sorted  Element in Arrays => "+s));
		
		System.out.println("===============================================================");
		List<Integer> newvalues =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newvalues.get(2));

	}

}
