
package javabasic;

import java.util.Scanner;


public class FibonacciNum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("how many num : ");
        int n = input.nextInt();
        
        int x = 0;
        int y =1;
        int fibo;
        int i;
        
        System.out.print(x+" "+y);
        
        for(i=3; i<=n ; i++)
        {
            fibo = x+y;
            System.out.print(" "+fibo);
                    x=y;
                    y=fibo;
        }
        System.out.println("");
        }
        
    }
    

