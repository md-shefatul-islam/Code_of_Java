
package javabasic;

import java.util.Scanner;

public class PatternT2 {
     public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.print("enter the num : ");
    int n=input.nextInt();


for(int i= 1 ; i<=n ; i++) //roe
{
for(int j= n-i+1 ; j>0 ; j--) //column
{
    //System.out.print(" "+i);  
    //System.out.print(" "+j);  
    System.out.print(" *");  
}
    System.out.println();
}

for(int i= 1 ; i<=n ; i++) //roe
{
for(int j= 1 ; j<=i ; j++)
{
    //System.out.print(" "+i);  
    //System.out.print(" "+j);  
    //System.out.print(" *");  
}
    System.out.println();
}
    
    }
    
}
