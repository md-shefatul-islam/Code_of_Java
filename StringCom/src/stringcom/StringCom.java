
package stringcom;

public class StringCom {

    public static void main(String[] args) {
        
        String pass="me";
        String pass2="me";
        String pass3=new String("me");
        String pass4=new String("me");
        
        System.out.println(pass==pass);
        System.out.println(pass2==pass3);
        System.out.println(pass3==pass4);
        
        System.out.println("equal method");
        System.out.println(pass.equals(pass2));
        System.out.println(pass2.equals(pass3));
        System.out.println(pass3.equals(pass4));
       
        
        
    }
    
}
