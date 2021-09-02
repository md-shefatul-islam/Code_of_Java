
package labtask2;

public class Start {
    public static void main(String[] args)
    {
       FixedAccount a= new FixedAccount("unknown",1000.0,5);
       SavingsAccount b= new SavingsAccount("known",1010.0,9.0);
       
        System.out.println("name"+a.getAccountinfo());
        System.out.println("balance"+a.getBalance());
        System.out.println("tenureYear"+a.getTenureYear());
        
        System.out.println("name"+b.getAccountinfo());
        System.out.println("balance"+b.getBalance());
        System.out.println("intetrestRate"+b.getInterestRate());
        
        System.out.println("");
        
    }
    
}
