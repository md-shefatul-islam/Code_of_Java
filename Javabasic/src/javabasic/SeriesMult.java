
package javabasic;

import java.util.Scanner;

public class SeriesMult {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i,n, res=1 ;
        System.out.println("enter the num : ");
        n=input.nextInt();
        
        for(i=1 ; i<=n ; i++)
          {
              System.out.print(i+" ");
              res=res*i;
          }
                System.out.println();
                System.out.println(res);
    
    }
    
}
