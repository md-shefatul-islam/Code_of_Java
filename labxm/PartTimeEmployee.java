class PartTimeEmployee extends Employee {


    int whour;
    int pthpayment;
    
    public PartTimeEmployee(){
        
    }
   
    public PartTimeEmployee(int whour,int pthpayment,String name,int age )
    {
       super(name,age);
       this.whour = whour;
       this.pthpayment=pthpayment;
       
    }
    public int PartTimeSalary()
    {
        return whour* pthpayment;
    }
    

     public void setWhour(int whour) {
         this.whour= whour;
    }
     
    public int getWhour() {
        return whour;
    }

    
     public void setPthpayment(int pthpayment) {
        this.pthpayment = pthpayment;
    }
     
    public int getPhpayment() {
        return pthpayment;
    }
    
    
}
