
package javafinal;
import Javainterface.*;
public class Bank implements CustomerOperations {
    
   public Customer  customers;
    public Employee employees; 

    public Customer getCustomers() {
        return customers;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    
    @Override
    public void setCustomer(Customer c)
    {
        
    }
   @Override
    public void getCustomer(int nid)
    {
        
    }
   @Override
    public void insertCustomer(Customer c)
    {
        
    }
   @Override
    public void removeCustomer(Customer c)
    {
        
    }
    
    public void showAllCustomer()
    {
        
    }

}
