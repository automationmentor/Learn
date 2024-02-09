package Important;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class learnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> first=new ArrayList<String>();
		first.add("one");
		first.add("two");
		first.add("three");
		first.add("four");
		first.add("five");
		System.out.println(first); // type sysout and ctrl+space
		System.out.println(first.contains("three"));
		
		System.out.println("------------labda expression------------");
		first.forEach((a)->System.out.println(a));
		
		System.out.println("------------for loop---------------------");
		for(String counter:first)
		{
			System.out.println(counter);
		}
		
		List<String> second=new ArrayList<String>();
		second.add("one");
		second.add("two");
		second.add("three");
		second.add("five");
		second.add("four");
		
		System.out.println("compare first with second:"+first.equals(second));
		
		// sort the list
		Collections.sort(first);
		Collections.sort(second);
		System.out.println("compare first with second after sort:"+first.equals(second));
		
		// array list with duplicate values
		List<String> third=Arrays.asList("one","two","three","four","five","five");
		
		// get unique arraylist
		List<String> listDistinct = third.stream().distinct().collect(Collectors.toList());
		Collections.sort(listDistinct);
		System.out.println(second.equals(listDistinct));
		
		

	}

}
