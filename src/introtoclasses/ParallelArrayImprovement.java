package introtoclasses;

class MonthNameWithDayCount {
	String name;
	int dayCount;
	
	public MonthNameWithDayCount(String n, int c) {
		name = n;
		dayCount = c;
	}
}

public class ParallelArrayImprovement {

	public static void main(String[] args) {
		int[] daysInMonth = {  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
//		MonthNameWithDayCount jan = new MonthNameWithDayCount();
//		jan.name = "January";
//		jan.dayCount = 31;

		MonthNameWithDayCount jan = new MonthNameWithDayCount("January", 31);
		System.out.println("month name is " + jan.name);

	}

}
