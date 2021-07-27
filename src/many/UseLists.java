package many;

import java.util.ArrayList;
import java.util.List;

public class UseLists {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Fred");
		ls.add("Jim");
		ls.add("Sheila");
		System.out.println(ls);
		ls.add(1, "Alice");
		System.out.println(ls);
//		ls.remove(2);
		ls.remove("Jim");
		System.out.println(ls);
		System.out.println("name at index 1 is " + ls.get(1));
		ls.set(0, "Frederick");
		System.out.println(ls);

		/*
		 * use a List<String> for the month names add the names individually (PITA!
		 * sorry) use an array for the daysInMonth use "enhanced for loop" to extract
		 * the month names keep track of "index" yourself... use that index to access
		 * the days in the month print the whole lot :)
		 */

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		List<String> monthNames = new ArrayList<String>();
		monthNames.add("January");
		monthNames.add("February");
		monthNames.add("March");
		monthNames.add("April");
		monthNames.add("May");
		monthNames.add("June");
		monthNames.add("July");
		monthNames.add("August");
		monthNames.add("September");
		monthNames.add("October");
		monthNames.add("November");
		monthNames.add("December");

		int idx = 0;
		for (String name : monthNames) {
			System.out.println("Month " + name + " has " + daysInMonth[idx++] + " days");
		}
	}

}
