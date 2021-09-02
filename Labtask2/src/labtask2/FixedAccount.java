
package labtask2;


public class FixedAccount extends Account {

    
   int tenureYear;
   
   FixedAccount()
   {
       
   }
   FixedAccount(String accountinfo,double balance,int tenureYear)
   {
       super(accountinfo,balance);
       this.tenureYear=tenureYear;
   }

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    public int getTenureYear() {
        return tenureYear;
    }
  
}
