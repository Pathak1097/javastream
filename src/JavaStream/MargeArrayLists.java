package JavaStream;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MargeArrayLists {
	
	@Test
	public void margingsorts()
	{
	ArrayList<String> names= new ArrayList<String>();
	names.add("Abhijit");
	names.add("Don");
	names.add("Alekha");
	names.add("Adem");
	names.add("Ram");
	
	List<String> names2 =Arrays.asList("Prashant","Akshya","Kale","Rahul","Damu");
	
	// marge the both list and sort it also
	
	Stream<String> newstream = Stream.concat(names.stream(), names2.stream());
	
	// print all the marged stream
	                //newstream.forEach(s->System.out.println("All marged list =>"+s));
	
	//sorted order
	               //newstream.sorted().forEach(s->System.out.println("sorted marged list => "+s));
	
	
	//check that "prashant" is present in list or not
	//anyMatch metthod return True
	boolean flag =newstream.anyMatch(s->s.equalsIgnoreCase("prashant"));
	
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	
	
	
	
	}
}
