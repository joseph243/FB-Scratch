import java.text.DecimalFormat;

public class Account {

	private int accountNumber;
	private double balance;
	private String firstName;
	private String lastName;
	
	private DecimalFormat df = new DecimalFormat("###,###,##0.00");
	
	public Account(int accountNumber , double balance , String firstName , String lastName)
	{
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		if (accountNumber > 9999 && accountNumber < 100000)
		{ 
			this.accountNumber = accountNumber;
		}
		else 
		{
			System.out.println("account number must be 5 digits.  account number not assigned.  this could be an exception.");
		}
	}
	
	
	public boolean withdrawal(double transactionAmt)
	{
		if (transactionAmt > balance)
		{
			System.out.println("Transaction for $" + this.getFormattedAmount(transactionAmt) + " Rejected; Insufficient Funds. Balance = $" + this.getFormattedAmount(balance));
			return false;
		}
		else 
		{
			balance -= transactionAmt;
			System.out.println("Transaction for $" + this.getFormattedAmount(transactionAmt) + " Approved. Remaining balance = $" + this.getFormattedAmount(balance));
			return true;
		}
	}
	
	public String get20ChName()
	{
		StringBuilder name20 = new StringBuilder();
		name20.append(firstName + " " + lastName + " ");
		name20.setLength(20);
		return (name20.toString());
	}
	
	public String getObscuredAcct()
	{
		StringBuilder before = new StringBuilder();
		before.append(accountNumber);
		before.replace(0, 3, "XXX");
		return before.toString();
	}
	
	public String getFormattedAmount(double amount)
	{
		return df.format(amount);
	}
	
	public double getBalanceNum()
	{
		return balance;
	}
	
	@Override
	public String toString()
	{
		return ("Account #" + accountNumber + " is held by " + lastName + ", " + firstName + ", and has a balance of: $" + this.getFormattedAmount(balance));
	}
	
}
