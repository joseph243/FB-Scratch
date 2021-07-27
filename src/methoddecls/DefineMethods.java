package methoddecls;

public class DefineMethods {
	
	public static int add(int a) {
//		int b = 99;
//		return a + b;
		return add(a, 99);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int ... ia) {
		int sum = 0;
		for (int i = 0; i < ia.length; i++) {
			sum += ia[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int [] values = { 1, 2, 3 };
		System.out.println("Sum of 1, 2, 3 is " + add(values));
		System.out.println("Sum of 1, 2, 3 is " + add(new int[]{ 1, 2, 3 }));
		System.out.println("Sum of 1, 2, 3 is " + add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}

}
