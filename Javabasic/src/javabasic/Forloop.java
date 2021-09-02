
package javabasic;

import java.util.Scanner;


public class Forloop {
    
    
    public static void main(String[] args)
    { int[] a= new int[4]; 
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("enter the array ");
        
         for( int i=0 ; i<4 ; i++)
        {
          a[i]=input.nextInt(); 
            //System.out.println(a[i]);
        }
         
         int sum =0;
         for(int j: a)  //foreachloop
         {
             sum =sum+j; 
         }
         System.out.println("the sum of array ; "+sum);
         
         System.out.println("the length of array : "+a.length); //give length
         double avg= sum/a.length;
         System.out.println("the avg of array ; "+avg);
       
         
    }
}
         

            
