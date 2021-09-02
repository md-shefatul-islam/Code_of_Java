
package oopclass;


public class student {
   private String name,gender;
    
    student() //default/empty comstructor
    {
        
    }
  
    student(String s,String n) //parameterized constructor
    {
        name=s;
        gender=n;
    }       
    void show()
    {
         System.out.println("name="+name);
        System.out.println("gender="+gender);
    }
    
}
