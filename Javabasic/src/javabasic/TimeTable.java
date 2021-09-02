
package javabasic;

import java.util.Scanner;


public class TimeTable {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,m,i,j;
        System.out.println("enter limit num : ");
        n=input.nextInt();
        System.out.println("enter start num : ");
        m=input.nextInt();
        
        for(j=m ; j<=n ; j++)
        {
        for(i=1 ; i<=10 ; i++)
        {
            
            System.out.println(j+" x "+i+" = "+j*i);
        } 
        
        System.out.println();
        }
    }
    
}
