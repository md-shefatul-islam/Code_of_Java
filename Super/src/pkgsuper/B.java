
package pkgsuper;


public class B extends A{
    int x =10;
    
    void display()
    {
        System.out.println(x);
        System.out.println(super.x);
    }
    
    //super keyward in method
    
    @Override
    void show()
    {
        super.show();
        System.out.println("in class B");
    }
    //cons overriding
    B()
    {
        System.out.println("inside B");
    }
}
