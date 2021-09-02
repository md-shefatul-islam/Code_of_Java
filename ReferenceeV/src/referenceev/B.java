
package referenceev;


public class B {
    
    int i=10;
    
    static void test(B b)
    {
        System.out.println("from test"+b.i);
        b.i=20;
        System.out.println("from 2nd test"+b.i);
    }
    public static void main(String[] args)
    {
        B s=new B();
        test(s);
        System.out.println("from main "+s.i);
        s.i=100;
        test(s);
        System.out.println("from main 2 = "+s.i);
    }
    
}
