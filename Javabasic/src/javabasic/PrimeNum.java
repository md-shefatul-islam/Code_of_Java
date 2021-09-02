
package javabasic;

import java.util.Scanner;


public class PrimeNum {
    public static void main(String[] args)
    {
    int m,n,i,j;
    Scanner input = new Scanner(System.in);
  
        System.out.println("enter first positive  num : ");
        m=input.nextInt();
        
         System.out.println("enter last positive  num : ");
        n=input.nextInt();
        
        int count =0;
       for(j=m ; j<=n ; j++)
               { 
        for(i=2; i<j-1 ; i++)
        {
            if(j%i==0)
            {
             count++;
             break;
            }
            }
        if(count==0)
        {
            System.out.println("the num is prime : "+j);
        }
        else
        {
            System.out.println("the num is not prime : "+j);
        }
               }
    }
}
           
