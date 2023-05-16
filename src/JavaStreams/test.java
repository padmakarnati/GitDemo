package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test {
	//@Test
	public void regular() {
		ArrayList<String> List=new ArrayList<String>();
		List.add("Anand");
		List.add("Don");
		List.add("aniketh");
		List.add("goutham");
		List.add("Abhi");
		List.add("Balu");
		int count=0;
		for(int i=0;i<List.size();i++) {
			String actual=List.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	@Test
	public void streams() {
		ArrayList<String> List=new ArrayList<String>();
		List.add("Anand");
		List.add("Don");
		List.add("aniketh");
		List.add("goutham");
		List.add("Abhi");
		List.add("Balu");
		
		//there is no life intermediate op if there is no terminal op\
	    //terminal op will execute only if the intermediate op will return true
		//we can create streams
		//how to use filter in stream API
		long c=List.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		long d=Stream.of("Anand","Don","abhiram","jai","Aniketh").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		List.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		
		
		
		
		
		
	} 

	@Test
	public void streammap() {
		ArrayList<String> List=new ArrayList<String>();
		List.add("anurup");
		List.add("dilip");
		List.add("aniketh");
		List.add("goutham");
		List.add("Abhi");
		List.add("Balu");
		
		//print the names which ends with a and in uppercase
		Stream.of("Ananda","Don","abhirama","jai","Aniketh").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print the names which starts with a and in sorted uppercase
		List<String> names=Arrays.asList("Ananda","Don","abhirama","jai","Aniketh");
		names.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two lists
		
		Stream<String> newlist=Stream.concat(List.stream(), names.stream());
		
		newlist.sorted().forEach(s->System.out.println(s));
		
		Boolean flag=newlist.anyMatch(s->s.equalsIgnoreCase("dilip"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamcollect() {
		
		List<String> ls=Stream.of("Ananda","Don","abhirama","jai","Aniketh").filter(s->s.startsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		List<Integer> li=Arrays.asList(2,5,7,8,4,67,9,4);
		//print unique numbers and give the 3rd value
		
		li.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> values= li.stream().distinct().collect(Collectors.toList());
		System.out.println(values.get(3));
		
		
	}

}
