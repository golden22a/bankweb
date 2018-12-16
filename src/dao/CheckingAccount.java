package dao;

public class CheckingAccount extends Account {
	static final double DEFAULT_OVERDRAFT = 5000;
	private static final double DEFAULT_WITHDRAW_LIMIT = 5000;
	
	private double overdraftAmount = 5000 ;
	
	CheckingAccount()
	{
		super();
		overdraftAmount = DEFAULT_OVERDRAFT;
	}
	
	CheckingAccount(int accId, String accPin, double accBalance)
	{
		super(accId,"chk",accPin,accBalance,DEFAULT_WITHDRAW_LIMIT);
		overdraftAmount = DEFAULT_OVERDRAFT;
	}
	
	CheckingAccount(int accId, String accPin, double accBalance, double withdrawLimit, double overdraft)
	{
		super(accId,"chk",accPin,accBalance,withdrawLimit);
		overdraftAmount = overdraft;
	}
		
	
	public void setAccountDetails(int accId, String accPin, double accBalance)
	{
		super.setAccountDetails(accId, "chk", accPin, accBalance);
		//this.overdraftAmount = overdraftAmount;
	}
	
	public void printAccountDetails()
	{
		System.out.println(this);
	}
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}
	
	public String toString()
	{
		return(super.toString() + "\n"
				+"\tOverdraftAmount: " + overdraftAmount);
	}

}
