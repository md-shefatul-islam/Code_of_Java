
package javabasic;

import java.util.Scanner;


public class Pattern {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.print("enter the num : ");
    int n=input.nextInt();


for(int i= 1 ; i<=n ; i++)
{
for(int j= 1 ; j<=i ; j++)
{
    //System.out.print(" "+i);  
    //System.out.print(" "+j);  
    System.out.print(" *");  
}
    System.out.println();
}
    
    }
    }

