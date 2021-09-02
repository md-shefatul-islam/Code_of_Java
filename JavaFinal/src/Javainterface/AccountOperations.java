
package Javainterface;
import javafinal.Account;

public interface  AccountOperations {
    public void insertAccount(Account a);
    public void removeAccount(Account a);
    public Account getAccount(int accountNumber);
    
    void showAllAccounts();
}
