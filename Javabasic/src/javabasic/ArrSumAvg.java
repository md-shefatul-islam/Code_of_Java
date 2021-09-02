
package javabasic;

import java.util.Scanner;


public class ArrSumAvg {
    public static void main(String[] args)
    {
      double[] a= new double[4]; 
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("enter the array ");
         for(int i=0 ; i<4 ; i++)
        {
          a[i]=input.nextDouble(); 
            System.out.println("array  "+a[i]);
        }
         
         
         
         double sum =0;
         for(int i=0 ; i<4 ; i++)
         {
             sum =sum+a[i];
         }
         System.out.println("the sum of array ; "+sum);
         
         System.out.println("the length of array : "+a.length); //give length
         double avg= sum/a.length;
         System.out.println("the avg of array ; "+avg);
       
         }
         
    }
    
