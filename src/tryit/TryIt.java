package tryit;

public class TryIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!!");
		
		var x = 99;
		System.out.println("x is " + x);
		
		int temp = 75;
		int target = 72;
		int hysteresis = 2;
		if (temp > target) {
			System.out.println("turn on cooling");
		} else {
			System.out.println("turn on heating");
		}
		
		int count = 0;
		
		while (count < 3) {
			System.out.println("count is less than three " + count);
//			count = count + 1;
//			count += 1;
			count++;
		}
		
		for (int count2 = 5; count2 < 10; count2++) {
			
		}

		int c3 = 0;
		while (c3 > 0) {
			System.out.println("gosh, that's a surprise");
		}
		
		System.out.println("c3 is currently " + c3);
		do {
			c3++;
			System.out.println("loop is entered, value is " + c3);
		} while (c3 > 0);
		
		/*
		 * if / else
		 * while
		 * do while
		 * for ( x;y;z )
		 * for ( x : y )
		 * switch / case
		 */
		
/*
 * declare and initialize a value representing a temperature
 * declare and initialize another temperature (representing your thermostat :)
 * print a message indicating if the heating should be on (i.e. above target + hysteresis)
 *  or the cooling should be running (i.e. below target - hysteresis)
 *  if in the middle! print "all off"
 */
		
/* 
 * print out
 * 7
 * 5
 * 3
 * 1
 */
	}
}








