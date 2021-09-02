
package javabasic;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayInput {
    public static void main(String[] args)
    {
        int[] n= new int[5];
        
        n[0]=1;
        n[1]=2;
        n[2]=3;
        n[3]=4;
        n[4]=5;
        
          int sum = n[0] + n[1]+n[2]+n[3];
        System.out.println("sum= "+sum);
        for(int i=0; i<5 ; i++)
                {
        System.out.println("the array : n["+i+"] = "+n[i]);
                }
        
        
        
        
    }
    }
    

