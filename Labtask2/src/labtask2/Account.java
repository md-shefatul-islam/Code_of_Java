
package labtask2;


public class Account {
    
    String accountinfo;
    double balance;
    
    Account()
    {
        
    }
    Account(String accountinfo,double balance)
    {
        this.accountinfo=accountinfo;
        this.balance=balance;
    }

    public void setAccountinfo(String accountinfo) 
    {
        this.accountinfo = accountinfo;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public String getAccountinfo() 
    {
        return accountinfo;
    }

    public double getBalance() 
    {
        return balance;
    }
     
}
