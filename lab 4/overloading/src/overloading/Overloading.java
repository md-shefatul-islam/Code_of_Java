
package overloading;


public class Overloading {

    void add(int a, int b)
    {
        System.out.println(a+b);   
    }
    
     void add(int a, int b,int c)
    {
        System.out.println(a+b+c);   
    }
      void add(int a, int b,int c, int d)
    {
        System.out.println(a+b+c+d);   
    }
      void add()
      {
          System.out.println("nothing to add");    
      }
    
}
