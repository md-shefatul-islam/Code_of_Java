
package javabasic;

import java.util.Scanner;

public class ArrMaxMin {
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
        double max=a[0] , min = a[0];
        int i,x=0,y=0;
        for( i=0 ; i<4 ; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                x=i;
            }
            
           if(a[i] < min)
           {
               min=a[i];
               y=i;
           }
        }
         System.out.println("index "+x+" & the max num : "+max);
         System.out.println("index "+y+" & the min num : "+min);
         
    }
    
}
