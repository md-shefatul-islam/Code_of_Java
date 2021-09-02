
package oopclass;



public class StaticVtest {
    public static void main(String[] x)
    {
    StaticV a= new StaticV("us");
    StaticV b= new StaticV("uss");
    
   a.show();
     
   StaticV.m="dead";    
    b.show();
        System.out.println("sfgghgff="+a.id); 
        System.out.println("     ");
        System.out.println(" me ="+StaticV.me);
    
    }
}
