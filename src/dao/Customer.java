package dao;

import com.sun.istack.internal.NotNull;

public class Customer {
	private int custId;
	@NotNull
	private String custName;
	@NotNull
	private String custAddress;
	@NotNull
	private String custPhone;
	
	public Customer()
	{
		custId = 0;
		custName="";
		custAddress="";
		custPhone="";
	}
	
	Customer(int custId, String custName, String custAddress, String custPhone)//, Account custAccount)
	{
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custPhone = custPhone;
	}	
	
	public void setCustomerDetails(int custId, String custName, String custAddress, String custPhone)
	{
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custPhone = custPhone;
	}
	
	public void printCustomerDetails()
	{
		System.out.println(this);
	}
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public int getCustId() {
		return custId;
	}
	
	public String toString()
	{
		return("ID: " + custId + "\n"
				+"Name: " + custName + "\n"
				+"Address: " + custAddress + "\n"
				+"Phone: " + custPhone );
	}
}
