
package javabasic;

import java.util.Scanner;


public class Arrayinput1 {
    public static void main(String[] args)
    {
          double[] a= new double[4]; 
        Scanner input = new Scanner(System.in);
        System.out.println("take array input : ");
        a[0]=input.nextDouble();
        a[1]=input.nextDouble();
        a[2]=input.nextDouble();
        a[3]=input.nextDouble();
        
        double sum1 = a[0]+ a[1]+ a[2] + a[3] ;
        
        System.out.println("sum1 "+sum1);
        
        for(int i=0 ; i<4 ; i++)
        {
          a[i]=input.nextDouble(); 
            System.out.println("a : "+a[i]);
        }
    }
    
}
