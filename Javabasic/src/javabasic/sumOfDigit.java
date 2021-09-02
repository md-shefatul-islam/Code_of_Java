
package javabasic;

import java.util.Scanner;


public class sumOfDigit {
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
        sum=sum+r;         //the sum of digit
        temp = temp/10;
        rev= rev*10+r; //reverse the num
        count++;   //will print num of the digit
    
    }
        System.out.println("the num of digits : "+count);
        System.out.println("the sum of digits : "+sum);
        System.out.println("the reverse of num : "+rev);
}
}

    

