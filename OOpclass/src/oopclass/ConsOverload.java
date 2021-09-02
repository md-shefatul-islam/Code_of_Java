
package oopclass;


public class ConsOverload {
   
        String name,add;
        int p;
        
       ConsOverload()
      {
    }
       ConsOverload(String a,String b,int c)
       {
           name=a;
           add=b;
           p=c;
       }
       ConsOverload(String m,String n)
       {
           name=m;
           add=n;
       }
       
       void show()
       {
           System.out.println("name = "+name);
           System.out.println("add = "+add);
           System.out.println("phone = "+p);
       }
               
      
      
  
    }
    

