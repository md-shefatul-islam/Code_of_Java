
package javabasic;

import java.util.Scanner;


public class CeltoFarn {
    
    public static void main(String[] args)
    {
    Scanner input= new Scanner(System.in);
            int c,f;
            System.out.print("enter the celsius :");
            c=input.nextInt();
            
            f=((9/5)*c)+32;
            System.out.println("the fahrenhiet :"+f);
    }
    
}
