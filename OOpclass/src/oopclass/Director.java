
package oopclass;


public class Director extends PartTimeEmployee {

    
    double ppercentage;
    
    /*public Director()
    {
        
    }*/
    
     public Director(double ppercentage,int whour,int pthpayment,String name,int age)
    {
       super(whour,pthpayment,name,age);
       this.ppercentage=ppercentage;
    }

    public double getPpercentage() 
    {
        return ppercentage;
    }

    public void setPpercentage(double p) 
    {
        this.ppercentage = p;
    }
   public void display()
     
   {
       System.out.println("Name = "+getName());
       System.out.println("Age = "+getAge());
       System.out.println("working hour="+getWhour());
       System.out.println("part hour payment = "+getPthpayment());
       System.out.println("part time salary = "+PartTimeSalary());
   }
    
}
