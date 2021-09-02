import java.util.*;

class Main
{
	public static void main(String args[])
	{
		
		FixedAccount f1=new FixedAccount("12-32-01",1000000,5);
		System.out.println("account no is :"+f1.getAccountNo());
		System.out.println("balance  is :"+f1.getBalance());
		System.out.println("tenure year  is :"+f1.getTenureYear());
		
		System.out.println();
		
		SavingsAccount s1=new SavingsAccount("12-32-01",1000000,10);
		System.out.println("account no is :"+s1.getAccountNo());
		System.out.println("balance  is :"+s1.getBalance());
		System.out.println("interest rate is :"+s1.getInterestRate());
		
		System.out.println();
		
		
		Customer c2 = new Customer(1223,"Maira");
		FixedAccount f2=new FixedAccount("12-32-01",1000000,10);
		c2.setFixedAccount(f2);
		
		System.out.println("nid is :"+c2.getNid());
		System.out.println("name is :"+c2.getName());
		System.out.println("account no is :"+f2.getAccountNo());
		System.out.println("balance  is :"+f2.getBalance());
		System.out.println("tenure year  is :"+f2.getTenureYear());
		
		System.out.println();
		
		
		SavingsAccount s2 = new SavingsAccount("12-35-36",5000000,2);
		c2.setSavingsAccount(s2);
		
		System.out.println("nid is :"+c2.getNid());
		System.out.println("name is :"+c2.getName());
		System.out.println("account no is :"+s2.getAccountNo());
		System.out.println("balance  is :"+s2.getBalance());
		System.out.println("tenure year  is :"+s2.getInterestRate());
		
		
		
	}
}

		