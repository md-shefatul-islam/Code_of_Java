
package pkgsuper;
public class ABmain {
    public static void main(String[] args)
    {
        B c=new B();
        c.display();
        
        //super keyward in method
       B x=new B(); 
        x.show();
        
        
        System.out.println(c instanceof A);  //is a boject of A 
        System.out.println(c instanceof B);  //is a OBJECT Of B
        System.out.println("-------");
        A a;
        a=new B();
        a.show();
        System.out.println(a.x); //thus a is a refer variable of A
                                    //so can access all method and variable of A
          a.me();   
        
        //a.display();  ref variable can call only constructor and overridden method
        
    }
    
}
