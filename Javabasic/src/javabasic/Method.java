
package javabasic;

import java.lang.*;

public class Method {
    public static void main(String[] args)
    {
    String s1="hello java";
    String s2= new String();
    String s3 = new String("hello3");
    String s4 = "hello4";
    String s5 = new String("hello3");
    String s6 = "hello6";
    String s7 = new String("hello7");
    
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    
        System.out.println(s1.length());
        
        System.out.println(s3.charAt(1));
        System.out.println(s4.charAt(0));
        
        System.out.println(s1.concat(s3));
        
        System.out.println(s1);
        System.out.println(s3);
        
        if(s3==s5)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        if(s3.equals(s5))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
        }  
    }
   

