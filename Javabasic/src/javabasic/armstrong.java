
package javabasic;

import java.util.Scanner;


public class armstrong {
    
        public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num : ");
    int n=input.nextInt();
    int count =0,sum=0, rev=0;
    
    int temp = n;
    while(temp!=0)
    {
        int r=temp %10;
        sum=sum+r*r*r;         //the sum of digit
        temp = temp/10;
       
    }
    
    if(sum==n)
        {
            System.out.println("the num is armstrong");
        }
        else
        {
             System.out.println("the num is not armostrong");
        }
     
       System.out.println("the sum of digits^3 : "+sum);
        
}
}
    
