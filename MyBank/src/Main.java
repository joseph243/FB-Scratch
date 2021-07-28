import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Account a22222 = new Account(22222, 50.00, "Steve", "Jobs");
		Account a22223 = new Account(22223, 500000.00, "Janet", "Jetson");
		Account a22224 = new Account(22224, 4.12, "Fred", "Erick");
		Account a32457 = new Account(32457, 800.54, "Smantha", "Amstien");
		Account a67390 = new Account(67390, 165, "Joe", "Vandz");
		
		List<Account> accountsList = new ArrayList<>();
		
		accountsList.add(a67390);
		accountsList.add(a22222);
		accountsList.add(a32457);
		accountsList.add(a22224);
		accountsList.add(a22223);
		
		for (Account a : accountsList)
		{
			System.out.println(a);
			a.withdrawal(85.00);
			
		}
		a67390.withdrawal(90);
		
		Reports.customerNameReport(accountsList);
		System.out.println();
		System.out.println();
		Reports.HighBalReport(accountsList);
		System.out.println();
		System.out.println();
		Reports.LowBalReport(accountsList);

	}

}
