package dao;

public  class Account {
	static final double MIN_BALANCE = 500;
	static final double  DEFAULT_WITHDRAW_LIMIT = 500;
	
	private int accId;
	private String accType;
	private String accPin;
	private double accBalance = 0;
	private double withdrawLimit = DEFAULT_WITHDRAW_LIMIT;	
	
	public Account()
	{
		accId = -1;
		accType="";
		accPin="";
	}
	
	Account(int accId, String accType, String accPin, double accBalance)
	{
		this.accId = accId;
		this.accType = accType;
		this.accPin = accPin;
		this.accBalance = accBalance;
	}
	
	Account(int accId, String accType, String accPin, double accBalance, double withdrawLimit)
	{
		this.accId = accId;
		this.accType = accType;
		this.accPin = accPin;
		this.accBalance = accBalance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void setAccountDetails(int accId, String accType, String accPin, double accBalance)
	{
		this.accId = accId;
		this.accType = accType;
		this.accPin = accPin;
		this.accBalance = accBalance;
	}
	
	public void printAccountDetails()
	{
		//System.out.println(accId + " " + accType + " " + accPin + " " + accBalance);
		System.out.println(this);
	}
	
	public double updateBalance(double amount)
	{
		if((accBalance+amount < MIN_BALANCE) || (amount < -withdrawLimit))
			return accBalance;
		else
		{
			accBalance+=amount;
			return accBalance;
		}
	}
	
	public double deposit(double amount)
	{
		if(amount<0)
			return accBalance;
		else
		{
			accBalance+=amount;
			return accBalance;
		}
	}
	
	public double withdraw(double amount)
	{
		if(amount > withdrawLimit)
		{
			return accBalance;
		}
		else if((accBalance - amount) < MIN_BALANCE)
		{
			return accBalance;
		}
		else
		{
			accBalance-=amount;
			return accBalance;
		}
		
	}
	
	
	public int getAccId() {
		return accId;
	}

	public String getAccType() {
		return accType;
	}

	public boolean checkPin(String accPin) {
		return(this.accPin.equals(accPin));
	}

	public double getAccBalance() {
		return accBalance;
	}

	
	
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public String toString()
	{
		return("\tAccount ID: " + accId + "\n"
				+"\tAccount Type: " + accType + "\n"
				+"\tAccount Balance: " + accBalance + "\n"
				+"\tWithdraw Limit: " + withdrawLimit);
	}

	public String getAccPin() {
		return accPin;
	}

	public void setAccPin(String accPin) {
		this.accPin = accPin;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
}
