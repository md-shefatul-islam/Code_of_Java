
package referenceev;

public class A {
    
    int a;
    static void test(A i)
    {
        System.out.println("from test"+i.a);
    }
   
    public static void main(String[] args) {
        
     A a1=new A();
     test(a1);
    
     a1.a=10;
     test(a1);
        System.out.println("in main "+a1.a);
    }
    
}
