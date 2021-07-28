import java.util.List;

public class Reports {

	public static void customerNameReport(List<Account> inList) {
		System.out.println("=====-----=====-----Customer Name Report-----=====-----=====");
		System.out.println("|        account number           |         name           |");
		
		for (Account a : inList)
		{
			System.out.println("|              " + a.getObscuredAcct() + "              |" + a.get20ChName() + "    |");
		}
		System.out.println("=====-----=====-----     End Report     -----=====-----=====");

	}

	public static void HighBalReport(List<Account> inList) {
		System.out.println("=====-----=====-----High Balance Report-----=====-----=====");
		System.out.println("|      name          |     account num    |     balance   |");
		
		for (Account a : inList)
		{
			if (a.getBalanceNum() > 100000)
				{
				System.out.println("|" + a.get20ChName() + "|        " + a.getObscuredAcct() + "       |" + a.getFormattedAmount(a.getBalanceNum()) + "  |||");
				}
		}
		System.out.println("=====-----=====-----     End Report     -----=====-----=====");
	}
	
	public static void LowBalReport(List<Account> inList) {
		System.out.println("=====-----=====----- Low Balance Report-----=====-----=====");
		System.out.println("|      name          |     account num    |     balance   |");
		
		for (Account a : inList)
		{
			if (a.getBalanceNum() < 50)
				{
				System.out.println("|" + a.get20ChName() + "|        " + a.getObscuredAcct() + "       |" + a.getFormattedAmount(a.getBalanceNum()) + "  |||");
				}
		}
		System.out.println("=====-----=====-----     End Report     -----=====-----=====");
	}

}
