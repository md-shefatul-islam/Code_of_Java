

package javafinal;
import Javainterface.*;

public abstract class Account implements ITransactions{
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void showInfo(){
        System.out.println("Account Number is :" +getAccountNumber());
        System.out.println("Balance is :" +getBalance());
    }
    
    
    
}
    
