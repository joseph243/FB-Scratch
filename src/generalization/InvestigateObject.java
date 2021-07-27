package generalization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvestigateObject {

	public static void breakAList(List l) {
		l.add(0, LocalDate.now());
	}
	
	public static void main(String[] args) {
		Object o = "Hello";
		Object o2 = LocalDate.now();
		
		System.out.println("o is " + o.toString());
		System.out.println("o2 is " + o2.toString());
		
		Object[] oa = { o, o2 };
		System.out.println(Arrays.toString(oa));

		String s = "Hello";
		System.out.println("String length is " + s.length());
//		System.out.println("Object length is " + o.length());
		
		System.out.println("type of o is " + o.getClass());
		
//		List<String> names = new ArrayList<String>(Arrays.asList(/* LocalDate.now(), */"Albert"));
		List<String> names = new ArrayList<>(Arrays.asList(/* LocalDate.now(), */ "Albert"));
		names.add("Fred");
		names.add("Jim");
		System.out.println(names);
		
		String nameOne = names.get(0);
		System.out.println("nameOne is " + nameOne);
		breakAList(names);
		nameOne = names.get(0);
	}

}
