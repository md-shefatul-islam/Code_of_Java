import java.util.*;

class Account
{
	String accountNo;
	double balance;
	
	Account()
	{
	}
	Account(String accountNo,double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void setAccountNo(String accountNo)
	{
		this.accountNo=accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNo()
	{
		return accountNo;
	}
	public double getBalance()
	{
		return balance;
	}
}
