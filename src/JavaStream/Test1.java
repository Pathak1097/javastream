package JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Test1 {
	
	//@Test
	public void regular()
	{
	
	ArrayList<String> names= new ArrayList<String>();
	names.add("Abhijit");
	names.add("Don");
	names.add("Alekha");
	names.add("Adem");
	names.add("Ram");
	
	int count=0;
	for(int i=0; i<names.size(); i++)
	{
		String actualname =names.get(i);
		if(actualname.startsWith("A"))
		{
			count++;
		}
	}
	System.out.println(count);


	}
	
	@Test
	public void StreamFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekha");
		names.add("Adem");
		names.add("Ram");
		long c =names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(c);
		
		//there is no life for intermediate operartion if there is no terminal opertation
		//terminal will execute only if inetermediate operation (Filter) returns True
		//we can create Stream (dont need to create ArrayList)
		//we have used Filter in Stream Api
		Stream.of("Abhijit","Don","Alekha","Adem","Ram").filter(s->s.startsWith("A"));
		
		//terminal will execute only if inetermediate operation (Filter) returns True

		long d =Stream.of("Abhijit","Don","Alekha","Adem","Ram").filter(s->
		{
			s.startsWith("A");
		
			return false;
		}).count();
		
		System.out.println("Filter after return false => "+d);
		
		//print all names of array list
		names.stream().forEach(s->System.out.println(s));
		
		//print all character which length is more than 4 character
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("Length greater than 4 char =>"+s));
	
	// you can limit the output like only return one output
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("Only one result will come => "+s));
	
		//print name which length is less than 4 char
		names.stream().filter(s->s.length()<4).forEach(s->System.out.println("Names less than 4 char => "+s));
	
	
	for(int i=0; i<names.size(); i++)
	{
		String exp = names.get(i);
		if(exp.length()<4)
		{
			System.out.println("char les 4 char by for loop => "+exp);
		}
	}
	
	
	
	
	
	}
	
}
