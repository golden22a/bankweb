package dao;

public class SavingAccount extends Account {
	//static final double DEFAULT_LIMIT = 500;
	static final float DEFAULT_INTEREST = 4.5f;
	static final double DEFAULT_WITHDRAW_LIMIT = 500;

	private float interestRate = DEFAULT_INTEREST;
	private double monthlyWithdrawLimit = 20;
	
	SavingAccount()
	{
		super();
	}
	
	SavingAccount(int accId, String accPin, double accBalance)
	{
		super(accId,"sav",accPin,accBalance, DEFAULT_WITHDRAW_LIMIT);
	}
	
	public SavingAccount(int accId, String accPin, double accBalance, double withdrawLimit, float interest, double monthlyLimit)
	{
		super(accId, "sav", accPin, accBalance, withdrawLimit);
		interestRate = interest;
		monthlyWithdrawLimit = monthlyLimit;
		
	}
	
	public void setAccountDetails(int accId, String accPin, double accBalance)
	{
		super.setAccountDetails(accId, "sav", accPin, accBalance);
	}
	
	public void printAccountDetails()
	{
		System.out.println(this);
	}
	
	
	public double getMonthlyLimit()
	{
		return monthlyWithdrawLimit;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString()
	{
		return(super.toString() + "\n"
				+"\tMonthly Withdraw Limit: " + monthlyWithdrawLimit);
		
		//return("\tAccount ID: " + accId + "\n"
		//		+"\tAccount Type: " + accType + "\n"
		//		+"\tAccount Balance: " + accBalance);
	}
}
