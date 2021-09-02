
package javabasic;

import java.util.Scanner;


public class addsubmuldiv {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int a,b,result;
        System.out.println("enter first num :");
        a=input.nextInt();
        
        System.out.println("enter second num :");
         b=input.nextInt();
        result=a+b;
        System.out.println("the sum is :"+result);
        
        result=a-b;
        System.out.println("the sub is :"+result);
        
        result=a*b;
        System.out.println("the multi is :"+result);
        
        double result1= (double) a/b;
        System.out.println("the divison is :"+result1);
    
    }
    
}
