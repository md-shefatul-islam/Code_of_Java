
package oopclass;


public class Employee {
    private String name;
    private int age;
    
    public Employee()
    {
        
    }
    
    public Employee(String name,int age)
    {
      this.name =name;
      this.age=age;
      
    }
    public Employee(String name)
    {
      this.name =name;
      
    }

     public void setName(String n) {
        name = n;
    }
     
    public String getName() {
        return name;
    }

    
     public void setAge(int a) {
        age = a;
    }
     
    public int getAge() {
        return age;
    }

}
