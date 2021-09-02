
package newpakage;

//public class B{ //1
public class B extends C{ //2
    
    public static void main(String[] args)
    {
      C c = new C();
      c.display();  //for private is erroe
      
      B b = new B();
     b.display();    //1// thids will be error
                       //2 is correct for default
                       // is correct for public
                       // is error for private
                       // is error for private
                       // only inherit is correct for protected
    }
    
}
