package many;

import java.util.Arrays;

public class UseArray {

	public static void main(String[] args) {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int idx = 2;
		System.out.println("days in month 3 are " + daysInMonth[idx]);
//		daysInMonth[0] = 100;
		System.out.println("array contains " + Arrays.toString(daysInMonth));
		System.out.println("there are " + daysInMonth.length + " months in a year");
//		System.out.println("element at index 12 is " + daysInMonth[daysInMonth.length]);	

		/*
		 * you will need a counter "index" that runs from 0 to 11 ("not 11" but length -
		 * 1) each time round the loop, increment that index by 1 in the
		 * "body of the loop" you need to print the indexth element of the array.
		 */

		for (int i = 0; i < daysInMonth.length; i++) {
			System.out.println("days in month " + monthNames[i] + " are " + daysInMonth[i]);
		}

		System.out.println("=================================");
		int itemNumber = 1;
		for (int value : daysInMonth) {
			System.out.println("Month number " + itemNumber++ + " has " + value + " days");
		}

		System.out.println("=================================");
		int itemIndex = 0;
		for (int value : daysInMonth) {
			System.out.println("Month number " + monthNames[itemIndex++] + " has " + value + " days");
		}
		
//		System.out.println(Arrays.toString(daysInMonth));
//		daysInMonth[12] = 99;
		System.out.println("=================================");
		
		String[] names = { "Fred", "Jim" };
		String[] moreNames = new String[3];
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(moreNames));
//		for (int i = 0; i < names.length; i++) {
//			moreNames[i] = names[i];
//		}

		System.arraycopy(names, 0, moreNames, 0, names.length);
		moreNames[2] = "Sheila";
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(moreNames));

		names = moreNames;
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(moreNames));

		System.out.println("=================================");
		
		int theMonth = 3;
		System.out.println("Month index " + theMonth + 
				" is called " + monthNames[theMonth] +
				" and has " + daysInMonth[theMonth] +
				" days");
	}

}
