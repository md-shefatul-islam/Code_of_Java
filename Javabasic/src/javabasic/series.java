
package javabasic;

import java.util.Scanner;

public class series {
    public static void main(String[] args)
            {
                //int i, sum=0;
                double i, sum=0;
        Scanner input = new Scanner(System.in);
                System.out.print("enter the num : ");
                //int n= input.nextInt();
                double n = input.nextDouble();
                
          for(i=1 ; i<=n ; i++)
          //for(i=1 ; i<=n ; i=i+2)
          ///for(i=1.5 ; i<=n ; i++)
          {
              System.out.print(i+"x"+i+" ");
              sum=sum+i*i;
          }
                System.out.println();
                System.out.println(sum);
  
    
    }
    
}
