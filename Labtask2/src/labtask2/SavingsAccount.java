
package labtask2;


public class SavingsAccount extends Account {
    double interestRate;
    
    SavingsAccount ()
    {
        
    }
    SavingsAccount (String accountinfo,double balance,double interestRate)
    {
        super(accountinfo,balance);
        this.interestRate = interestRate;
        
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }
       
    
}
