
package javabasic;

import java.util.Scanner;


public class PalimdromNum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num : ");
    int n=input.nextInt();
    int rev=0;
    
    int temp = n;
    while(temp!=0)
    {
        int r=temp %10;
        temp = temp/10;
        rev= rev*10+r; //reverse the num

    }
        System.out.println("the reverse of num : "+rev);
        
        if(rev==n)
        {
            System.out.println("the num is palindrom");
        }
        else
        {
             System.out.println("the num is not palindrom");
        }
        }
}


    

