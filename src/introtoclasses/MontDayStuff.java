package introtoclasses;

import java.util.ArrayList;
import java.util.List;

class MonthDay {
	String name;
	int count;
	public MonthDay(String n, int c) {
		name = n;
		count = c;
	}
}

public class MontDayStuff {

	public static void main(String[] args) {
		List<MonthDay> lmd = new ArrayList<>();
		lmd.add(new MonthDay("January", 31));
		lmd.add(new MonthDay("February", 28));
		lmd.add(new MonthDay("March", 31));
		lmd.add(new MonthDay("April", 30));
		lmd.add(new MonthDay("May", 31));
		lmd.add(new MonthDay("June", 30));
		lmd.add(new MonthDay("July", 31));
		lmd.add(new MonthDay("August", 31));
		lmd.add(new MonthDay("September", 30));
		lmd.add(new MonthDay("October", 31));
		lmd.add(new MonthDay("November", 30));
		lmd.add(new MonthDay("December", 31));

		for (MonthDay md : lmd) {
			System.out.println(md.name + " has " + md.count + " days");
		}
		
		for (int i = 0; i < lmd.size(); i++) {
			MonthDay md = lmd.get(i);
			System.out.println(md.name + " has " + md.count + " days");
		}
	}

}
