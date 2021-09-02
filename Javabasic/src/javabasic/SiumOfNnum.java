
package javabasic;

import java.util.Scanner;


public class SiumOfNnum {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int sum=0;
        System.out.println("enter initial num");
        int n=input.nextInt();
        
        
        for(int i=1 ; i<=n ; i++)
        {
            //if(i%2==0)
            if(i%2!=0)
         sum=sum+i;
        }
      System.out.println("the sum : "+sum);
      double avg = sum/n;
      System.out.println("avg :"+avg);
    }
    
}
