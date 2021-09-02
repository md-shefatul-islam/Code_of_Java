
package pkgfinal;


public class Final {

    final String  a ="me";
    final int fee;
    
    Final(){ // only constre=uctor can set thr value
        fee= 100;
     }
   
    
    static final int fees;
    
    static{
        fees= 200;
    }
    
    void dispay()
    {
    //a="b";  erroe because on value cannot be assign
        System.out.println(a);
        System.out.println(fee);
        System.out.println(fees);
    }
    
    
}
